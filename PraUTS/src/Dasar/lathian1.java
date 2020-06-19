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
public class lathian1 
{
    public static void main(String[] args) throws IOException
    {
        
        String filename;
        BufferedReader a = new BufferedReader ( new InputStreamReader(System.in));
        FileOutputStream fos = null;
        
        System.out.println("Apa Nama File Yang Akan Di Tulis ???");
        System.out.print("-->>> ");
        filename = a.readLine();
        
        
        System.out.println("Tulislah Sebuah Data yang akan di Tulis Ke [  " + filename + " ] ");
        System.out.println("Type *$ to end.");
        System.out.println("===============================================================================");
        
        
        
        try
        {
            fos = new FileOutputStream(filename);
        }
        catch ( FileNotFoundException ex)
        {
            System.err.println("File Tidak Dapat Di Buka !!");
        }
        
        try
        {
            boolean done = false;
            int data;
            
            do
            {
                data = a.read();
                if((char) data == ' ')
                {
                    fos.write('_');
                    fos.write(data);
                }
                
                else if((char) data == '*')
                {
                    data = a.read();
                    
                    if ( (char) data == '$')
                    {
                        done = true;
                    }
                    else
                    {
                        fos.write('q');
                        fos.write(data);
                    }
                }
                else 
                {
                    fos.write(data);
                }
            }
            while(!done);
                 
        }
        catch ( IOException ex )
        {
            System.out.println("Problem in reading from the file.");
        }
        
    }
    
}
