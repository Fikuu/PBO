/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;
import java.io.*;
/**
 *
 * @author Fikri
 */
public class NomorTerbesarBuffered {
    public static void main(String[] args) {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int hasil[]=new int [100];
        int i,max,banyak=10;
        
        try {
            System.out.println("Masukkan Angka");
            for(i=0;i<banyak;i++)
            {
                hasil[i]=Integer.parseInt(input.readLine());
            }
            System.out.println("Hasil :");
            for(i=0;i<banyak;i++)
            {
                System.out.println(" "+hasil[i]);
            }
            max=0;
            for(i=0;i<banyak;i++)
            {
                max=(max>hasil[i]) ? max:hasil[i];
            }
            System.out.println("\n Max :"+max);
            
        } catch (Exception e) {
        }
        
    }
}
