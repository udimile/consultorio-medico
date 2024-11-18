package models;

import java.time.LocalDate;
import java.util.Arrays;

public class Paciente extends Pessoa{
    private String[] historicoMedico; // armazena diagnósticos anteriores
    private String planoDeSaude;
    private String idProntuario;
    private String[] alergias;

    public Paciente(String nome, String cpf, String email, String telefone, String endereco, LocalDate dataNascimento, LocalDate dataCadastro, String[] historicoMedico, String planoDeSaude, String idProntuario, String[] alergias) {
        super(nome, cpf, email, telefone, endereco, dataNascimento);
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

    @Override
    public String toString() {
        return "PACIENTE" + super.getNome() +
                super.toString() +
                "Histórico Medico: " + Arrays.toString(historicoMedico) +
                ", Plano De Saude: '" + planoDeSaude + '\'' +
                ", ID Prontuario: '" + idProntuario + '\'' +
                ", Alergias: " + Arrays.toString(alergias) ;
    }
}
