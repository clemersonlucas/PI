package com.hospitaid.webservice.dao;

import com.hospitaid.webservice.controller.Consulta;
import com.hospitaid.webservice.model.AcessoBanco;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaDAO {

    // ALL
    public static ArrayList<Consulta> listaConsulta() {
        ArrayList<Consulta> retorno = new ArrayList<>();
        String sql = "SELECT * FROM Consulta;";
        AcessoBanco.execute(sql);
        try {
            while (AcessoBanco.resultSet.next()) {
                String status = AcessoBanco.resultSet.getString("status");
                String data = AcessoBanco.resultSet.getString("data");
                String descricao = AcessoBanco.resultSet.getString("descricao");
                String hora = AcessoBanco.resultSet.getString("hora");
                String inicioConsulta = AcessoBanco.resultSet.getString("inicioConsulta");
                String fimConsulta = AcessoBanco.resultSet.getString("fimConsulta");
                String entrada = AcessoBanco.resultSet.getString("entrada");
                String especialidade = AcessoBanco.resultSet.getString("especialidade");
                String matriculaProfissional = AcessoBanco.resultSet.getString("matriculaProfissional");
                String cpfPaciente = AcessoBanco.resultSet.getString("cpfPaciente");
                int id = AcessoBanco.resultSet.getInt("id");

                Consulta c = new Consulta(data, descricao, hora, descricao,
                        status, inicioConsulta, fimConsulta, entrada, especialidade,
                        id, matriculaProfissional, cpfPaciente);
                retorno.add(c);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return retorno;
    }
    
    //UPDATE
    public static void update (Consulta consulta){
        String sql = "UPDATE Consulta SET data = " + consulta.getData() + "', descricao = '" + consulta.getDescricao()
                + "', diagnostico = '" + consulta.getDiagnostico() + "', hora = '" + consulta.getHora() + "', status ='" + consulta.getStatus()
                + "', inicioConsulta = '" + consulta.getInicioConsulta() + "', fimConsulta = '" + consulta.getFimConsulta() + "', entrada = '" + consulta.getEntrada()
                + "', especialidade = '" + consulta.getEspecialidade() + "', id = '" + consulta.getId() + "', matriculaProfissional ='" + consulta.getQuemAgendou()
                + "', cpfPaciente = '" + consulta.getParaPaciente() + "');";
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet ();
    }
    

    //DELETE
    public static void delete(int id) {
        String sql = "DELETE FROM Consulta WHERE id = '" + id + "';";
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }

    //INSERT
    public static void inserir(Consulta consulta) {
        String sql = "INSERT INTO Consulta VALUES ('" + consulta.getData() + "','" + consulta.getDescricao()
                + "','" + consulta.getDiagnostico() + "','" + consulta.getHora() + "','" + consulta.getStatus()
                + "','" + consulta.getInicioConsulta() + "','" + consulta.getFimConsulta() + "','" + consulta.getEntrada()
                + "','" + consulta.getEspecialidade() + "','" + consulta.getId() + "','" + consulta.getQuemAgendou()
                + "','" + consulta.getParaPaciente() + "');";
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }

    // SELECT 
    public static Consulta select(int id) {
        String sql = "SELECT * FROM Consulta WHERE id = '" + id + "';";
        AcessoBanco.execute(sql);

        try {
            while (AcessoBanco.resultSet.next()) {
                String status = AcessoBanco.resultSet.getString("status");
                String data = AcessoBanco.resultSet.getString("data");
                String descricao = AcessoBanco.resultSet.getString("descricao");
                String hora = AcessoBanco.resultSet.getString("hora");
                String inicioConsulta = AcessoBanco.resultSet.getString("inicioConsulta");
                String fimConsulta = AcessoBanco.resultSet.getString("fimConsulta");
                String entrada = AcessoBanco.resultSet.getString("entrada");
                String especialidade = AcessoBanco.resultSet.getString("especialidade");
                String matriculaProfissional = AcessoBanco.resultSet.getString("matriculaProfissional");
                String cpfPaciente = AcessoBanco.resultSet.getString("cpfPaciente");

                Consulta c = new Consulta(data, descricao, hora, descricao,
                        status, inicioConsulta, fimConsulta, entrada, especialidade,
                        id, matriculaProfissional, cpfPaciente);
                return c;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

}
