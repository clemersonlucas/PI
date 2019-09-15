package controller;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String cidade;
    private String dataNascimento;
    private String matricula;    
    private ArrayList<String> telefone = new ArrayList<>();

    private Aluno (){}

    public Aluno(String nome, String cidade, String dataNascimento, String matricula) {
        this.nome = nome;
        this.cidade = cidade;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<String> getTelefone() {
        return telefone;
    }

    public void setTelefone(ArrayList<String> telefone) {
        this.telefone = telefone;
    }
    
    
            


}
 