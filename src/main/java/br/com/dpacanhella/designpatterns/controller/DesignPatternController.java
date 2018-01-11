package br.com.dpacanhella.designpatterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dpacanhella.designpatterns.domain.Conta;
import br.com.dpacanhella.designpatterns.domain.Orcamento;
import br.com.dpacanhella.designpatterns.interfaces.Imposto;
import br.com.dpacanhella.designpatterns.methods.Arrojado;
import br.com.dpacanhella.designpatterns.methods.CalculadorDeImpostos;
import br.com.dpacanhella.designpatterns.methods.Conservador;
import br.com.dpacanhella.designpatterns.methods.ICCC;
import br.com.dpacanhella.designpatterns.methods.ICMS;
import br.com.dpacanhella.designpatterns.methods.ISS;
import br.com.dpacanhella.designpatterns.methods.Moderado;
import br.com.dpacanhella.designpatterns.methods.RealizadorDeInvestimentos;

@RestController
@RequestMapping("/design-patterns")
public class DesignPatternController {

    @GetMapping
    public void calculador() {
        Orcamento orc = new Orcamento();
        orc.setValor(500.0);

        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calc = new CalculadorDeImpostos();
        calc.realizarCalculo(orc, iss);

        CalculadorDeImpostos calc2 = new CalculadorDeImpostos();
        calc2.realizarCalculo(orc, icms);

        CalculadorDeImpostos calc3 = new CalculadorDeImpostos();
        calc3.realizarCalculo(orc, iccc);

        Conta conta = new Conta();
        conta.setSaldo(100.0);

        Moderado moderado = new Moderado();
        Arrojado arrojado = new Arrojado();
        Conservador conservador = new Conservador();

        RealizadorDeInvestimentos realizar = new RealizadorDeInvestimentos();
        realizar.realiza(conta, moderado);

        RealizadorDeInvestimentos realizar2 = new RealizadorDeInvestimentos();
        realizar2.realiza(conta, arrojado);

        RealizadorDeInvestimentos realizar3 = new RealizadorDeInvestimentos();
        realizar3.realiza(conta, conservador);
    }
}
