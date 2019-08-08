package controller;

import java.io.Serializable;

public class Consulta extends Object implements Serializable{
    private String turno;
    private String data;
    private String servico;
    private String estadoConsulta;  
    
    // método construtor parametrizado
    public Consulta(String turno, String data, String servico) {
        this.turno = turno;
        this.data = data;
        this.servico = servico;
        this.estadoConsulta = "Avaliando";
    }
    
    // método construtor padrão
    private Consulta(){}
    
    
    
    public String getServico() {    
        return servico;
    }

    //métododos getters e setters
    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getEstadoConsulta() {
        return estadoConsulta;
    }
    public void setEstadoConsulta(String estadoConsulta) {
        this.estadoConsulta = estadoConsulta;
    }
    
   
    // método toString
    @Override
    public String toString() {
        return "Consulta: com o " + servico +  
                " pela " + turno + " (" + data + ")";
    }
     
}
