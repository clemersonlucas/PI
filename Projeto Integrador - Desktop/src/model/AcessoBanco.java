package model;

import controller.Paciente;
import java.io.*;
import java.util.HashSet;


public class AcessoBanco {
    public static final String PATH_ABSOLUTO = "src//model//MySQL.ban";
    
    public static HashSet <Paciente> banco = new HashSet<>();
    
    public static void escreverObjeto (Paciente paciente) {
        try {
            banco = AcessoBanco.ler();
            FileOutputStream fileOutputStream = new FileOutputStream(PATH_ABSOLUTO);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
           
            // devemos escrever a linha na tabela ja existente 
            banco.add(paciente);
            objectOutputStream.writeObject(banco);
            
            objectOutputStream.close();
            fileOutputStream.close();
        
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
   public static HashSet<Paciente> ler (){
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH_ABSOLUTO);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            banco = (HashSet<Paciente>) objectInputStream.readObject();
    
        } catch (FileNotFoundException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (IOException ex) {
        }
        return banco;
    }
   
    public static boolean verficaCadastroUsuario (Paciente paciente){
        ler();
        
        for (Paciente p : banco){
            if (p.equals(paciente)){
                return true;
            }
        }
      
        return false;
    
    }
   
   
   

}