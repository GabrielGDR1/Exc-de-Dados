package com.dukis.exc3;


public class Livro {
    String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}