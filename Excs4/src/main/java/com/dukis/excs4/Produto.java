package com.dukis.excs4;

import java.util.Date;


public class Produto {
    int codProduto;
    String descricao;
    Date dataEntrada;
    String ufOrigem;
    String ufDestino;

    public Produto(int codProduto, String descricao, Date dataEntrada, String ufOrigem, String ufDestino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    @Override
    public String toString() {
        return "Produto " + codProduto + ": " + descricao + " (Origem: " + ufOrigem + ", Destino: " + ufDestino + ")";
    }
}