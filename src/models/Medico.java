package models;

import java.util.Date;

public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    private Double salario;
    //horario de atendimento? de que tipo? poderia ser uma interface?

    public Medico(String nome, String cpf, String email, String telefone, String endereco, Date dataNascimento, Date dataCadastro, String crm, String especialidade, Double salario) {
        super(nome, cpf, email, telefone, endereco, dataNascimento, dataCadastro);
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
}
