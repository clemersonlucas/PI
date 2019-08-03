package model;

import controller.Paciente;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class AcessoBanco {
    
    // String para o caminho do arquivo do banco
    private static final String CAMINHO_BANCO = 
            "/home/clmr/NetBeansProjects/Projeto Integrador/src/model/MySQL.ban";
    

    // vamos criar um banco apenas para o paciente
    public static ArrayList<Paciente> bancoPaciente = new ArrayList<>();
    
    
    // assim que iniciar o Array List será iniciado
    public AcessoBanco (){
        
    }
    
    public static void escreverPaciente (Paciente paciente){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(CAMINHO_BANCO);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            
            // importante fechar os objetos de escrita
            bufferedOutputStream.close();
            fileOutputStream.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("Erro: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }   


    public static void lerPacientes (){
        try {
            FileInputStream fileInputStream = new FileInputStream(CAMINHO_BANCO);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            
            // escrever os dados no arrayList
            
            Paciente paciente = (Paciente) fileInputStream.read();
            bancoPaciente.add(paciente);
            
            
            // importante fechar os objetos de escrita
            bufferedInputStream.close();
            fileInputStream.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("Erro: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }   
    



    
}
