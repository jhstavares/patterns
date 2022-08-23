package model;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valorOrcamento;

    private int qtdItens;

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public Orcamento(BigDecimal bigDecimal, int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public Orcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }
}
