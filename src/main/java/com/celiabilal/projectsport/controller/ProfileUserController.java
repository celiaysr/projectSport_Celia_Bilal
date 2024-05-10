package com.celiabilal.projectsport.controller;

import com.celiabilal.projectsport.entities.Pathology;
import com.celiabilal.projectsport.entities.User;
import com.celiabilal.projectsport.services.PathologyService;
import com.celiabilal.projectsport.services.UserService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProfilUserController {

    @Autowired
    private UserService userService;
    @Autowired
    private PathologyService pathologyService;

    @GetMapping("/profile")
    public String showProfile(Model model) {
        // Récupérer l'utilisateur connecté
        //User currentUser = userService.getCurrentUser();

        //model.addAttribute("user", currentUser);

        List<Pathology> availablePathologies = (List<Pathology>) pathologyService.getAllPathology();

        // Passer les pathologies disponibles à la vue Thymeleaf
        model.addAttribute("availablePathologies", availablePathologies);

        return "profile";
    }
}
