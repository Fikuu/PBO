/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

/**
 *
 * @author Fikri
 */
public class BukuAlamat {
    public static void main(String[] args) {
            
        String [][] entry = {{"Florence", "735-1234", "Manila"},      
        {"Joyce", "983-3333", "Quezon City"}, 
        {"Becca", "456-3322", "Manila"}};
        int i;
        
        for(i=0;i<entry.length;i++)
        {
           System.out.println("Nama        : "+entry[i][0]);
           System.out.println("Tel         : "+entry[i][1]);
           System.out.println("Address     : "+entry[i][2]+"\n");
        }
        
    }
   
}
