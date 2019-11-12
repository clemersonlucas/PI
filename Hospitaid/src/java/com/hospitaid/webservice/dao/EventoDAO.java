package com.hospitaid.webservice.dao;

import com.hospitaid.webservice.model.AcessoBanco;
import com.hospitaid.webservice.controller.Evento;
import java.sql.SQLException;
import java.util.ArrayList;

public class EventoDAO {
    // ALL
    public static ArrayList<Evento> listaEvento (){
        ArrayList<Evento> retorno = new ArrayList<>();
        String sql = "SELECT * FROM Evento;";
        AcessoBanco.execute(sql);
        try {
            while(AcessoBanco.resultSet.next()){
                String titulo = AcessoBanco.resultSet.getString("titulo");
                String informacao = AcessoBanco.resultSet.getString("informacao");
                String dataPublicacao = AcessoBanco.resultSet.getString("dataPublicacao");
                String dataExpirar = AcessoBanco.resultSet.getString("dataExpirar");
                String matriculaProfissional = AcessoBanco.resultSet.getString("matriculaProfissional");
                int id = AcessoBanco.resultSet.getInt("id");
                retorno.add(new Evento(titulo, dataPublicacao, dataExpirar, informacao, matriculaProfissional, id));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return retorno;
    }
    
    
    // INSERIR
    public static void inserir (Evento evento){
        String sql = "INSERT INTO Evento VALUES ('" + evento.getTitulo() + "','" + evento.getInformacao() + "','"
            + evento.getDataPublicao() + "','" + evento.getDataExpirar() + "','" + evento.getId() + "','" + evento.getMatriculaProfissional() + "');";
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // DELETE 
    public static void delete (int id){
        String sql = "DELETE FROM Evento WHERE id = '" + id + "';";
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // UPDATE
    public static void update (Evento evento){
        String sql = "UPDATE Evento SET titulo = '" + evento.getTitulo() 
        + "', informacao = '" + evento.getInformacao() + "', dataPublicacao = '"
        + evento.getDataPublicao() + "', dataExpirar = '" + evento.getDataExpirar() 
        + "', matriculaProfissional'" + evento.getMatriculaProfissional() + "' WHERE id = '" + evento.getId() +  "';";
        
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // SELECT 
    public static Evento select (int id){
        String sql = "SELECT * FROM Evento WHERE id = '" + id + "';";
        AcessoBanco.execute(sql);
        try {
            while(AcessoBanco.resultSet.next()){
                String titulo = AcessoBanco.resultSet.getString("titulo");
                String informacao = AcessoBanco.resultSet.getString("informacao");
                String dataPublicacao = AcessoBanco.resultSet.getString("dataPublicacao");
                String dataExpirar = AcessoBanco.resultSet.getString("dataExpirar");
                String matriculaProfissional = AcessoBanco.resultSet.getString("matriculaProfissional");
                return new Evento(titulo, dataPublicacao, dataExpirar, informacao, matriculaProfissional, id);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }
}
