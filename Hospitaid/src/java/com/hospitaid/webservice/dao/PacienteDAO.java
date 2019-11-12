package com.hospitaid.webservice.dao;

import com.hospitaid.webservice.model.AcessoBanco;
import com.hospitaid.webservice.controller.Paciente;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteDAO {
    // ALL
    public static ArrayList<Paciente> listaPaciente (){
        // não pegamos o telefone de tal paciente
        ArrayList<Paciente> retorno = new ArrayList<>();
        String sql = "SELECT * FROM Paciente;";
        AcessoBanco.execute(sql);
        try {
            while(AcessoBanco.resultSet.next()){
                String cpf = AcessoBanco.resultSet.getString("cpf");
                String sexo = AcessoBanco.resultSet.getString ("sexo");
                String etinia = AcessoBanco.resultSet.getString ("etinia");
                String senha = AcessoBanco.resultSet.getString ("senha");
                String estadoCivil = AcessoBanco.resultSet.getString ("estadoCivil");
                String rg = AcessoBanco.resultSet.getString ("rg");
                String orgaoEmissor = AcessoBanco.resultSet.getString ("orgaoEmissor");

                String dataExpedicao = AcessoBanco.resultSet.getString ("dataExpedicao");
                String uf = AcessoBanco.resultSet.getString ("uf");
                String observacoes = AcessoBanco.resultSet.getString ("observacoes");
                String nomePai = AcessoBanco.resultSet.getString ("nomePai");
                String nomeMae = AcessoBanco.resultSet.getString ("nomeMae");
                String nome = AcessoBanco.resultSet.getString ("nome");

                String sus = AcessoBanco.resultSet.getString ("sus");
                String fotoPerfil = AcessoBanco.resultSet.getString ("fotoPerfil");
                String nacionalidade = AcessoBanco.resultSet.getString ("nacionalidade");
                String naturalidade = AcessoBanco.resultSet.getString ("naturalidade");
                String nascimento = AcessoBanco.resultSet.getString ("nascimento");

                retorno.add(new Paciente(sexo, etinia, senha, estadoCivil, rg, 
                    orgaoEmissor, dataExpedicao, uf, observacoes, nomePai, 
                    nomeMae, nome, sus, fotoPerfil, nacionalidade, naturalidade, nascimento, cpf));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return retorno;
    }

    
    // INSERIR
    public static void inserir (Paciente paciente){
       String sql = "INSERT INTO Paciente VALUES ('" + paciente.getSexo() + "','" + paciente.getEtinia() + "','" + paciente.getSenha() + "','"
            + paciente.getEstadoCivil() + "','" + paciente.getRg() + "','" + paciente.getOrgaoEmissor() + "','" + paciente.getDataExpedicao() + "','"
            + paciente.getUf() + "','" + "" + "','" + paciente.getNomePai()+ "','" + paciente.getNomeMae() + "','" + paciente.getNome() + "','"
            + paciente.getSus() + "','" + "" + "','" + paciente.getNacionalidade() + "','" + paciente.getNaturalidade() + "','"
            + paciente.getNascimento() + "','" + paciente.getCpf() + "');";

        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // DELETE 
    public static void delete (Paciente paciente){
        String sql = "DELETE FROM Paciente WHERE cpf = '" + paciente.getCpf()+ "';";
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // UPDATE
    public static void update (Paciente paciente){
         String sql = "UPDATE Paciente SET sexo = '" + paciente.getSexo() + "', etinia = '" + paciente.getEtinia() + "', senha = '" + paciente.getSenha() + "', estadoCivil = '"
            + paciente.getEstadoCivil() + "', rg = '" + paciente.getRg() + "', orgaoEmissor = '" + paciente.getOrgaoEmissor() + "', dataExpedicao = '" 
            + paciente.getDataExpedicao() + "', uf = '" + paciente.getUf() + "', observacoes = '" + paciente.getObservacoes() + "', nomePai = '" + paciente.getNomePai()+
            "', nomeMae = '" + paciente.getNomeMae() + "', nome = '" + paciente.getNome() + "', sus = '" + paciente.getSus() + "', fotoPerfil = '" + "" 
            + "', nacionalidade = '" + paciente.getNacionalidade() + "', naturalidade = '" + paciente.getNaturalidade() + "', nascimento = '"
            + paciente.getNascimento() + "', cpf = '" + paciente.getCpf() + "';";
        
        AcessoBanco.execute(sql);
        AcessoBanco.endConnectionSemResultSet();
    }
    
    // SELECT 
    public static Paciente select (String cpf){
        Paciente paciente = new Paciente ();
       
        ArrayList<String> telefones = new ArrayList<>();
        String sql = "SELECT telefone FROM TelefonePaciente WHERE cpfPaciente = '" + cpf + "';";
        AcessoBanco.execute(sql);
        
        try {
            while (AcessoBanco.resultSet.next()){
                String telefone =AcessoBanco.resultSet.getString("telefone");
                telefones.add(telefone);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        AcessoBanco.endConnection();
                
        sql = "SELECT * FROM Paciente WHERE cpf = '" + cpf + "';";
        AcessoBanco.execute (sql);
        try {
            while (AcessoBanco.resultSet.next()){
                String sexo = AcessoBanco.resultSet.getString ("sexo");
                String etinia = AcessoBanco.resultSet.getString ("etinia");
                String senha = AcessoBanco.resultSet.getString ("senha");
                String estadoCivil = AcessoBanco.resultSet.getString ("estadoCivil");
                String rg = AcessoBanco.resultSet.getString ("rg");
                String orgaoEmissor = AcessoBanco.resultSet.getString ("orgaoEmissor");

                String dataExpedicao = AcessoBanco.resultSet.getString ("dataExpedicao");
                String uf = AcessoBanco.resultSet.getString ("uf");
                String observacoes = AcessoBanco.resultSet.getString ("observacoes");
                String nomePai = AcessoBanco.resultSet.getString ("nomePai");
                String nomeMae = AcessoBanco.resultSet.getString ("nomeMae");
                String nome = AcessoBanco.resultSet.getString ("nome");

                String sus = AcessoBanco.resultSet.getString ("sus");
                String fotoPerfil = AcessoBanco.resultSet.getString ("fotoPerfil");
                String nacionalidade = AcessoBanco.resultSet.getString ("nacionalidade");
                String naturalidade = AcessoBanco.resultSet.getString ("naturalidade");
                String nascimento = AcessoBanco.resultSet.getString ("nascimento");

                paciente = new Paciente(sexo, etinia, senha, estadoCivil, rg, 
                    orgaoEmissor, dataExpedicao, uf, observacoes, nomePai, 
                    nomeMae, nome, sus, fotoPerfil, nacionalidade, naturalidade, nascimento, cpf);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        AcessoBanco.endConnection();
        paciente.setTelefones(telefones);      
        return paciente;
    }
    
}
