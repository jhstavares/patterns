package model.teste;

import model.Orcamento;
import model.desconto.CalculadoraDeDesconto;

import java.math.BigDecimal;

public class TesteDescontoMain {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 13);
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();

        System.out.println(calculadora.calcular(orcamento));



       }
}
