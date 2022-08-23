package model.desconto;

import model.Orcamento;

import java.math.BigDecimal;

public class DescontoPorValor extends Desconto {
    public DescontoPorValor(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValorOrcamento().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValorOrcamento().multiply(new BigDecimal("0.1"));

        } else {
            return proximo.calcular(orcamento);
        }
    }
}
