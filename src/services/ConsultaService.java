package services;

import interfaces.Gerenciamento;
import models.Consulta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaService implements Gerenciamento<Consulta>{

    List<Consulta> consultas = new ArrayList<Consulta>();

    Scanner sc = new Scanner(System.in);

    public ConsultaService(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public void adicionar(Consulta consulta) {

        System.out.println("Medico: ");
        consulta.setMedico();

        System.out.println("Paciente: ");
        consulta.getPaciente();

        System.out.println("Horario: ");


        consultas.add(consulta);
        System.out.println("Consulta adicionada.");
    }

    @Override
    public void atualizar(Consulta consulta) {
        consultas.set(consultas.indexOf(consulta), consulta);
        System.out.println("Consulta atualizada.");
    }

    @Override
    public void remover(Consulta consulta) {
        if (consultas.contains(consulta)) {
            consultas.remove(consulta);
            System.out.println("Consulta removida.");
        } else {
            System.out.println("Consulta não encontrada.");
        }
    }
}
