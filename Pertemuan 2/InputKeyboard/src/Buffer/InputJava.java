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
public class InputJava {
     public static void main(String[] args)
    {
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
               
       int a,b,hasil;               
               try {
                   System.out.println("Masukkan Nilai A :");
                   a=Integer.parseInt(input.readLine());
                   System.out.println("Masukkan Nilai B :");
                   b=Integer.parseInt(input.readLine());
                   hasil=a+b;
                   System.out.println("Hasilnya : "+hasil);
                   } 
               catch (Exception e)
               {
                   System.out.println("Eror");
               }
    }
}
