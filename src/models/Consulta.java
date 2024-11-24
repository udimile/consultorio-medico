package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {

    private String idConsulta;
    private Medico medico;
    private Paciente paciente;
    private LocalDate data;
    private LocalTime horario;
    private StatusConsulta statusConsulta; // agendado, concluido

    public Consulta(String idConsulta, Medico medico, Paciente paciente, LocalDate data, LocalTime horario, StatusConsulta statusConsulta) {
        this.idConsulta = idConsulta;
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.horario = horario;
        this.statusConsulta = statusConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public StatusConsulta getStatus() {
        return statusConsulta;
    }

    public void setStatus(StatusConsulta statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    public String getIdConsulta() {
        return idConsulta;
    }

}
