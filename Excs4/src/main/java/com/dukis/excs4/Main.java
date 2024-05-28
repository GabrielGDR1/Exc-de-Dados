package com.dukis.excs4;

import java.util.Date;


public class Main {

    public static void main(String[] args) {
       ControleDeDeposito controle = new ControleDeDeposito();

        // Simulação de adição de produtos
        controle.adicionarProduto(new Produto(1, "Caixa de ferramentas", new Date(), "SP", "RJ"));
        controle.adicionarProduto(new Produto(2, "Livros", new Date(), "MG", "BA"));
        controle.adicionarProduto(new Produto(3, "Eletrônicos", new Date(), "RS", "SC"));

        // Simulação de retirada de produtos
        controle.retirarProduto();
        controle.retirarProduto();
    }
}