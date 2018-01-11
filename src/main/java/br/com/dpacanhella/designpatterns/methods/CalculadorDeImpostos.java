package br.com.dpacanhella.designpatterns.methods;

import br.com.dpacanhella.designpatterns.domain.Orcamento;
import br.com.dpacanhella.designpatterns.interfaces.Imposto;
import lombok.Data;

@Data
public class CalculadorDeImpostos {

    public void realizarCalculo(Orcamento orc, Imposto impostoQualquer) {
        double icms = impostoQualquer.calcula(orc);
        System.out.println(icms);
    }

}
