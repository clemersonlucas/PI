package model;

import controller.Funcionario;
import controller.Paciente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AcessoBanco {
    
    public static Funcionario funcionario = new Funcionario("", "");
    public static final String DELIMITADOR = ":";
   
    
    public static ArrayList<Paciente> pacientes = new ArrayList<>();
    public static final String CAMINHO_PACIENTE = "src//model//Pacientes.txt";
    
    
    public static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public static final String CAMINHO_FUNCIONARIO = "src//model//Funcionarios.txt";
    
    
    public static void writeDatabaseFuncionario (Funcionario funcionario){
        try {
            FileWriter fileWriter = new FileWriter(CAMINHO_FUNCIONARIO, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            // vamos escrever no arquivo
            printWriter.println(funcionario.getMatricula() + DELIMITADOR + 
            funcionario.getNome() + DELIMITADOR + funcionario.getSenha() + DELIMITADOR +
            funcionario.getFuncao() + DELIMITADOR + funcionario.getAcesso());
                    
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
        }
    }
  
    
    public static void readDatabaseFuncionario (){
        try {
            Scanner leitura = new Scanner(new File (CAMINHO_FUNCIONARIO));
            funcionarios.clear();
            
            while (leitura.hasNext()){
                String linha = leitura.nextLine();
                String vetor [] = linha.split(DELIMITADOR);
                funcionarios.add(new Funcionario(vetor[0], vetor[1], vetor[2], vetor[3], vetor[4]));
            }
            
            
            leitura.close();
        } catch (FileNotFoundException ex) {
        }
    }    
    
    
    
    public static String novaMatricula() {
        try {
            Scanner leitura = new Scanner(new File (CAMINHO_FUNCIONARIO));
            ArrayList<String> matriculasExistentes = new ArrayList<>();
               
            while (leitura.hasNext()){
                String linha = leitura.nextLine();
                String vetor [] = linha.split(DELIMITADOR);
                matriculasExistentes.add (vetor[0]);
            }
            
            
            while (true){
                boolean achou = false;
                int matriculaGerada = (int) (Math.random()*100000);
                String retorno = Integer.toString(matriculaGerada);
            
                for (String s : matriculasExistentes){
                    if (s.equalsIgnoreCase(retorno)){
                        achou = true;
                    }
                }
                
                if (achou == false && retorno.length() == 5){
                    return retorno;
                }
            }
            
            } catch (FileNotFoundException ex) {
        }
        return null;
    }
    
    
    
    
    // PARA ESCREVER O USUÁRIO NO BANCO DE DADOS
    public static void writeDatabasePaciente (Paciente paciente){
        try {
            FileWriter fileWriter = new FileWriter(CAMINHO_PACIENTE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            // vamos escrever no arquivo
            printWriter.println();
                    
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
        }
    }
  
    
    public static void readDatabasePaciente (){
        try {
            Scanner leitura = new Scanner(new File (CAMINHO_PACIENTE));
            pacientes.clear();
            
            while (leitura.hasNext()){
                String linha = leitura.nextLine();
                String vetor [] = linha.split(DELIMITADOR);
            //    pacientes.add(new Funcionario(vetor[0], vetor[1], vetor[2], vetor[3], vetor[4]));
            
            
            
            
            }
            
            
            leitura.close();
        } catch (FileNotFoundException ex) {
        }
    }    
        
    
    
    
    
    
}
