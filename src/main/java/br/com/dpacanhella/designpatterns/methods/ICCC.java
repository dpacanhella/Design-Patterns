package br.com.dpacanhella.designpatterns.methods;

import br.com.dpacanhella.designpatterns.domain.Orcamento;
import br.com.dpacanhella.designpatterns.interfaces.Imposto;
import lombok.Data;

@Data
public class ICCC implements Imposto {

    @Override
    public double calcula(Orcamento orc) {
        double total = 0.0;
        double valor = orc.getValor();

        if (valor < 1000.0) {
            total = valor * 0.5;
        } else if (valor >= 100 && valor <= 3000) {
            total = valor * 0.7;
        } else {
            total = valor * 0.8 + 30.0;
        }
        
        return total;
    }

}
