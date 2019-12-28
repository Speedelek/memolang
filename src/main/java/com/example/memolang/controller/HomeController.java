package com.example.memolang.controller;

import com.example.memolang.entities.registration.User;
import com.example.memolang.repository.UserRepository;
import com.example.memolang.service.UserService;
import com.example.memolang.service.WordEngService;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWords;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWordsManager;
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
import java.util.List;
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

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("words", wordEngService.getEnglishWords());
        return "home_v1";
    }

    @RequestMapping("/allword")
    public String listAllWord(Model model){
       // model.addAttribute("pageTitle", "Test title");
       // model.addAttribute("footerText", "testFooter");
        //model.addAttribute("buffets", buffetService.getBuffetEntities());
        //model.addAttribute("words", wordEngService.getEnglishWords());

       // List<EnglishWords> englishWordsList = englishWords.stream().collect(Collectors.toList());
        //List<EnglishWords> englishWordsList = englishWords.stream().collect(Collectors.toList());
        //model.addAttribute("words", englishWordsList);
        EnglishWords englishWords1 = englishWords.stream().findFirst().get();
        //System.out.println(englishWords1.getEnglishWordId() + " " + englishWords1.getEnglishWord() +
        //        " " + englishWords1.getInSpeech() + " " + englishWords1.getInWriting() + " " + englishWords1.getPartOfSpeech());
        model.addAttribute("words",englishWords1);
        return "home_v2";
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

    /*@RequestMapping(value = "/quickplay", method = RequestMethod.POST)
    public String sendAnswers()*/



}
