package models;

import java.time.LocalDate;

public class Financeiro {

    private Double valorConsulta;
    private String formaPagamento; // cartao, dinheiro, pix
    private String statusPagamento; // concluido, pendente

    public Financeiro(Double valorConsulta, String formaPagamento, String statusPagamento) {
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

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
}
