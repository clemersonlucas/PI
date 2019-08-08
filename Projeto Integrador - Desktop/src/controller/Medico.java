package controller;

import java.util.Objects;

public class Medico implements Funcionario{ 
    // atributos da classe
    private String nome, cpf, senha, matricula;

    public Medico(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    
    
    
    public Medico(String matricula, String cpf, String senha, String nome) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.matricula = matricula;
    }

    public Medico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
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
        final Medico other = (Medico) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public boolean criarUmaConsulta(String turno, String data, Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionaRemedio(Paciente paciente, Medicamento medicamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paciente buscaPaciente(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cadastraPaciente(Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estoque acessarEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean adicionarEventos(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaConsultas confirmarConsultas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarProntuario(Paciente paciente) {
        // vamos pegar o usário do banco de dados 
        // iremos alterar apenas as caracteristicas do banco
        
    
    }

    @Override
    public String getProfissao() {
        // vamos retornar o nome da profissão do funcionario
        return "Medico";
    }
}
