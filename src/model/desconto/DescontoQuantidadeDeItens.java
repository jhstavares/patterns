package model.desconto;

import model.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidadeDeItens extends Desconto{
    public DescontoQuantidadeDeItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQtdItens() > 5){
            return orcamento.getValorOrcamento().multiply(new BigDecimal("0.1"));
        }else {
            return proximo.calcular(orcamento);
        }
    }
}
