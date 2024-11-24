package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    private Double salario;

    public Medico(String nome, String cpf, String email, String telefone, LocalDate dataNascimento, String crm, String especialidade, Double salario) {
        super(nome, cpf, email, telefone, dataNascimento);
        this.crm = crm;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "MÉDICO" + super.getNome() +
                super.toString() +
                "CRM: '" + crm + '\'' +
                ", Especialidade: '" + especialidade + '\'' +
                ", Salário: R$" + salario;
    }
}
