package br.com.dpacanhella.designpatterns.methods;

import br.com.dpacanhella.designpatterns.domain.Orcamento;
import br.com.dpacanhella.designpatterns.interfaces.Imposto;
import lombok.Data;

@Data
public class ICMS implements Imposto{

    @Override
    public double calcula(Orcamento orc) {
        return orc.getValor() * 0.1;
    }
}
