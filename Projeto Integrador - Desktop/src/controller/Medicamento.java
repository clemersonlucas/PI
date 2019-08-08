package controller;

import java.util.Date;

public class Medicamento {
    private String nome;
    private int quantidade;
    private String descricao;
    private Date validade;
    private int horasTomar;
    
    // método contrutor
    public Medicamento(String nome, int quantidade, String descricao, Date validade, int horasTomar) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.validade = validade;
        this.horasTomar = horasTomar;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public int getHorasTomar() {
        return horasTomar;
    }

    public void setHorasTomar(int horasTomar) {
        this.horasTomar = horasTomar;
    }
    
    
    
    
    
    
    
    
}
