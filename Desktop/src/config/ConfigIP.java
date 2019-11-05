package config;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ConfigIP {
    private static final String PATH_ABSOLUTE_DEFAULT = "src/config/IP.txt";
    private static final String PATH_ABSOLUTE_HISTORY = "src/config/History.txt";

    public static void writer (String ip){
        try {
	    FileWriter fw = new FileWriter (new File(PATH_ABSOLUTE_DEFAULT));
	    BufferedWriter bw = new BufferedWriter (fw);
	    PrintWriter pw = new PrintWriter (bw);

            pw.println (ip);
	    pw.close();
	    bw.close();
	    fw.close();
        }
        catch (IOException ex){
            System.err.println ("IOException");
        }
    }

    public static String read (){
        String leitura = "";
        try {
            Scanner scanner = new Scanner (new File(PATH_ABSOLUTE_DEFAULT)); 
	    while (scanner.hasNext()){
		leitura = scanner.nextLine();
            }
            scanner.close();

        }
        catch (FileNotFoundException ex){
            System.err.println ("FileNotFoundException");
        }

        return leitura;
    }
    
    
    
    public static String[] readHistoryIp (){
        ArrayList<String> lista = new ArrayList<>();
        try {
            Scanner scanner = new Scanner (new File(PATH_ABSOLUTE_HISTORY)); 
	    while (scanner.hasNext()){
		lista.add(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }
        //convertion from arrayList for vector
        String[] vetor = new String [lista.size()];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lista.get(i);
        }
        return vetor;
    }
    
    public static void writerIpHistory (String ip){
        try {
	    FileWriter fw = new FileWriter (new File(PATH_ABSOLUTE_HISTORY), true);
	    BufferedWriter bw = new BufferedWriter (fw);
	    PrintWriter pw = new PrintWriter (bw);

            pw.println (ip);
	    pw.close();
	    bw.close();
	    fw.close();
        }
        catch (IOException ex){
            System.err.println ("IOException");
        }
    }  
    
    
}
