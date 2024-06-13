package com.aj.SmartConnectPro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aj.SmartConnectPro.entities.User;
import com.aj.SmartConnectPro.forms.UserForm;
import com.aj.SmartConnectPro.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class PageController {
    @Autowired
    private UserService userService;
  
    @GetMapping("/home")
    public String loadHomePage(Model model){
        return "home";
    }

    //about route
    @RequestMapping("/about")
    public String aboutPage(Model model){
        System.out.println("About Page Loading");
        boolean isLogin = true;
        model.addAttribute("isLogin",isLogin);
        return "about";
    }

    //services
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Services Page Loading");
        return "services";
    }

    //contact page
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    //login page 
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    //Signup page 
    @GetMapping("/register")
    public String register(Model model){
        UserForm userForm = new UserForm();
        model.addAttribute("user",userForm);
        return "register";
    }


    //Processing registraiton page 
    @RequestMapping(value = "/do-register", method =RequestMethod.POST)
    public String processRegister(@Valid @ModelAttribute UserForm userForm, BindingResult rBindingResult , HttpSession session){
       
        //userform --> user 
        // User user = User.builder()
        // .name(userForm.getName())
        // .email(userForm.getEmail())
        // .password(userForm.getPassword())
        // .about(userForm.getAbout())
        // .phoneNumber(userForm.getPhoneNumber())
        // .profilePic("")
        // .build();


        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        user.setAbout(userForm.getAbout());
        user.setPhoneNumber(userForm.getPhoneNumber());
        user.setProfilePic(userForm.profilePic(" "));

         User savedUser= userService.saveUser(userForm);
        
        System.out.println(userForm);
        return "redirect:/register";
    }
}
