package com.example.memolang.controller;

import com.example.memolang.entities.registration.User;
import com.example.memolang.games.AllQuestionResult;
import com.example.memolang.games.SimpleAnswer;
import com.example.memolang.repository.UserRepository;
import com.example.memolang.service.UserService;
import com.example.memolang.service.WordEngService;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWords;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWordsManager;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.HungarianWords;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.HungarianWordsManager;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.u_asd.UAsd;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.u_asd.UAsdManager;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.u_asd_play.UAsdPlay;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.u_asd_play.UAsdPlayManager;
import com.speedment.runtime.core.exception.SpeedmentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    private UserService userService;
    private UserRepository userRepository;

    private WordEngService wordEngService;

    @Autowired
    public void setWordEngService(WordEngService wordEngService){ this.wordEngService = wordEngService; }


    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    EnglishWordsManager englishWords;
    @Autowired
    HungarianWordsManager hungarianWords;
    @Autowired
    UAsdManager uAsd;
    @Autowired
    UAsdPlayManager uAsdPlay;

    @RequestMapping("/")    //nah
    public String home(Model model) {
        model.addAttribute("words", wordEngService.getEnglishWords());
        return "home_v1";
    }

    @RequestMapping("/allword")
    public String listAllWord(Model model){

        //EnglishWords englishWords1 = englishWords.stream().findFirst().filter(i -> i != null).get();
        List<EnglishWords> englishWordsList2 = englishWords.stream().filter(s -> !"doesnotexist".equals(s.getEnglishWord())).collect(Collectors.toList());
        model.addAttribute("words",englishWordsList2);
        return "home_v2";
    }

    @RequestMapping("/allhword")
    public String listAllHWord(Model model){
        List<HungarianWords> hungarianWordsList = hungarianWords.stream().filter(s -> !"doesnotexist".equals(s.getHungarianWord())).collect(Collectors.toList());
        model.addAttribute("words",hungarianWordsList);
        return "hungarian_list";
    }

    @RequestMapping("/profile")
    public String profile(Model model, @AuthenticationPrincipal UserDetails currentUser) {
        // model.addAttribute("user", userService.findByUsername(username));
        User user = (User) userService.findByUsername(currentUser.getUsername());
        model.addAttribute("user", user);
        return "profile";
    }


    @PostMapping("/delete")
    public String delete(@AuthenticationPrincipal UserDetails currentUser, HttpServletRequest request, HttpServletResponse response) {
        User user = (User) userService.findByUsername(currentUser.getUsername());
        // usersRoleSercive.deleteUsersRole(user);
        Long id = user.getId();
        userService.deleteById(Long.valueOf(id));
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "auth/login";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute User user, @AuthenticationPrincipal UserDetails currentUser, Model model, BindingResult bindingResult) {
        User currUser = (User) userService.findByUsername(currentUser.getUsername());
        if (user.getPassword() == "") {
            model.addAttribute("errorMessage", "Adj meg egy jelszót");
            bindingResult.reject("password");
        }
        if (bindingResult.hasErrors()) {
            return "profile_edit";
        } else {
            userService.deleteById(Long.valueOf(currUser.getId()));
            userService.userCheck(user);
            userService.updateUser(user);
            return "profile";
        }
    }


    @RequestMapping("/profile_edit")
    public String profileEdit(Model model, @AuthenticationPrincipal UserDetails currentUser) {
        User user = (User) userService.findByUsername(currentUser.getUsername());
        model.addAttribute("user", user);
        return "profile_edit";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {

        model.addAttribute("user", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String reg(ModelAndView modelAndView, Model model, @Valid User user, BindingResult bindingResult) {
        User userCheck = userRepository.findByEmail(user.getEmail());
        User userCheck2 = userRepository.findByUsername(user.getUsername());
        if (userCheck != null) {
            System.out.println("hiba email");
            model.addAttribute("errorMessage", "Már létezik ilyen email cím");
            bindingResult.reject("email");
            //return "registration";
        }
        if (userCheck2 != null) {
            System.out.println("hiba username");
            model.addAttribute("errorMessage", "Már létezik ilyen felhasználó");
            bindingResult.reject("username");
            //return "registration";
        }
        if (bindingResult.hasErrors()) {
            return "registration";
        } else {
            //log.info("Uj user!");
            userService.registerUser(user);
            return "auth/login";
        }
    }

    @RequestMapping(value = "/quickplay", method = RequestMethod.GET)
    public String getTenRandomEnglishWord(Model model){
        model.addAttribute("words", wordEngService.getTenRandomWord());
        //System.out.println(englishWords.stream().collect(Collectors.toList()));
        return "quickPlay";
    }

    @RequestMapping(value = "/simplequestion", method = RequestMethod.GET)
    public String askOneWord(Model model){
        //List<EnglishWords> englishWordsList2 = englishWords.stream().filter(s -> !"abandon".equals(s.getEnglishWord())).collect(Collectors.toList());

        Random rand = new Random();
        int rand_id = rand.nextInt(50);

        List<EnglishWords> oneWord = englishWords.stream().filter(s -> s.getEnglishWordId() == rand_id).collect(Collectors.toList());
        model.addAttribute("word", oneWord.get(0).getEnglishWord());
        System.out.println(oneWord.get(0).getEnglishWordId() + "     " + oneWord.get(0).getEnglishWord());
        //SimpleAnswer simpleAnswer = new SimpleAnswer(oneWord.get(0).getEnglishWordId(), oneWord.get(0).getEnglishWord(),1);

        model.addAttribute("questionCounter", 1);
        model.addAttribute("questionEnglishWordId", oneWord.get(0).getEnglishWordId());
        model.addAttribute("questionEnglishWord", oneWord.get(0).getEnglishWord());
        model.addAttribute("simpleAnswer", new SimpleAnswer());
        return "simpleQuestion";
    }



    @RequestMapping(value = "/simpleQuestion", method = RequestMethod.POST)
    public String answerTenWord(Model model, @ModelAttribute SimpleAnswer simpleAnswer){
        System.out.println(simpleAnswer.getQuestionedWordId() + "   " + simpleAnswer.getQuestionedWord() + "   " + simpleAnswer.getCounter() + "   " + simpleAnswer.getAnswer());

        if(simpleAnswer.getCounter() < 11){

            List<HungarianWords> correctAnswer = hungarianWords.stream().filter(s -> s.getHungarianWordId() == simpleAnswer.getQuestionedWordId()).collect(Collectors.toList());

            Optional<UAsd> uAsdOptional = uAsd.stream().filter(UAsd.ENGLISH_WORD_ID.equal(simpleAnswer.getQuestionedWordId())).findFirst();
            if(simpleAnswer.getAnswer().contentEquals(correctAnswer.get(0).getHungarianWord())){
                System.out.println("correct");
                //Optional<UAsd> uAsdOptional = uAsd.stream().filter(UAsd.ENGLISH_WORD_ID.equal(simpleAnswer.getQuestionedWordId())).findFirst();
                uAsdOptional.ifPresent(s -> {
                    if(s.getMemoPercent() < 100){
                        s.setMemoPercent((short) (s.getMemoPercent()+20));
                    }else{
                        s.setMemoPercent((s.getMemoPercent()));
                    }
                    uAsd.update(s);
                });

                UAsdPlay uAsdPlay1 = uAsdPlay.create().setQuestionedWordId(simpleAnswer.getCounter()).setQuestionedWord(simpleAnswer.getQuestionedWordId()).setResult(1);
                try {
                    uAsdPlay.persist(uAsdPlay1);
                }catch (SpeedmentException se){
                    System.out.println("Failed to persist " + uAsdPlay1 + ". " + se.getMessage());
                }

            }else{
                System.out.println("incorrect");
                uAsdOptional.ifPresent(s -> {
                    if(s.getMemoPercent() >= 20){
                        s.setMemoPercent((short) (s.getMemoPercent()-20));
                    }else{
                        s.setMemoPercent((s.getMemoPercent()));
                    }
                    uAsd.update(s);
                });

                UAsdPlay uAsdPlay1 = uAsdPlay.create().setQuestionedWordId(simpleAnswer.getCounter()).setQuestionedWord(simpleAnswer.getQuestionedWordId()).setResult(0);
                try {
                    uAsdPlay.persist(uAsdPlay1);
                }catch (SpeedmentException se){
                    System.out.println("Failed to persist " + uAsdPlay1 + ". " + se.getMessage());
                }
            }

            Random rand = new Random();
            int rand_id = rand.nextInt(50);
            List<EnglishWords> oneWord = englishWords.stream().filter(s -> s.getEnglishWordId() == rand_id).collect(Collectors.toList());
            model.addAttribute("word", oneWord.get(0).getEnglishWord());
            model.addAttribute("questionCounter", simpleAnswer.getCounter()+1);
            model.addAttribute("questionEnglishWordId", oneWord.get(0).getEnglishWordId());
            model.addAttribute("questionEnglishWord", oneWord.get(0).getEnglishWord());
            model.addAttribute("simpleAnswer", new SimpleAnswer());
            return "simpleQuestion";

        }else{
            List<UAsdPlay> allQuestionedWord = uAsdPlay.stream().filter(s -> s.getQuestionedWordId() != 1000 ).collect(Collectors.toList());
            /*List<EnglishWords> questionedWordList = new ArrayList<>();
            for(int i = 0 ; i < 11; i++){
                List<EnglishWords> oneWord = englishWords.stream().filter(s -> s.getEnglishWordId() == i).collect(Collectors.toList());
                questionedWordList.add(oneWord.get(0));
            }*/

            /*List<EnglishWords> allQuestionedWord1 =
                    englishWords.stream()
                            .filter(eng -> uAsdPlay.stream()
                                    .anyMatch(asd -> asd.getResult() != 3)).collect(Collectors.toList());
            */

            model.addAttribute("questionedWords", allQuestionedWord);
            model.addAttribute("finalResult", uAsdPlay.stream().filter(s -> s.getResult() == 1).count());

            uAsdPlay.stream().filter(UAsdPlay.QUESTIONED_WORD_ID.notEqual(1000))
                    .forEach(uAsdPlay.remover());
            System.out.println("END");
            return "result";
        }
    }

    @RequestMapping(value ="/result", method = RequestMethod.POST)
    public String answerOneWord(Model model, @ModelAttribute SimpleAnswer simpleAnswer){
        System.out.println(simpleAnswer.getQuestionedWordId() + "   " + simpleAnswer.getQuestionedWord() + "   " + simpleAnswer.getCounter() + "   " + simpleAnswer.getAnswer());

        List<HungarianWords> correctAnswer2 = hungarianWords.stream().filter(s -> s.getHungarianWordId() == simpleAnswer.getQuestionedWordId()).collect(Collectors.toList());

        if(simpleAnswer.getAnswer().contentEquals(correctAnswer2.get(0).getHungarianWord())){
            //if(simpleAnswer.getAnswer().contentEquals("asd")){
            model.addAttribute("res", "Correct");
        }else{
            model.addAttribute("res", "Incorrect");
        }
        return "result";
    }

}
