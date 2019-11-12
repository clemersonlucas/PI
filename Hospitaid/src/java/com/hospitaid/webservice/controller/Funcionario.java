package com.hospitaid.webservice.controller;

public class Funcionario {
    private String nome;
    private String senha, matricula;
    private String tipoAcesso, funcao;    

    public static Funcionario funcionario = new Funcionario();
    
    
    private Funcionario (){}

    public Funcionario(String nome, String senha, String matricula, String tipoAcesso, String funcao) {
        this.nome = nome;
        this.senha = senha;
        this.matricula = matricula;
        this.tipoAcesso = tipoAcesso;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getTipoAcesso() {
        return tipoAcesso;
    }
    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", senha=" + senha + ", matricula=" + matricula + ", tipoAcesso=" + tipoAcesso + ", funcao=" + funcao + '}';
    }
}
