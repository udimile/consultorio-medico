package models;

import java.time.LocalDate;

//classe abstrata que define atributos comuns a médico e paciente
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, String email, String telefone, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "-- Dados Cadastrais --" +
                ", CPF: " + cpf + '\'' +
                ", Email: " + email + '\'' +
                ", Telefone: " + telefone + '\'' +
                ", Data de Nascimento: " + dataNascimento ;
    }
}
