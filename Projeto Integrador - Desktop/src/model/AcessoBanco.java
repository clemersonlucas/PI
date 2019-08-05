package model;

import controller.Paciente;
import java.io.*;
import java.util.ArrayList;


public class AcessoBanco {
    public static final String PATH_ABSOLUTO = "src//model//MySQL.ban";
    
    public static ArrayList <Paciente> arrayList = new ArrayList<>();    
   
    public static void atualizarArray (){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PATH_ABSOLUTO);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList);
            
            objectOutputStream.close();
            fileOutputStream.close();
        
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }      
    }    
    
    public static void escreverObjeto (Paciente paciente) {
        try {
            arrayList = AcessoBanco.lerObjetos ();
            FileOutputStream fileOutputStream = new FileOutputStream(PATH_ABSOLUTO);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
           
            
            // devemos escrever a linha na tabela ja existente 
            arrayList.add(paciente);
            objectOutputStream.writeObject(arrayList);
            
            objectOutputStream.close();
            fileOutputStream.close();
        
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
  
    public static ArrayList<Paciente> lerObjetos (){
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH_ABSOLUTO);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            arrayList = (ArrayList<Paciente>) objectInputStream.readObject();
    
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
        return arrayList;
    }
}