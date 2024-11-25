package services;

import interfaces.Gerenciamento;
import models.Paciente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
                System.out.println("Paciente ja cadastrado\n");
                break;
            }
        }
        pacientes.add(paciente);
        System.out.println("Paciente adicionado.\n");

    }

    @Override
    public void atualizar(Paciente paciente) {
            pacientes.set(pacientes.indexOf(paciente), paciente);
            System.out.println("Paciente atualizado.\n");
    }

    @Override
    public void remover(Paciente paciente) {

        if(pacientes.contains(paciente)){
            pacientes.remove(paciente);
            System.out.println("Paciente removido.\n");
        }else{
            System.out.println("Paciente não encontrado.\n");
        }

    }

    public Paciente buscarPacientePorId(String idPaciente) {
        for (Paciente paciente : pacientes) {
            if (paciente.getIdProntuario().equals(idPaciente)) {
                return paciente;
            }
        }
        return null;
    }

    public Paciente pedirDadosPaciente() {
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Telefone: ");
        String telefone = sc.nextLine();
        System.out.println("Data de Nascimento (dd/MM/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(sc.nextLine(), formatter);
        System.out.println("Data de Cadastro (dd/MM/yyyy): ");
        LocalDate dataCadastro = LocalDate.parse(sc.nextLine(), formatter);
        System.out.println("Histórico Médico: ");
        String[] historicoMedico = sc.nextLine().split(",");
        System.out.println("Plano de Saúde: ");
        String planoDeSaude = sc.nextLine();
        System.out.println("ID do Prontuário: ");
        String idProntuario = sc.nextLine();
        System.out.println("Endereço: ");
        String endereco = sc.nextLine();

        return new Paciente(nome, cpf, email, telefone, dataNascimento, dataCadastro, historicoMedico, planoDeSaude, idProntuario, endereco);
    }

}
