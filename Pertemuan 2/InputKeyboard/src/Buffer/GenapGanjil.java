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
public class GenapGanjil {
       public static void main(String[] args)
    {
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
               
       int nilai,i;
               try {
                   System.out.println("Masukkan Nilai  :");
                   nilai=Integer.parseInt(input.readLine());
                   for(i=1;i<=nilai;i++)
                   {
                       if(i %2==0)
                       {
                       System.out.println("Bil ke  "+i+" "+"genap");
                       }
                       else
                       {
                           System.out.println("Bil ke  "+i+" "+"ganjil");
                       }
                   }
                   }
               catch (Exception e)
               {
                   System.out.println("Eror");
               }
    }
}
