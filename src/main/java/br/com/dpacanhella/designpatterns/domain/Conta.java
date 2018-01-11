package br.com.dpacanhella.designpatterns.domain;

import lombok.Data;

@Data
public class Conta {

    private double saldo;
    
    public void deposita(double valor) {
        this.saldo += valor;
    }
}
