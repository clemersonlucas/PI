package controller;

public class Evento {
    private String data;
    private String descricao;
    
    public Evento (){
    }

    public Evento(String descricao, String data) {
        this.data = data;
        this.descricao = descricao;
    }

    
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Evento{" + "data=" + data + ", descricao=" + descricao + '}';
    }
    
    
    
    
    
}
