package model.calculos;

import model.Orcamento;
import model.enums.TipoImposto;

import java.math.BigDecimal;

public class CaluculadoraDeImposto {
    public BigDecimal calcularImposto(Orcamento orcamento, Impostos impostos)    {
        return impostos.calcular(orcamento);

    }
}