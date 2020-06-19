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
public class Grade {
     public static void main(String[] args)
    {
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
               
       int nilai;
               try {
                   System.out.println("Masukkan Nilai  :");
                   nilai=Integer.parseInt(input.readLine());
                   if(nilai>=70)
                   {
                   System.out.println("Anda lulus karena nilai >= "+nilai);
                   } 
                   else
                   {
                   System.out.println("Anda gagal karena nilai < "+nilai);
                   }
                   }
               catch (Exception e)
               {
                   System.out.println("Eror");
               }
    }
}
