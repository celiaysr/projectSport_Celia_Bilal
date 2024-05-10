package com.celiabilal.projectsport.controller;

import com.celiabilal.projectsport.entities.User;
import com.celiabilal.projectsport.services.UserService;
import com.celiabilal.projectsport.services.GenreService; // Importez GenreService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    private final UserService userService;
    private final GenreService genreService; // Injectez GenreService

    @Autowired
    public RegisterController(UserService userService, GenreService genreService) {
        this.userService = userService;
        this.genreService = genreService; // Initialisation de GenreService
    }

    @GetMapping("/register")
    public String displayRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("genres", genreService.getAllGenre()); // Utilisation de genreService
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "register";
        }

        userService.saveUser(user);

        return "redirect:/login";
    }
}
