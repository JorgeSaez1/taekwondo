package com.temuco.taekwondo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
	
	@GetMapping("/")
    public String inicio() {
        // Devuelve la vista 'home.html' desde src/main/resources/templates/
        return "inicio";
    }

    @GetMapping("/historia")
    public String historia() {
        // Devuelve la vista 'about.html' desde src/main/resources/templates/
        return "historia";
    }
}