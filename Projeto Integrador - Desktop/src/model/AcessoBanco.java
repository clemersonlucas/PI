package model;

import controller.Consulta;
import controller.Evento;
import controller.Medico;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AcessoBanco {
    
    public static String irTela = "inicial";
    public static Medico medicoLogado;
    
    
    public static final String DELIMITADOR = ":";
    public static final String CAMINHO = "src//model//Banco.txt";
    public static final String CAMINHO2 = "src//model//Consulta.txt";
    public static final String CAMINHO3 = "src//model//Eventos.txt";

    public static ArrayList<Medico> banco = new ArrayList<Medico>();
    public static ArrayList<Consulta> consultas = new ArrayList<Consulta>();
    public static ArrayList<Evento> eventos = new ArrayList<Evento>();
    
    
    public static void writeDatabase (Medico medico){
        try {
            FileWriter fileWriter = new FileWriter(CAMINHO, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            // vamos escrever no arquivo
            printWriter.println(medico.getMatricula() + DELIMITADOR + medico.getCpf() 
                    + DELIMITADOR + medico.getSenha() + DELIMITADOR + medico.getNome());

            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
        }
    }
  
    
    public static void readDatabase (){
        try {
            Scanner leitura = new Scanner(new File (CAMINHO));
            banco.clear();
            
            while (leitura.hasNext()){
                String linha = leitura.nextLine();
                String vetor [] = linha.split(DELIMITADOR);
                banco.add(new Medico (vetor[0], vetor[1], vetor[2], vetor[3]));
            }
            
            
            leitura.close();
        } catch (FileNotFoundException ex) {
        }
    }
    
    public static String novaMatricula() {
         try {
            Scanner leitura = new Scanner(new File (CAMINHO));
            ArrayList<String> matriculasExistentes = new ArrayList<>();
               
            while (leitura.hasNext()){
                String linha = leitura.nextLine();
                String vetor [] = linha.split(DELIMITADOR);
                matriculasExistentes.add (vetor[0]);
            }
            
            
            while (true){
                boolean achou = false;
                int matriculaGerada = (int) (Math.random()*10000);
                String retorno = Integer.toString(matriculaGerada);
            
                for (String s : matriculasExistentes){
                    if (s.equalsIgnoreCase(retorno)){
                        achou = true;
                    }
                }
                
                if (achou == false){
                    return retorno;
                }
            }
            
            } catch (FileNotFoundException ex) {
        }
         
        return null;
    }
    
    
    
    
    
    public static void writeDatabaseConsulta (Consulta consulta){
        try {
            FileWriter fileWriter = new FileWriter(CAMINHO2, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            
            printWriter.println(consulta.getTurno() + DELIMITADOR + consulta.getData()
            + DELIMITADOR + consulta.getServico());           
            
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
        }
    }
  
    
    public static void readDatabaseConsulta (){
        try {
            Scanner leitura = new Scanner(new File (CAMINHO2));
            consultas.clear();
            
            while (leitura.hasNext()){
                String linha = leitura.nextLine();
                String vetor [] = linha.split(DELIMITADOR);
                consultas.add(new Consulta (vetor[0], vetor[1], vetor[2]));
            }
            
            
            leitura.close();
        } catch (FileNotFoundException ex) {
        }
    }


//################ ADICIONAMOS MÉTODOS PARA CRIAR NOVOS EVENTOS E ETC
    
    public static void writeDatabaseEvento (Evento evento){
        try {
            FileWriter fileWriter = new FileWriter(CAMINHO3, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            
            printWriter.println(evento.getDescricao()+ DELIMITADOR + evento.getData());           
            
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
        }
    }
  
    
    public static void readDatabaseEvento (){
        try {
            Scanner leitura = new Scanner(new File (CAMINHO3));
            eventos.clear();
            
            while (leitura.hasNext()){
                String linha = leitura.nextLine();
                String vetor [] = linha.split(DELIMITADOR);
                eventos.add(new Evento (vetor[0], vetor[1]));
            }
            
            
            leitura.close();
        } catch (FileNotFoundException ex) {
        }
    }   

}
    