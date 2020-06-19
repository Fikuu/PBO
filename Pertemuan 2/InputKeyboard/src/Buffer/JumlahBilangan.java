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
public class JumlahBilangan {
     public static void main(String[] args)
    {
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
               
       int nilai,i;
               try {
                   System.out.println("Masukkan Nilai  :");
                   nilai=Integer.parseInt(input.readLine());
                   for(i=1;i<=nilai;i++)
                   {
                       System.out.println("Bil ke  "+i);
                   }
                   }
               catch (Exception e)
               {
                   System.out.println("Eror");
               }
    }
}
