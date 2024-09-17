package com.projeto.sistema.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table (name ="produto")
public class Produto implements Serializable {
    // atributos
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    private String categoria;
    private long codigoDeBarras;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public long getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(long codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
