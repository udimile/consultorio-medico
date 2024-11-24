package main;

import models.*;
import services.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PacienteService pacienteService = new PacienteService(new ArrayList<>());
        ConsultaService consultaService = new ConsultaService(new ArrayList<>(), pacienteService, new MedicoService(new ArrayList<>()));
        RelatorioService relatorioService = new RelatorioService();
        FinanceiroService financeiroService = new FinanceiroService();
        MedicoService medicoService = new MedicoService(new ArrayList<>());

        do {
            System.out.println("*** GERENCIADOR CONSULTÓRIO MÉDICO: *** \n" +
                    "1 - CADASTRAR MÉDICO \n" +
                    "2 - CADASTRAR PACIENTE \n" +
                    "3 - AGENDAR CONSULTA \n" +
                    "4 - ATUALIZAR CONSULTA \n" +
                    "5 - REMOVER CONSULTA \n" +
                    "6 - LISTAR CONSULTAS \n" +
                    "7 - GERAR RELATÓRIO DE CONSULTAS \n" +
                    "8 - GERAR RELATÓRIO DE PACIENTES \n" +
                    "9 - PROCESSAR PAGAMENTO \n" +
                    "10 - CANCELAR PAGAMENTO \n" +
                    "11 - SAIR");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    Medico medico = medicoService.pedirDadosMedico();
                    medicoService.adicionar(medico);
                    break;
                case 2:
                    Paciente paciente = pacienteService.pedirDadosPaciente();
                    pacienteService.adicionar(paciente);
                    break;
                case 3:
                    Consulta consulta = consultaService.pedirDadosConsulta();
                    consultaService.adicionar(consulta);
                    break;
                case 4:
                    System.out.println("ID da Consulta a atualizar: ");
                    String idConsultaAtualizar = sc.nextLine();
                    Consulta consultaAtualizar = consultaService.getConsultas().stream()
                            .filter(c -> c.getIdConsulta().equals(idConsultaAtualizar))
                            .findFirst()
                            .orElse(null);
                    if (consultaAtualizar != null) {
                        consultaService.atualizar(consultaAtualizar);
                    } else {
                        System.out.println("Consulta não encontrada.");
                    }
                    break;
                case 5:
                    System.out.println("ID da Consulta a remover: ");
                    String idConsultaRemover = sc.nextLine();
                    Consulta consultaRemover = consultaService.getConsultas().stream()
                            .filter(c -> c.getIdConsulta().equals(idConsultaRemover))
                            .findFirst()
                            .orElse(null);
                    if (consultaRemover != null) {
                        consultaService.remover(consultaRemover);
                    } else {
                        System.out.println("Consulta não encontrada.");
                    }
                    break;
                case 6:
                    for (Consulta c : consultaService.getConsultas()) {
                        System.out.println(c);
                    }
                    break;
                case 7:
                    relatorioService.gerarRelatorioConsultas(consultaService.getConsultas());
                    break;
                case 8:
                    relatorioService.gerarRelatorioPacientes(pacienteService.getPacientes());
                    break;
                case 9:
                    Financeiro pagamento = new Financeiro(100.0, FormaDePagamento.CARTAO, StatusPagamento.PENDENTE);
                    financeiroService.processarPagamento(pagamento);
                    break;
                case 10:
                    Financeiro pagamentoCancelar = new Financeiro(100.0, FormaDePagamento.CARTAO, StatusPagamento.CONCLUIDO);
                    financeiroService.cancelarPagamento(pagamentoCancelar);
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (true);
    }
}