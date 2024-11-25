package services;

import interfaces.Gerenciamento;
import models.Consulta;
import models.Medico;
import models.Paciente;
import models.StatusConsulta;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaService implements Gerenciamento<Consulta>{

    private List<Consulta> consultas = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private PacienteService pacienteService;
    private MedicoService medicoService;

    public ConsultaService(List<Consulta> consultas, PacienteService pacienteService, MedicoService medicoService) {
        this.consultas = consultas;
        this.pacienteService = pacienteService;
        this.medicoService = medicoService;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public Consulta pedirDadosConsulta() {
        System.out.println("Digite o id da consulta: ");
        String id = sc.nextLine();
        System.out.println("Digite o id do paciente: ");
        String idPaciente = sc.nextLine();
        System.out.println("Digite o id do médico: ");
        String idMedico = sc.nextLine();
        System.out.println("Digite a data da consulta (dd/MM/yyyy):");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(sc.nextLine(), formatter);
        System.out.println("Digite o horário da consulta (hh:mm)");
        LocalTime horario = LocalTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("Digite o status da consulta (AGENDADO/CONCLUIDO): ");
        StatusConsulta status = StatusConsulta.valueOf(sc.nextLine().toUpperCase());

        Paciente paciente = pacienteService.buscarPacientePorId(idPaciente);
        Medico medico = medicoService.buscarMedicoPorId(idMedico);

        return new Consulta(id, medico, paciente, data, horario, status);

    }

    @Override
    public void adicionar(Consulta consulta) {
        consultas.add(consulta);
        System.out.println("Consulta adicionada.\n");
    }

    @Override
    public void atualizar(Consulta consulta) {
        consultas.set(consultas.indexOf(consulta), consulta);
        System.out.println("Consulta atualizada. \n");
    }

    @Override
    public void remover(Consulta consulta) {
        if (consultas.contains(consulta)) {
            consultas.remove(consulta);
            System.out.println("Consulta removida. \n");
        } else {
            System.out.println("Consulta não encontrada. \n");
        }
    }
}
