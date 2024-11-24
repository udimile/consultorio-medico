package services;

import models.Consulta;
import models.Paciente;

import java.util.List;

public class RelatorioService {

    public void gerarRelatorioConsultas(List<Consulta> consultas) {
        System.out.println("Relatório de Consultas:");
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }

    public void gerarRelatorioPacientes(List<Paciente> pacientes) {
        System.out.println("Relatório de Pacientes:");
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }
}