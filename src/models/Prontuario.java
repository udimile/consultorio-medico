package models;

import services.PacienteService;

public class Prontuario {
    private String idProntuario;
    private String descricao;
    private String[] historicoMedico;

    public String getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(String idProntuario) {
        this.idProntuario = idProntuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String[] getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String[] historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public void pegarHistoricoDoPaciente(String idPaciente, PacienteService pacienteService) {
        Paciente paciente = pacienteService.buscarPacientePorId(idPaciente);
        if (paciente != null) {
            this.historicoMedico = paciente.getHistoricoMedico();
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }
}

