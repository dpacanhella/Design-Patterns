package br.com.dpacanhella.designpatterns.interfaces;

import br.com.dpacanhella.designpatterns.domain.Orcamento;

public interface Imposto {

    double calcula(Orcamento orc);
}
