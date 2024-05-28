package com.dukis.exc3;

import java.util.Stack;


public class ControleDePilhaDeLivros {
  
    private Stack<Livro> pilhaDeLivros;

    public ControleDePilhaDeLivros() {
        pilhaDeLivros = new Stack<>();
    }

    // Método para adicionar um livro à pilha
    public void adicionarLivro(Livro livro) {
        pilhaDeLivros.push(livro);
        System.out.println("Livro \"" + livro.titulo + "\" adicionado à pilha.");
    }

    // Método para listar os livros da pilha
    public void listarLivros() {
        if (pilhaDeLivros.isEmpty()) {
            System.out.println("A pilha de livros está vazia.");
        } else {
            System.out.println("Livros na pilha:");
            for (Livro livro : pilhaDeLivros) {
                System.out.println("- " + livro);
            }
        }
    }
        public void retirarLivro() {
        if (pilhaDeLivros.isEmpty()) {
            System.out.println("A pilha de livros está vazia.");
        } else {
            Livro livroRemovido = pilhaDeLivros.pop();
            System.out.println("Livro removido: \"" + livroRemovido.titulo + "\".");
        }
    }

}