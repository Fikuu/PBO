/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buffer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author LABP1KOMP
 */
public class InputBuffer {
    public static void main(String[] args)
    {
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
               
               String nama ;
               try {
                   System.out.println("Masukkan Nama Anda :");
                   nama=input.readLine();
                   System.out.println("Selamat Datang : "+nama);
                   } 
               catch (Exception e){
                   System.out.println("Eror");
               }
    }
               }


            
    
    

