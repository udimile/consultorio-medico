package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {

    private Medico medico;
    private Paciente paciente;
    private LocalDate data;
    private LocalTime horario;
    private String status; // agendado, concluido

    public Consulta(Medico medico, Paciente paciente, LocalDate data, LocalTime horario, String status) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.horario = horario;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // altera o status da consulta para o atual
    public void alterarStatus(String statusAtual) {
        this.status = statusAtual;
    }
}
