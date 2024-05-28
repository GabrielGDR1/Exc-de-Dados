package com.dukis.excs4;

import java.util.Stack;


public class ControleDeDeposito {
       private static final int CAPACIDADE_MAXIMA = 10;
       private Stack<Produto> pilhaDeProdutos;

       public ControleDeDeposito() {
           pilhaDeProdutos = new Stack<>();
       }

       public void adicionarProduto(Produto produto) {
           if (pilhaDeProdutos.size() < CAPACIDADE_MAXIMA) {
               pilhaDeProdutos.push(produto);
               System.out.println("Produto adicionado à pilha.");
               exibirPilha();
           } else {
               System.out.println("Capacidade máxima alcançada. Não é possível adicionar mais produtos.");
           }
       }

       public void retirarProduto() {
           if (pilhaDeProdutos.isEmpty()) {
               System.out.println("A pilha de produtos está vazia.");
           } else {
               Produto produtoRetirado = pilhaDeProdutos.pop();
               System.out.println("Produto despachado: " + produtoRetirado);
               exibirPilha();
           }
       }

       public void exibirPilha() {
           if (pilhaDeProdutos.isEmpty()) {
               System.out.println("A pilha de produtos está vazia.");
           } else {
               System.out.println("Produtos na pilha:");
               for (int i = pilhaDeProdutos.size() - 1; i >= 0; i--) {
                   System.out.println("- " + pilhaDeProdutos.elementAt(i));
               }
           }
       }
}