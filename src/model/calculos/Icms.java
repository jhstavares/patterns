package model.calculos;

import model.Orcamento;

import java.math.BigDecimal;

public class Icms implements  Impostos{
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.1"));
    }
}
