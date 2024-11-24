package services;

import interfaces.Gerenciamento;
import models.Medico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicoService implements Gerenciamento<Medico> {
    private List<Medico> medicos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public MedicoService(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    @Override
    public void adicionar(Medico medico) {
        for (Medico m : medicos) {
            if (m.getCrm().equals(medico.getCrm())) {
                System.out.println("Médico já cadastrado.");
                return;
            }
        }
        medicos.add(medico);
        System.out.println("Médico adicionado.");
    }

    @Override
    public void atualizar(Medico medico) {
        medicos.set(medicos.indexOf(medico), medico);
        System.out.println("Médico atualizado.");
    }

    @Override
    public void remover(Medico medico) {
        if (medicos.contains(medico)) {
            medicos.remove(medico);
            System.out.println("Médico removido.");
        } else {
            System.out.println("Médico não encontrado.");
        }
    }

    public Medico buscarMedicoPorId(String idMedico) {
        for (Medico medico : medicos) {
            if (medico.getCrm().equals(idMedico)) {
                return medico;
            }
        }
        return null;
    }

    public Medico pedirDadosMedico() {
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();

        System.out.println("Telefone: ");
        String telefone = sc.nextLine();

        System.out.println("Data de Nascimento (yyyy-MM-dd): ");
        LocalDate dataNascimento = LocalDate.parse(sc.nextLine());

        System.out.println("CRM: ");
        String crm = sc.nextLine();

        System.out.println("Especialidade: ");
        String especialidade = sc.nextLine();

        System.out.println("Salário: ");
        Double salario = sc.nextDouble();
        sc.nextLine();

        return new Medico(nome, cpf, email, telefone, dataNascimento, crm, especialidade, salario);
    }

}
