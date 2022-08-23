package model.desconto;

import jdk.jfr.Description;
import model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoQuantidadeDeItens(new DescontoPorValor(
                new SemDesocnto()));
        return desconto.calcular(orcamento);
    }
}

