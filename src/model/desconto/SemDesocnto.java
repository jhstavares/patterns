package model.desconto;

import model.Orcamento;

import java.math.BigDecimal;

public class SemDesocnto extends Desconto{

    public SemDesocnto(){
        super( null);
    }
    @Override
    public BigDecimal calcular(Orcamento orcamento) {

        return BigDecimal.ZERO;
    }
}
