package br.com.dpacanhella.designpatterns.methods;

import br.com.dpacanhella.designpatterns.domain.Conta;
import br.com.dpacanhella.designpatterns.interfaces.Investimento;

public class RealizadorDeInvestimentos {

    public void realiza(Conta conta, Investimento investimento) {
        double resultado = investimento.calcula(conta);

        conta.deposita(resultado * 0.75);
        System.out.println("Novo saldo: " + conta.getSaldo());
    }
}
