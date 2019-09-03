package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    
    public static String conectar () {
        try {
            Class.forName("com.mysql.jdbc.driver");       
            Connection connection = DriverManager.
            getConnection("jdbc:mysql://localhost/Conexao_Mercado", "root", "pamonha");

            Statement statement = connection.createStatement();
            boolean resultado = statement.execute("select * from Aluno");
            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()){
                System.out.println(resultSet.getString("nome"));
            }        

            resultSet.close();
            statement.close();
            connection.close();
            
            return "Conexão estabelecida";
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
        
        return "Servidor indisponivel";
    }
}
