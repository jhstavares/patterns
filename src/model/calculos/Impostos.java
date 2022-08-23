package model.calculos;

import model.Orcamento;

import java.math.BigDecimal;

public interface Impostos {
    BigDecimal calcular (Orcamento orcamento);

}
