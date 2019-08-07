package model;

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
    
  
    public static Medico medicoLogado;
    
    
    public static final String DELIMITADOR = ":";
    public static final String CAMINHO = "src//model//Banco.txt";

    public static ArrayList<Medico> banco = new ArrayList<Medico>();
    
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
}
    