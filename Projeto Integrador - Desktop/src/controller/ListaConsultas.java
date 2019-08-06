package controller;

import java.util.ArrayList;

public class ListaConsultas {
    private ArrayList <Consulta> consultasAgendadas;

    public ListaConsultas (){
        this.consultasAgendadas = new ArrayList<>();
    }
    
    public ListaConsultas (ArrayList<Consulta> consultas){
        try {
            this.consultasAgendadas = consultas;
        }
        // o array List do prametro pode essta vazio
        catch (NullPointerException nullPointerException){
            System.err.println("Ocorreu um erro na criação da Lista de Consultas");
        }
    }
    
    // métodos implementados para o projeto
    public void remover (int position){
        this.consultasAgendadas.remove(position);
    } 
    
    public void adicionar (Consulta consulta){
        this.consultasAgendadas.add(consulta);
    }
    
    public int tamanho (){
        return this.consultasAgendadas.size();
    }
    
    public boolean possui (Consulta consulta){
        for (Consulta c : this.consultasAgendadas){
            if (c.equals(consulta))
            {
                return true;
            }
        }
        return false;
    }
    
}
