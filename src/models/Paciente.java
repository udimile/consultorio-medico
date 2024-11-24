package models;

import java.time.LocalDate;
import java.util.Arrays;

public class Paciente extends Pessoa{
    private String endereco;
    private String[] historicoMedico;
    private String planoDeSaude;
    private String idProntuario;

    public Paciente(String nome,
                    String cpf,
                    String email,
                    String telefone,
                    LocalDate dataNascimento,
                    LocalDate dataCadastro,
                    String[] historicoMedico,
                    String planoDeSaude,
                    String idProntuario,
                    String endereco) {
        super(nome, cpf, email, telefone, dataNascimento);
        this.historicoMedico = historicoMedico;
        this.planoDeSaude = planoDeSaude;
        this.idProntuario = idProntuario;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    @Override
    public String toString() {
        return "PACIENTE" + super.getNome() +
                super.toString() +
                ", Endereço: " + endereco + '\'' +
                "Histórico Medico: " + Arrays.toString(historicoMedico) +
                ", Plano De Saude: '" + planoDeSaude + '\'' +
                ", ID Prontuario: '" + idProntuario + '\'';
    }
}
