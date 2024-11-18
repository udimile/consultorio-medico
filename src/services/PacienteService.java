package services;

import interfaces.Gerenciamento;
import models.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PacienteService implements Gerenciamento<Paciente> {

    private List<Paciente> pacientes = new ArrayList<Paciente>();

    Scanner sc = new Scanner(System.in);

    public PacienteService(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public void adicionar(Paciente paciente) {

        for (Paciente p : pacientes) {
            if (p.getCpf().equals(paciente.getCpf())) {
                System.out.println("Paciente ja cadastrado");
                break;
            }
        }

        System.out.println("Nome: ");
        paciente.setNome(sc.nextLine());

        System.out.println("CPF: ");
        paciente.setCpf(sc.nextLine());

        System.out.println("Telefone: ");
        paciente.setTelefone(sc.nextLine());

        System.out.println("Email: ");
        paciente.setEmail(sc.nextLine());

        pacientes.add(paciente);
        System.out.println("Paciente adicionado.");

    }

    @Override
    public void atualizar(Paciente paciente) {

    }

    @Override
    public void remover(Paciente paciente) {


    }
}
