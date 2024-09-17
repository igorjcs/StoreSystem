package com.projeto.sistema.controller;

import com.projeto.sistema.models.Produto;
import com.projeto.sistema.repository.ProdutoRepository;
import com.projeto.sistema.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class VendaController {

    @Autowired
    private VendaRepository vendaRepository;

    @GetMapping("/iniciarVenda")
    public String iniciarVenda(){
        return "adm/venda/iniciarVenda";
    }
}
