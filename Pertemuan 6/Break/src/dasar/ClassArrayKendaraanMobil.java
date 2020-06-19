/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author G531GD
 */

import java.util.*;

public class ClassArrayKendaraanMobil 
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        
        String mobil [][] = {
            {"Avanza","Toyota","150000000"},
            {"Brio","Honda","130000000"},
            {"Nissan","Daihatsu","20000000"}
        };
        
        System.out.print(" Cari Mobil :");
        String cari = a.next();
        String merek="";
        int harga = 0;
        int i,j;
        
        boolean found = false;
        
        
        searchLabel:
        for( i=0;i<mobil.length;i++)
        {
            for ( j=0;j<mobil[i].length;i++)
            {
                if(cari.equals(mobil[i][j]))
                {
                    found = true;
                    merek = mobil[i][1];
                    harga = Integer.parseInt(mobil[i][2]);
                    break searchLabel;
                }
            }
        }
        
        if(found)
        {
            System.out.println("Mobil " + cari + " Merek " + merek + " Harga " + harga );
            
            if(cari.equals("Avanza"))
            {
                System.out.print("Banyak beli :");
                long banyak =Long.parseLong(a.next());
                
                long hrg = Long.parseLong(mobil[i][2]);
                long total = banyak * hrg;
                long disc =(long) (0.03 * total);
                long pajak =(long) (0.1 * total);
                long bayar = total + pajak - disc;
                
                System.out.println("Total Bayar :Rp. " + total);
                System.out.println("Discount :Rp. " + disc);
                System.out.println("Pajak :Rp. " + pajak);
                System.out.println("Total Keseluruhan :Rp. " + bayar);
                
            }
            
           else if(cari.equals("Brio"))
            {
                System.out.print("Banyak beli :");
                long banyak =Long.parseLong(a.next());
                
                long hrg = Long.parseLong(mobil[i][2]);
                long total = banyak * hrg;
                long disc =(long) (0.02 * total);
                long pajak =(long) (0.1 * total);
                long bayar = total + pajak - disc;
                
                System.out.println("Total Bayar :Rp. " + total);
                System.out.println("Discount :Rp. " + disc);
                System.out.println("Pajak :Rp. " + pajak);
                System.out.println("Total Keseluruhan :Rp. " + bayar);
                
            }
            
           else if(cari.equals("Nissan"))
            {
                System.out.print("Banyak beli :");
                long banyak =Long.parseLong(a.next());
                
                long hrg = Long.parseLong(mobil[i][2]);
                long total = banyak * hrg;
                long disc =(long) (0.02 * total);
                long pajak =(long) (0.1 * total);
                long bayar = total + pajak - disc;
                
                System.out.println("Total Bayar :Rp. " + total);
                System.out.println("Discount :Rp. " + disc);
                System.out.println("Pajak :Rp. " + pajak);
                System.out.println("Total Keseluruhan :Rp. " + bayar);
                
            }
            else
           {
               System.out.println("Tidak Ketemu !!!");
           }
        }
        else
        {
            System.out.println("Tidak Ketemu ");
        }
 
    }
}
