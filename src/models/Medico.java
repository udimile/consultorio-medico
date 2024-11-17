package models;

import java.time.LocalTime;
import java.util.Date;

public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    private Double salario;
    private LocalTime horarioDeAtendimento;

    public Medico(String nome, String cpf, String email, String telefone, String endereco, Date dataNascimento, Date dataCadastro, String crm, String especialidade, Double salario, LocalTime horarioDeAtendimento) {
        super(nome, cpf, email, telefone, endereco, dataNascimento, dataCadastro);
        this.crm = crm;
        this.especialidade = especialidade;
        this.salario = salario;
        this.horarioDeAtendimento = horarioDeAtendimento;
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

    public LocalTime getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public void setHorarioDeAtendimento(LocalTime horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }
}
