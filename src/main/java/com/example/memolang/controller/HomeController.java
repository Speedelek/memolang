package com.example.memolang.controller;

import com.example.memolang.entities.registration.User;
import com.example.memolang.repository.UserRepository;
import com.example.memolang.service.UserService;
import com.example.memolang.service.WordEngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

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


    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("words", wordEngService.getEnglishWords());
        return "home";
    }

    @RequestMapping("/allword")
    public String listAllWord(Model model){
       // model.addAttribute("pageTitle", "Test title");
       // model.addAttribute("footerText", "testFooter");
        //model.addAttribute("buffets", buffetService.getBuffetEntities());
        model.addAttribute("words", wordEngService.getEnglishWords());
        return "home";
    }

    @RequestMapping("/profile")
    public String profile(Model model, @AuthenticationPrincipal UserDetails currentUser) {
        // model.addAttribute("user", userService.findByUsername(username));
        User user = (User) userService.findByUsername(currentUser.getUsername());
        model.addAttribute("user", user);
        return "profile";
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


    @RequestMapping("/quickplay")
    public String getTenRandomEnglishWord(Model model){
        model.addAttribute("words", wordEngService.getTenRandomWord());
        return "quickPlay";
    }

}
