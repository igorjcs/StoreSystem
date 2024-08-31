package com.projeto.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerMain {

    @GetMapping("/adm")
    public String acessarPrincipal(){
        return "adm/home";
    }

}
