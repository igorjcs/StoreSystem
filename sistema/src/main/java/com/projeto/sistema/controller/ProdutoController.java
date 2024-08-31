package com.projeto.sistema.controller;

import com.projeto.sistema.models.Produto;
import com.projeto.sistema.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/cadastroProduto")
    public String acessarCadastro(@ModelAttribute("produto") Produto produto) {
        return "adm/produto/cadastroProduto";
    }

    @GetMapping("/listarProduto")
    public String listarProduto(Model model) {
        model.addAttribute("listaProdutos", produtoRepository.findAll());
        return "adm/produto/lista";
    }

    @GetMapping("/editarProduto/{id}")
    public String editarProduto(@PathVariable("id") long id, Model model) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        if (produtoOptional.isPresent()) {
            model.addAttribute("produto", produtoOptional.get());
            return "adm/produto/cadastroProduto";
        } else {
            return "redirect:/listarProduto";
        }
    }

    @GetMapping("/removerProduto/{id}")
    public String removerProduto(@PathVariable("id") long id, Model model) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        produtoRepository.delete(produtoOptional.get());
        return listarProduto(model);
    }

    @PostMapping("/salvarProduto")
    public String salvarProduto(@ModelAttribute("produto") Produto produto, BindingResult result) {
        if (result.hasErrors()) {
            return "adm/produto/cadastroProduto";
        }
        produtoRepository.saveAndFlush(produto);
        return "redirect:/listarProduto";
    }
}
