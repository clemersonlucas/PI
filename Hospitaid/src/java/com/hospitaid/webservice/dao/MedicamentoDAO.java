package com.hospitaid.webservice.dao;

import com.hospitaid.webservice.controller.Medicamento;
import com.hospitaid.webservice.model.AcessoBanco;
import java.sql.SQLException;
import java.util.ArrayList;


public class MedicamentoDAO {
    //ALL
    public static ArrayList<Medicamento> listaMedicamento (){
        ArrayList<Medicamento> retorno = new ArrayList<>();
        String sql = "SELECT * FROM Medicamento;";
        AcessoBanco.execute(sql);
        
        try {
            while (AcessoBanco.resultSet.next()){
                String nome = AcessoBanco.resultSet.getString("nome");
                String dataIncial = AcessoBanco.resultSet.getString("dataInicial");
                String dataFinal = AcessoBanco.resultSet.getString("dataFinal");
                int intervaloHoras = AcessoBanco.resultSet.getInt("intervaloHoras");
                String id = AcessoBanco.resultSet.getString("id");
                String matriculaProfissional = AcessoBanco.resultSet.getString("matriculaProfissional");
                String cpfPaciente = AcessoBanco.resultSet.getString("cpfPaciente");
                retorno.add(new Medicamento(nome, dataIncial, dataFinal, intervaloHoras, id, cpfPaciente, matriculaProfissional));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        return retorno;
    }
    
    // SELECT 
    public static Medicamento select (int id){
        String sql = "SELECT * FROM Medicamento WHERE id = '" + id + "';";
        AcessoBanco.execute(sql);
        
        try {
            while (AcessoBanco.resultSet.next()){
                String nome = AcessoBanco.resultSet.getString("nome");
                String dataIncial = AcessoBanco.resultSet.getString("dataInicial");
                String dataFinal = AcessoBanco.resultSet.getString("dataFinal");
                int intervaloHoras = AcessoBanco.resultSet.getInt("intervaloHoras");
                String matriculaProfissional = AcessoBanco.resultSet.getString("matriculaProfissional");
                String cpfPaciente = AcessoBanco.resultSet.getString("cpfPaciente");
                return new Medicamento(nome, dataIncial, dataFinal, intervaloHoras, sql, cpfPaciente, matriculaProfissional);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }
    
    
    // DELETE
    public static void delete (int id){
        String sql = "DELETE FROM Medicamento WHERE id = '" + id  + "';";
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // INSERT 
    public static void insert (Medicamento medicamento){
        String sql = "INSERT INTO Medicamento VALUES ('" + medicamento.getNome() 
            + "','" + medicamento.getDataInicial() 
            + "','" + medicamento.getDataFinal() 
            + "','" + medicamento.getIntervaloHoras() 
            + "','" + medicamento.getId() 
            + "','" + medicamento.getCpfPaciente() 
            + "','" + medicamento.getMatriculaProfissional() + "');";
        
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // UPDATE 
    public static void update (Medicamento medicamento){
        String sql = "UPDATE Medicamento SET nome = '" + medicamento.getNome() 
            + "', dataInicial = '" + medicamento.getDataInicial() 
            + "', dataFinal = '" + medicamento.getDataFinal()
            + "', intervaloHoras = '" + medicamento.getIntervaloHoras() 
            + "', cpfPaciente = '" + medicamento.getCpfPaciente() 
            + "', matriculaProfissional = '" + medicamento.getMatriculaProfissional() + "');";
        
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    
    
}
