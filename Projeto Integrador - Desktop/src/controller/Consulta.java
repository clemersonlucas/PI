package controller;

import java.io.Serializable;

public class Consulta extends Object implements Serializable{
    private String turno;
    private String data;
    private Funcionario funcionario;
    private String estadoConsulta;  
    
    
    
    // método construtor parametrizado
    public Consulta(String turno, String data, Funcionario funcionario) {
        this.turno = turno;
        this.data = data;
        this.funcionario = funcionario;
        this.estadoConsulta = "Avaliando";
    }
    
    // método construtor padrão
    private Consulta(){}
    
    
    //métododos getters e setters
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
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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
        return "Consulta: com o " + funcionario.getProfissao() + 
                " pela " + turno + " (" + data + ")";
    }
     
}
