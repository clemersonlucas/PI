package com.hospitaid.webservice.dao;

import com.hospitaid.webservice.model.AcessoBanco;
import com.hospitaid.webservice.controller.Exame;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExameDAO {
    // ALL
    public static ArrayList<Exame> listaExame (){
        ArrayList<Exame> retorno = new ArrayList<>();
        String sql = "SELECT * FROM exame;";
        AcessoBanco.execute(sql);
        try {
            while(AcessoBanco.resultSet.next()){
                String tipo = AcessoBanco.resultSet.getString("tipo");
                String data = AcessoBanco.resultSet.getString("data");
                String cpfPaciente = AcessoBanco.resultSet.getString("cpfPaciente");
                String matriculaProfissional = AcessoBanco.resultSet.getString("matriculaProfissional");
                String id = AcessoBanco.resultSet.getString("id");
                retorno.add(new Exame(tipo, data, id, cpfPaciente, matriculaProfissional));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return retorno;
    }
    
    
    // INSERIR
    public static void inserir (Exame exame){
        String sql = "INSERT INTO exame VALUES ('" + exame.getTipo() + "','" + exame.getData() + "','" + exame.getId() + "','" 
            + exame.getCpfPaciente() + "','" + exame.getMatriculaProfissional() + "');";
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // DELETE 
    public static void delete (Exame exame){
        String sql = "DELETE FROM exame WHERE id = '" + exame.getId() + "';";
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // UPDATE
    public static void update (Exame exame){
        String sql = "UPDATE exame SET tipo '" + exame.getTipo() + "', data = '" + exame.getData() + "', cpfPaciente = '" 
            + exame.getCpfPaciente() + "', matriculaPaciente = '" + exame.getMatriculaProfissional() + "'WHERE id = '" + exame.getId() +  "';";
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // SELECT 
    public static Exame select (String id){
        String sql = "SELECT * FROM exame WHERE id = '" + id + "';";
        AcessoBanco.execute(sql);
        
        try {
            while(AcessoBanco.resultSet.next()){
                String tipo = AcessoBanco.resultSet.getString("tipo");
                String data = AcessoBanco.resultSet.getString("data");
                String cpfPaciente = AcessoBanco.resultSet.getString("cpfPaciente");
                String matriculaProfissional = AcessoBanco.resultSet.getString("matriculaProfissional");
                return new Exame(tipo, data, id, cpfPaciente, matriculaProfissional);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }
    
}
