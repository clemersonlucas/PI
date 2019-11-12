package com.hospitaid.webservice.controller;

public class Evento{
    
    private String titulo;
    private String dataPublicao;
    private String dataExpirar;
    private String informacao;
    private String matriculaProfissional;
    private int id;
    
    
    private Evento(){}

    public Evento(String titulo, String dataPublicao, String dataExpirar, String informacao, String matriculaProfissional, int id) {
        this.titulo = titulo;
        this.dataPublicao = dataPublicao;
        this.dataExpirar = dataExpirar;
        this.informacao = informacao;
        this.matriculaProfissional = matriculaProfissional;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDataPublicao() {
        return dataPublicao;
    }
    public void setDataPublicao(String dataPublicao) {
        this.dataPublicao = dataPublicao;
    }
    public String getDataExpirar() {
        return dataExpirar;
    }
    public void setDataExpirar(String dataExpirar) {
        this.dataExpirar = dataExpirar;
    }
    public String getInformacao() {
        return informacao;
    }
    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
    public String getMatriculaProfissional() {
        return matriculaProfissional;
    }
    public void setMatriculaProfissional(String matriculaProfissional) {
        this.matriculaProfissional = matriculaProfissional;
    }
}
