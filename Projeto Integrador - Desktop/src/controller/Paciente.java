package controller;

import java.util.Date;
import java.util.Objects;

public class Paciente {
    private String nome;      // nome do paciente
    private String senha;     // senha pra logar 
    private String cpf;       // cpf do paciente
    private String sus;       // número do sus
    private Date nascimento;  // data de nasciemnto do paciente

    // método construtor parametrizado
    public Paciente(String nome, String senha, String cpf, String sus, Date nascimento) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.sus = sus;
        this.nascimento = nascimento;
    }
    
    // construtor parametrizado para senha e cpf
    public Paciente (String cpf, String senha){
        this.cpf = cpf;
        this.senha = senha;
    }
    
    
    // impedir que o paciente seja criado sem parametros
    private Paciente (){}
    
    
    // métodos getters e setters da nossa classe

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSus() {
        return sus;
    }

    public void setSus(String sus) {
        this.sus = sus;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    
    // método implementado para comparar apenas 
    // a senha e o cpf do paciente da classe

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
        final Paciente other = (Paciente) obj;
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paciente{" + "senha=" + senha + ", cpf=" + cpf + '}';
    }

    
    
}
