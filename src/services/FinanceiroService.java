package services;

import models.Financeiro;
import models.StatusPagamento;

public class FinanceiroService {
    public void processarPagamento(Financeiro pagamento) {

        if (pagamento.getValorConsulta() <= 0) {
            pagamento.setStatusPagamento(StatusPagamento.REJEITADO);
            System.out.println("Pagamento rejeitado: valor inválido.");
            return;
        }

        switch (pagamento.getFormaPagamento()) {
            case DINHEIRO:
                pagamento.setStatusPagamento(StatusPagamento.CONCLUIDO);
                System.out.println("Pagamento em dinheiro aprovado.");
                break;

            case CARTAO:
                if (autenticarCartao()) {
                    pagamento.setStatusPagamento(StatusPagamento.CONCLUIDO);
                    System.out.println("Pagamento com cartão aprovado.");
                } else {
                    pagamento.setStatusPagamento(StatusPagamento.REJEITADO);
                    System.out.println("Pagamento com cartão rejeitado.");
                }
                break;

            case PIX:
                pagamento.setStatusPagamento(StatusPagamento.CANCELADO);
                System.out.println("Pagamento via PIX aprovado.");
                break;

            default:
                pagamento.setStatusPagamento(StatusPagamento.REJEITADO);
                System.out.println("Forma de pagamento desconhecida.");
                break;
        }
    }

    private boolean autenticarCartao() {
        return false;
    }

    public void cancelarPagamento(Financeiro pagamento) {
        if (pagamento.getStatusPagamento() == StatusPagamento.CONCLUIDO) {
            pagamento.setStatusPagamento(StatusPagamento.CANCELADO);
            System.out.println("Pagamento cancelado com sucesso.");
        } else {
            System.out.println("Não é possível cancelar um pagamento não aprovado.");
        }
    }
}