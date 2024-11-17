package models;

import java.util.Date;

public class Paciente extends Pessoa{
    private String[] historicoMedico; // armazena diagnósticos anteriores
    private String planoDeSaude;
    private String idProntuario;
    private String[] alergias;

    public Paciente(String nome, String cpf, String email, String telefone, String endereco, Date dataNascimento, Date dataCadastro, String[] historicoMedico, String planoDeSaude, String idProntuario, String[] alergias) {
        super(nome, cpf, email, telefone, endereco, dataNascimento, dataCadastro);
        this.historicoMedico = historicoMedico;
        this.planoDeSaude = planoDeSaude;
        this.idProntuario = idProntuario;
        this.alergias = alergias;
    }

    public String[] getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String[] historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(String planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public String getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(String idProntuario) {
        this.idProntuario = idProntuario;
    }

    public String[] getAlergias() {
        return alergias;
    }

    public void setAlergias(String[] alergias) {
        this.alergias = alergias;
    }
}
