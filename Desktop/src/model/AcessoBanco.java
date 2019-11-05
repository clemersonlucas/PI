package model;

import controller.Consulta;
import controller.Estoque;
import controller.Evento;
import controller.Exame;
import controller.Funcionario;
import controller.Medicamento;
import controller.Paciente;
import controller.Vacina;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AcessoBanco {

    public static String user = "hospitaid";
    public static String password = "senhahospitaid";
    public static String nameClass = "com.mysql.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost/hospitaid";
    public static boolean result = false;
    public static ResultSet resultSet = null;
    public static Statement statement = null;
    public static Connection connection = null;

    
    // método para testar a conexão com um IP de u servidor
    public static boolean testConnection (String ip){
        String urlForTest = "jdbc:mysql://" + ip + "/hospitaid";
        try {
            Class.forName(nameClass);
            connection = DriverManager.getConnection(urlForTest, user, password);
            statement = connection.createStatement();
            statement.close();
            connection.close();
            return true;
        }
        catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } 
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        return false;
    }
    

    // MÉTODOS PARA A CONEXÃO COM O BANCO
    private static void execute (String comando){
        String ipConfigurado = config.ConfigIP.read();
        
        // vamos testar a conexão com o servidor para obter dados depois
        if (testConnection(ipConfigurado)){
            url = "jdbc:mysql://" + ipConfigurado + "/hospitaid";
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
        // deu erro ao se conectar com o servidor
        else {
            javax.swing.JOptionPane.showMessageDialog(null, "falha no servidor!");
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


    // DELETE
    public static void deletarMedicamento (int id){
        String sql = "DELETE FROM Estoque WHERE id = '" + id + "';";
        execute(sql);
        endConnectionSemResultSet();
    }
    public static void deletarEvento (int id) {
        String sql = "DELETE FROM Evento WHERE id = '"+ id +"';";
        execute(sql);
        endConnectionSemResultSet();
    }
    public static void deletarPaciente (String cpf){
        String sql = "DELETE FROM Paciente WHERE cpf = '" + cpf + "';";
        execute (sql);
        endConnectionSemResultSet();
    }


    // INSERT     
    public static void adicionaVacina (Vacina vacina){
        String sql = "INSERT INTO Vacinacao VALUES ('" + vacina.getData() + "','" + vacina.getId() + "','"
            + vacina.getMatriculaProfisional() + "','" + vacina.getCpfPaciente() + "','" + vacina.getIdEstoque() + "');";
    
        execute(sql);
        endConnectionSemResultSet();
    }
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
        endConnectionSemResultSet();
    }

    
    public static void adicionaExame (Exame exame){
        String sql = "INSERT INTO exame VALUES ('" + exame.getTipo() + 
                "','" + exame.getData() + "','"
                + exame.getId() + "','" + exame.getCpfPaciente() +
                "','" + exame.getMatriculaProfissional() + "');";
        
        execute(sql);
        endConnectionSemResultSet();
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
                    System.err.println(ex.getMessage());
                }
            }
        }

        endConnection();
        return null;
    }
    public static String novoIdVacinacao () {
        String sql = "SELECT id FROM Vacinacao;";
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
                        return novaMatricula;
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
        endConnection();
        return null;
    }


    // SELECT
    public static void preescreverMedicamento (Medicamento medicamento){
        String sql = "INSERT INTO Medicamento VALUES ('" + medicamento.getNome() + "','" + medicamento.getDataFinal()+ "','" + medicamento.getDataInicial()+ "','" +
        medicamento.getIntervaloHoras() + "','" + medicamento.getId() + "','" +  medicamento.getCpfPaciente() + "','" + medicamento.getMatriculaProfissional() + "');";
        execute(sql);
        endConnectionSemResultSet();
    }
    public static Paciente encontrarPaciente (String cpf){
        Paciente paciente = new Paciente ();
       
        // vamos pegar os telefones do paciente
        ArrayList<String> telefones = new ArrayList<>();
        String sql = "SELECT telefone FROM TelefonePaciente WHERE cpfPaciente = '" + cpf + "';";
        execute(sql);
        
        try {
            while (resultSet.next()){
                String telefone = resultSet.getString("telefone");
                telefones.add(telefone);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        endConnection();
                
        sql = "SELECT * FROM Paciente WHERE cpf = '" + cpf + "';";
        execute (sql);
        try {
            while (resultSet.next()){
                String sexo = resultSet.getString ("sexo");
                String etinia = resultSet.getString ("etinia");
                String senha = resultSet.getString ("senha");
                String estadoCivil = resultSet.getString ("estadoCivil");
                String rg = resultSet.getString ("rg");
                String orgaoEmissor = resultSet.getString ("orgaoEmissor");

                String dataExpedicao = resultSet.getString ("dataExpedicao");
                String uf = resultSet.getString ("uf");
                String observacoes = resultSet.getString ("observacoes");
                String nomePai = resultSet.getString ("nomePai");
                String nomeMae = resultSet.getString ("nomeMae");
                String nome = resultSet.getString ("nome");

                String sus = resultSet.getString ("sus");
                String fotoPerfil = resultSet.getString ("fotoPerfil");
                String nacionalidade = resultSet.getString ("nacionalidade");
                String naturalidade = resultSet.getString ("naturalidade");
                String nascimento = resultSet.getString ("nascimento");

                paciente = new Paciente(sexo, etinia, senha, estadoCivil, rg, 
                        orgaoEmissor, dataExpedicao, uf, observacoes, nomePai, 
                        nomeMae, nome, sus, fotoPerfil, nacionalidade, naturalidade, nascimento, cpf);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        paciente.setTelefones(telefones);

        endConnection();
        return paciente;
    }
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
        
        endConnection();
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
    // método responsável por pegar todos os eventos presentes no banco
    public static Evento[] pegarTodosEventos (){
        ArrayList<Evento> listaRetorno = new ArrayList<>();
        String sql = "SELECT * FROM Evento;";
        execute(sql);

        try {
            while (resultSet.next()){
                String titulo = resultSet.getString("titulo");
                String informacoes = resultSet.getString("informacao");
                String dataPublicacao = resultSet.getString("dataExpirar");
                int id = resultSet.getInt("id");
                String matriculaProfissional = resultSet.getString("matriculaProfissional");

                Evento e = new Evento(titulo, dataPublicacao, dataPublicacao,
                        informacoes, matriculaProfissional, id);

                listaRetorno.add(e);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        endConnection ();
        Evento [] vetor = new Evento[listaRetorno.size()];
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = listaRetorno.get(i);
            }
        return vetor;
    }
    // método responsável por adquirir todas as consultas que possuem
    // apenas o estado de "Aguardando avaliação"
    public static ArrayList<Consulta> pegarTodasConsultas() {
        String sql = "SELECT * FROM Consulta";
        execute(sql);
        ArrayList<Consulta> listaRetorno = new ArrayList<>();

        try {
            while (resultSet.next()){
                String status = resultSet.getString("status");

                if (status.equalsIgnoreCase("Aguardando avaliação")){
                    String data = resultSet.getString("data");
                    String descricao = resultSet.getString("descricao");
                    String hora = resultSet.getString("hora");
                    String inicioConsulta = resultSet.getString("inicioConsulta");
                    String fimConsulta = resultSet.getString("fimConsulta");
                    String entrada = resultSet.getString("entrada");
                    String especialidade = resultSet.getString("especialidade");
                    String matriculaProfissional = resultSet.getString("matriculaProfissional");
                    String cpfPaciente = resultSet.getString("cpfPaciente");
                    int id = resultSet.getInt("id");

                    Consulta c = new Consulta(data, descricao, hora, descricao,
                            status, inicioConsulta, fimConsulta, entrada, especialidade,
                            id, matriculaProfissional, cpfPaciente);
                    listaRetorno.add(c);
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        endConnection ();
        return listaRetorno;
    }
    public static String nomeCompletoPaciente (String cpf){
        String sql = "SELECT nome FROM Paciente WHERE cpf = '" + cpf + "';";
        execute(sql);
        String s = null;
        try {
            while (resultSet.next()){
                s = resultSet.getString("nome");
            }
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
        endConnection();
        return s;
    }
    public static String descobriNomePaciente (String cpf){
        String sql = "SELECT nome FROM Paciente WHERE cpf = '" + cpf + "';";
        execute(sql);
        String s = null;
        try {
            while (resultSet.next()){
                String vetor [] = resultSet.getString("nome").split(" ");
                s = vetor[0];
            }
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
        endConnection();
        return s;
    }
    public static ArrayList<Estoque> pegarMedicamentoEstoque (){
        ArrayList<Estoque> listaRetorno = new ArrayList<>();
        String sql = "SELECT * FROM Estoque";
        execute(sql);

        try{
            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String validade = resultSet.getString("validade");
                int quantidade = resultSet.getInt("quantidade");
                String descricao = resultSet.getString("descricao");
                String fabricacao = resultSet.getString("fabricacao");
                int id = resultSet.getInt("id");
                String matriculaProfissional = resultSet.getString("matriculaProfissional");
                listaRetorno.add(new Estoque(nome, validade, quantidade, descricao, fabricacao, id, matriculaProfissional));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        endConnection();
        return listaRetorno;
    } 
    public static ArrayList<String> pegaContatoPaciente (String cpf){
        String sql = "SELECT telefone FROM TelefonePaciente WHERE cpfPaciente = '" + cpf + "';";
        execute(sql);
        
        ArrayList<String> listaTelefone = new ArrayList<>();
        
        try {
            while (resultSet.next()){
                listaTelefone.add(resultSet.getString("telefone"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        endConnection();
        
        return listaTelefone;
    }    
    public static ArrayList<Consulta> consultasDeferidas (String especialidade){
        ArrayList<Consulta> retorno = new ArrayList<>();
        String sql = "SELECT * FROM Consulta WHERE status = 'Deferido' AND especialidade = '" + especialidade + "';";

        execute (sql);

        try {
            while (resultSet.next()){
                String status = resultSet.getString("status");
                String data = resultSet.getString("data");
                String descricao = resultSet.getString("descricao");
                String hora = resultSet.getString("hora");
                String inicioConsulta = resultSet.getString("inicioConsulta");
                String fimConsulta = resultSet.getString("fimConsulta");
                String entrada = resultSet.getString("entrada");
                String matriculaProfissional = resultSet.getString("matriculaProfissional");
                String cpfPaciente = resultSet.getString("cpfPaciente");
                int id = resultSet.getInt("id");

                Consulta c = new Consulta(data, descricao, hora, descricao,
                    status, inicioConsulta, fimConsulta, entrada, especialidade,
                    id, matriculaProfissional, cpfPaciente);
                retorno.add(c);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        endConnection ();
        return retorno;
    }
    public static String[] descobriNomeProfissional (String matricula){
        String sql = "SELECT nome, funcao FROM Profissional WHERE matricula = '" + matricula + "';";
        execute(sql);
        String s [] = new String[2];
        try {
            while (resultSet.next()){
                String vetor [] = resultSet.getString("nome").split(" ");
                String profissao = resultSet.getString("funcao");
                s [0] = vetor[0];
                s [1] = profissao;
            }
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }

        endConnection();
        return s;
    }
    

    // UPDATE
    public static void deferirConsulta (int id){
        String sql = "UPDATE Consulta SET status = 'Deferido' WHERE id = '" + id + "';";
        execute(sql);
        endConnectionSemResultSet ();
    }
    public static void indeferirConsulta (int id){
        String sql = "UPDATE Consulta SET status = 'Indeferido' WHERE id = '" + id + "';";
        execute(sql);
        endConnectionSemResultSet ();
    }
    public static void alterarEstadoCivilPaciente (String estadoCivil, String cpf){
        String sql = "UPDATE Paciente SET estadoCivil = '" + estadoCivil 
                + "' WHERE cpf = '" + cpf + "';";
        execute(sql);
        endConnectionSemResultSet ();
    }
    public static void alterarEvento (Evento evento){
        String sql = "UPDATE Evento SET titulo = '" + evento.getTitulo() + "', informacao = '"  + evento.getInformacao() + "', dataPublicacao = '" +
            evento.getDataPublicao() + "', dataExpirar = '" + evento.getDataExpirar() + "', matriculaProfissional = '" + evento.getMatriculaProfissional()
            + "' WHERE id = '" + evento.getId() + "';";

        execute(sql);
        endConnectionSemResultSet();
    }
    public static void updateQuantidadeMedicamento(int idEstoque, int quantidade) {
        String sql = "UPDATE Estoque SET quantidade = '" + quantidade  + "' WHERE id = '" + idEstoque + "';";
        execute(sql);
        endConnectionSemResultSet();
    }
    public static void consultarUmPacinte(String descricao, String diagnostico, String dataInicio, String dataFim, int id) {
        String sql = "UPDATE Consulta SET descricao = '" + descricao + "', diagnostico = '" + diagnostico
            + "', inicioConsulta = '" + dataInicio + "', fimConsulta = '" + dataFim + "' WHERE id =  '" + id + "';";
        execute(sql);
        endConnectionSemResultSet();
    }
}
