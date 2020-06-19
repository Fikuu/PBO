/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dasar;
import java.io.*;

/**
 *
 * @author Fikri
 */
public class latihan2 {
    public static void main(String args[]) throws IOException 
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String filename;
        FileInputStream fis = null;
        
        
        System.out.println("Apa Nama File Yang akan di Baca ????");
        System.out.print("-->>> ");
        filename = br.readLine();
         
        
        System.out.println("File yang di Baca dari  " + filename + "..."); 
        System.out.println("====================================================================");
        
         
    
    try 
    { 
        fis = new FileInputStream(filename); 
    } 
    catch (FileNotFoundException ex) 
    { 
        System.out.println("File not found."); 
    } 
    
    try 
    { 
        char data; 
        int temp; 
        
        do 
        { 
            temp = fis.read(); 
            data = (char) temp; 
            
            if (temp != -1) 
            { 

                    System.out.print(data);
                
                 
            }     
        } while (temp != -1); 
    } 
    
    catch (IOException ex) 
    { 
        System.out.println("Problem in reading from the file."); 
    }
    
    }
}
