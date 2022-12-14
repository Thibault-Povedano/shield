package com.security.shield.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class ShieldController {
    @GetMapping("/")
    public String welcom(){
        return "Welcom to the SHIELD!";
    }

    @RolesAllowed("CHAMPION")
    @GetMapping("/avengers/assemble")
    public String avengers(){
        return "Avengers... Assemble";
    }

    @RolesAllowed("DIRECTOR")
    @GetMapping("/secret-bases")
        public String nick(){
        return ("Biarritz\n ๐" +
                "Bordeaux\n๐" +
                "La Loupe๐" +
                "Lille\n๐" +
                "Lyon\n๐" +
                "Marseille\n๐" +
                "Nantes\n๐" +
                "Orlรฉans\n๐" +
                "Paris\n๐"+"Reims\n๐" +
                "Strasbourg\n๐" +
                "Toulouse\n๐" +
                "Tours๐");
    }
}
