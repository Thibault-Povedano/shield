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
        return ("Biarritz\n 😀" +
                "Bordeaux\n😀" +
                "La Loupe😀" +
                "Lille\n😀" +
                "Lyon\n😀" +
                "Marseille\n😀" +
                "Nantes\n😀" +
                "Orléans\n😀" +
                "Paris\n😀"+"Reims\n😀" +
                "Strasbourg\n😀" +
                "Toulouse\n😀" +
                "Tours😀");
    }
}
