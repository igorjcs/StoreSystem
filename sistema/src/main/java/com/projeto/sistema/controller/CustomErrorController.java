package com.projeto.sistema.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Lógica para exibir uma página de erro personalizada
        return "error"; // Nome do template Thymeleaf para erros
    }

    public String getErrorPath() {
        return "/error";
    }

}
