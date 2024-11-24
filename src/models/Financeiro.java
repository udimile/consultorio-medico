package models;

import java.time.LocalDate;

public class Financeiro {

    private Double valorConsulta;
    private FormaDePagamento formaPagamento; // cartao, dinheiro, pix
    private StatusPagamento statusPagamento; // concluido, pendente

    public Financeiro(Double valorConsulta, FormaDePagamento formaPagamento, StatusPagamento statusPagamento) {
        this.valorConsulta = valorConsulta;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public FormaDePagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaDePagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
}
