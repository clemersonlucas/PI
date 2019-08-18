package controller;

import java.util.Objects;

public class Funcionario {
    private String matricula ;
    private String funcao ;
    private String senha ;
    private String nome ;
    private String acesso ;
  
    private Funcionario (){}

    public Funcionario(String matricula, String senha) {
        this.matricula = matricula;
        this.senha = senha;
    }
    
    public Funcionario(String matricula, String nome, String senha, 
            String funcao, String acesso) {
        this.matricula = matricula;
        this.funcao = funcao;
        this.senha = senha;
        this.nome = nome;
        this.acesso = acesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getAcesso() {
        return acesso;
    }
    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
    
    
}
