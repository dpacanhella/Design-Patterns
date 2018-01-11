package br.com.dpacanhella.designpatterns.methods;

import br.com.dpacanhella.designpatterns.domain.Conta;
import br.com.dpacanhella.designpatterns.interfaces.Investimento;

public class Conservador implements Investimento{

    @Override
    public double calcula(Conta conta) {
        return conta.getSaldo() * 0.08;
    }

}
