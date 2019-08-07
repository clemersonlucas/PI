package controller;

import java.util.*;

public class Paciente {
    // atributos da classe 
    private String pathFotoUsuario;
    private String nome;
    private String cpf;
    private String senha;
    private String numeroIdentidade;
    
    
    private Prontuario prontuario;
    private ArrayList<Historico> historico;
    private ArrayList<Medicamento> remedios;
    private ArrayList<Consulta> consultas;
    
    public Paciente(String cpf, String senha) {
        this.cpf = "000";
        this.senha = "brigadeiro";
                
        this.historico = new ArrayList<>();
        this.remedios = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public Paciente(String pathFotoUsuario, String nome, String cpf, 
            String senha, String numeroIdentidade, Prontuario prontuario, 
            ArrayList<Historico> historico, ArrayList<Medicamento> remedios, 
            ArrayList<Consulta> consultas) {


        this.pathFotoUsuario = pathFotoUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.numeroIdentidade = numeroIdentidade;
        this.prontuario = prontuario;
        this.historico = historico;
        this.remedios = remedios;
        this.consultas = consultas;
    }
    
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public ArrayList<Historico> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Historico> historico) {
        this.historico = historico;
    }

    public ArrayList<Medicamento> getRemedios() {
        return remedios;
    }

    public void setRemedios(Medicamento remedio) {
        this.remedios.add(remedio);
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public String getPathFotoUsuario() {
        return pathFotoUsuario;
    }

    public void setPathFotoUsuario(String pathFotoUsuario) {
        this.pathFotoUsuario = pathFotoUsuario;
    }

    public String getNumeroIdentidade() {
        return numeroIdentidade;
    }

    public void setNumeroIdentidade(String numeroIdentidade) {
        this.numeroIdentidade = numeroIdentidade;
    }
    
    
    
    
    // vamos fazer o objeto da classe apenas comparar
    // com o cpf e senha do paciente
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
}
