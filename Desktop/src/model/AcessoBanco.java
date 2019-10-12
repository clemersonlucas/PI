package model;

import controller.Consulta;
import controller.Estoque;
import controller.Evento;
import controller.Funcionario;
import controller.Medicamento;
import controller.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.Conexao.fazerConexao;
import static model.Conexao.resultSet;


public class AcessoBanco {
   
    public static String user = "lucas";
    public static String password = "pamonha";
    public static String nameClass = "com.mysql.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost/ServerHospitaid";
    public static boolean result;
    public static ResultSet resultSet = null;
    public static Statement statement = null;
    public static Connection connection = null;
    
    
    // MÉTODOS PARA A CONEXÃO COM O BANCO 
    private static void execute (String comando){
        try {
           Class.forName(nameClass);
           connection = DriverManager.getConnection(url, user, password);
           statement = connection.createStatement();
           result = statement.execute(comando);
           resultSet = statement.getResultSet();     
           
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    private static void endConnection (){
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    } 
    
    private static void endConnectionSemResultSet (){
        try {
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    } 
    
    
    
    
    // MÉTODOS PARA ADICIONAR
    public static void adicionaConsulta (Consulta consulta){
        String sql = "INSERT INTO Consulta VALUES ('" + consulta.getData() + "','"  + consulta.getDescricao()
            + "','"  + consulta.getDiagnostico() + "','"  + consulta.getHora() + "','"  + consulta.getStatus()
            + "','"  + consulta.getInicioConsulta() + "','"  + consulta.getFimConsulta() + "','"  + consulta.getEntrada()
            + "','"  + consulta.getEspecialidade() + "','"  + consulta.getId() + "','"  + consulta.getQuemAgendou()
            + "','"  + consulta.getParaPaciente() + "');";
     
        execute(sql);
        endConnectionSemResultSet();
    }
    public static void adicionaMedicamentoEstoque (Estoque estoque){
        String sql = "INSERT INTO Estoque VALUES ('" + estoque.getNome() + "','" + estoque.getValidade() + "','" + estoque.getQuantidade() + "','" +
            estoque.getDescricao() + "','" + estoque.getFabricacao() + "','" + estoque.getId() + "','" + estoque.getMatriculaProfissional() + "');";
    
        execute(sql);
        endConnectionSemResultSet();
    }
    public static void adicionaFuncionario (Funcionario funcionario) {
        String sql = "INSERT INTO Profissional VALUES ('" + funcionario.getNome() + "','" + funcionario.getSenha()+ "','" 
                + funcionario.getFuncao() + "','" + funcionario.getTipoAcesso()+ "','" + funcionario.getMatricula() + "');";
        execute(sql);
        endConnectionSemResultSet();
    }
    public static void adicionaPaciente(Paciente paciente) {
        String sql = "INSERT INTO Paciente VALUES ('" + paciente.getSexo() + "','" + paciente.getEtinia() + "','" + paciente.getSenha() + "','"
            + paciente.getEstadoCivil() + "','" + paciente.getRg() + "','" + paciente.getOrgaoEmissor() + "','" + paciente.getDataExpedicao() + "','" 
            + paciente.getUf() + "','" + "" + "','" + paciente.getNomePai()+ "','" + paciente.getNomeMae() + "','" + paciente.getNome() + "','"
            + paciente.getSus() + "','" + "" + "','" + paciente.getNacionalidade() + "','" + paciente.getNaturalidade() + "','"
            + paciente.getNascimento() + "','" + paciente.getCpf() + "');";

        execute(sql);
        endConnectionSemResultSet();
    }    
    public static void adicionaEvento (Evento evento) {
        String sql = "INSERT INTO Evento VALUES ('" + evento.getTitulo() + "','" + evento.getInformacao() + "','" 
            + evento.getDataPublicao() + "','" + evento.getDataExpirar() + "','" + evento.getId() + "','" + evento.getMatriculaProfissional() + "');";

        execute(sql);
        endConnection();
    } 
    
    
    
    // GERAR NOVA CHAVE PRIMÁRIA
    public static String novoIdMedicamento (){
        String sql = "SELECT * FROM Medicamento;";
        execute(sql);
        
        boolean achouIgual = true;
        while (achouIgual == true){
            String novaMatricula = Integer.toString((int)(Math.random() * 100000));  // gerar id aleatório
            if (novaMatricula.length() == 5){
                try {
                     while (resultSet.next()){
                        String m = resultSet.getString("id");

                        if (novaMatricula.equals(m)){
                            break;
                        }
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
           
                if (achouIgual == true){
                    return novaMatricula;
                }
            }
        }
        endConnection();
        return null;
    }
    public static int novoIdEvento () {
        String sql = "SELECT * FROM Evento;"; 
        execute(sql);
        
        boolean sairLoop = true;
        while (sairLoop == true){
            String novaMatricula = Integer.toString((int)(Math.random() * 100000));
            if (novaMatricula.length() == 5){
                try {
                    while (resultSet.next()){
                        String m = resultSet.getString("id");

                        if (novaMatricula.equals(m)){
                            break;
                        }
                    }  
                    if (sairLoop == true){
                        return Integer.parseInt(novaMatricula);
                    }
                }
                catch (SQLException ex){
                    System.err.println(ex.getMessage());
                }

            }
        }
        endConnection();
        return 0;
    }   
    public static int novoIdConsulta () {
        String sql = "SELECT * FROM Consulta;"; 
        execute(sql);
        
        boolean sairLoop = true;
        while (sairLoop == true){
            String novaMatricula = Integer.toString((int)(Math.random() * 100000));
            if (novaMatricula.length() == 5){
                try {
                    while (resultSet.next()){
                        String m = resultSet.getString("id");
                        
                        if (novaMatricula.equals(m)){
                            break;
                        }
                    }
                    
                    if (sairLoop == true){
                        return Integer.parseInt(novaMatricula);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
        
        endConnection();
        return 0;
    }    
    public static String novaMatricula () {
        String sql = "SELECT * FROM Profissional;"; 
        execute(sql);
        
        boolean sairLoop = true;
        while (sairLoop == true){
            String novaMatricula = Integer.toString((int)(Math.random() * 100000));
            if (novaMatricula.length() == 5){
                try {
                    while (resultSet.next()){
                        String m = resultSet.getString("matricula");
                        
                        if (novaMatricula.equals(m)){
                            break;
                        }
                    }
                    
                    if (sairLoop == true){
                        return novaMatricula;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AcessoBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        endConnection();
        return null;
    }

    
    
    // PARTE DE BUSCAS NO BANCO DE DADOS
    public static boolean cpfJaExiste (String cpf){
        String sql = "SELECT cpf FROM Paciente";
        execute(sql);
    
        try {
            while (resultSet.next()){
                String cpfExiste = resultSet.getString("cpf");
                if (cpfExiste.equals(cpf)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }
    public static Funcionario fazerLogin (String matricula, String senha) {
        String sql = "SELECT * FROM Profissional;";
        execute(sql);
      
        try {
            while (resultSet.next()){
                String s = resultSet.getString("senha");
                String m = resultSet.getString("matricula");
                
                if (s.equals(senha) && m.equals(matricula)){
                    Funcionario funcionario = new Funcionario(resultSet.getString("nome"),
                            senha, matricula, resultSet.getString("tipoAcesso"), resultSet.getString("funcao"));
                    return funcionario;
                }
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    
        endConnection();
        return null;
    }
    
    
    // AÇÕES QUE O PROFISSIONAL PODE FAZER
    
    public static void preescreverMedicamento (Medicamento medicamento){
        String sql = "INSERT INTO Medicamento VALUES ('" + medicamento.getNome() + "','" + medicamento.getDataFinal()+ "','" + medicamento.getDataInicial()+ "','" +
            medicamento.getIntervaloHoras() + "','" + medicamento.getId() + "','" +  medicamento.getCpfPaciente() + "','" + medicamento.getMatriculaProfissional() + "');";
        
        execute(sql);
        endConnectionSemResultSet();
    }
    
    
    
    
}
