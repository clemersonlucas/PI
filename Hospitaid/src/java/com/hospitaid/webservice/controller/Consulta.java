package com.hospitaid.webservice.controller;

public class Consulta {
    private String data, diagnostico, hora;
    private String descricao, status, inicioConsulta;
    private String fimConsulta, entrada, especialidade;
    private int id;
    
    private String quemAgendou;
    private String paraPaciente;
    
    public Consulta(String data, String diagnostico, String hora, String descricao, 
            String status, String inicioConsulta, String fimConsulta, String entrada, 
            String especialidade, int id, String quemAgendou, String paraPaciente) {
        this.data = data;
        this.diagnostico = diagnostico;
        this.hora = hora;
        this.descricao = descricao;
        this.status = status;
        this.inicioConsulta = inicioConsulta;
        this.fimConsulta = fimConsulta;
        this.entrada = entrada;
        this.especialidade = especialidade;
        this.id = id;
        this.quemAgendou = quemAgendou;
        this.paraPaciente = paraPaciente;
    }

    public String getParaPaciente() {
        return paraPaciente;
    }

    public void setParaPaciente(String paraPaciente) {
        this.paraPaciente = paraPaciente;
    }

    
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInicioConsulta() {
        return inicioConsulta;
    }

    public void setInicioConsulta(String inicioConsulta) {
        this.inicioConsulta = inicioConsulta;
    }

    public String getFimConsulta() {
        return fimConsulta;
    }

    public void setFimConsulta(String fimConsulta) {
        this.fimConsulta = fimConsulta;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuemAgendou() {
        return quemAgendou;
    }

    public void setQuemAgendou(String quemAgendou) {
        this.quemAgendou = quemAgendou;
    }
    
    
    
    
    
    
    
    
}
