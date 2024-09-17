package com.projeto.sistema.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table (name= "venda")
public class Venda implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
