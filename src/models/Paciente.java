package models;

import java.util.Date;

public class Paciente extends Pessoa{
    private String[] historicoMedico; // armazena diagnósticos anteriores
    private Boolean planoDeSaude;
    private String numProntuario;
    private String[] alergias;

    public Paciente(String nome, String cpf, String email, String telefone, String endereco, Date dataNascimento, Date dataCadastro, String[] historicoMedico, Boolean planoDeSaude, String numProntuario, String[] alergias) {
        super(nome, cpf, email, telefone, endereco, dataNascimento, dataCadastro);
        this.historicoMedico = historicoMedico;
        this.planoDeSaude = planoDeSaude;
        this.numProntuario = numProntuario;
        this.alergias = alergias;
    }

    public String[] getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String[] historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public Boolean getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(Boolean planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public String getNumProntuario() {
        return numProntuario;
    }

    public void setNumProntuario(String numProntuario) {
        this.numProntuario = numProntuario;
    }

    public String[] getAlergias() {
        return alergias;
    }

    public void setAlergias(String[] alergias) {
        this.alergias = alergias;
    }
}
