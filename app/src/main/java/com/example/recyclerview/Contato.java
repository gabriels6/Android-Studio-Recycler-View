package com.example.recyclerview;

import java.io.Serializable;

public class Contato implements Serializable {
    private String nome;
    private String cel;

    public Contato(String nome, String cel) {
        this.nome = nome;
        this.cel = cel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }
}
