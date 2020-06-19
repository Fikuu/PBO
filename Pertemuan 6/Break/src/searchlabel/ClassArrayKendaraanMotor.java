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

public class ClassArrayKendaraanMotor 
{
    public static void main(String[] args) 
    {
        Scanner a =new Scanner(System.in);
        
        String motor[][] = {
            {"Supra","Honda","15000000"},
            {"Vario","Yamaha","18000000"},
            {"Shogun","Suzuki","14000000"}            
        } ;
        

        System.out.print(" Cari Motor :");
        String cari = a.next();
        String merek="";
        int harga = 0;
        int i,j;
        
        boolean found = false;
        
        
        searchLabel:
        for( i=0;i<motor.length;i++)
        {
            for ( j=0;j<motor[i].length;i++)
            {
                if(cari.equals(motor[i][j]))
                {
                    found = true;
                    merek = motor[i][1];
                    harga = Integer.parseInt(motor[i][2]);
                    break searchLabel;
                }
            }
        }
        
        if(found)
        {
            System.out.println("Motor " + cari + " Merek " + merek + " Harga " + harga );
            
            if(cari.equals("Supra"))
            {
                System.out.print("Banyak beli :");
                long banyak =Long.parseLong(a.next());
                
                long hrg = Long.parseLong(motor[i][2]);
                long total = banyak * hrg;
                long disc =(long) (0.02 * total);
                long pajak =(long) (0.1 * total);
                long bayar = total + pajak - disc;
                
                System.out.println("Total Bayar :Rp. " + total);
                System.out.println("Discount :Rp. " + disc);
                System.out.println("Pajak :Rp. " + pajak);
                System.out.println("Total Keseluruhan :Rp. " + bayar);
                
            }
            
            else if(cari.equals("Vario"))
            {
                System.out.print("Banyak beli :");
                long banyak =Long.parseLong(a.next());
                
                long hrg = Long.parseLong(motor[i][2]);
                long total = banyak * hrg;
                long disc = (long)(0.04 * total);
                long pajak = (long) (0.1 * total);
                long bayar = total + pajak - disc;
                
                System.out.println("Total Bayar :Rp. " + total);
                System.out.println("Discount :Rp. " + disc);
                System.out.println("Pajak :Rp. " + pajak);
                System.out.println("Total Keseluruhan :Rp. " + bayar);
                
            }
            
           else if(cari.equals("Shogun"))
            {
                System.out.print("Banyak beli :");
                long banyak =Long.parseLong(a.next());
                
                long hrg = Long.parseLong(motor[i][2]);
                long total = banyak * hrg;
                long disc = (long)(0.06 * total);
                long pajak = (long)(0.1 * total);
                long bayar = total + pajak - disc;
                
                System.out.println("Total Bayar :Rp. " + total);
                System.out.println("Discount :Rp. " + disc);
                System.out.println("Pajak :Rp. " + pajak);
                System.out.println("Total Keseluruhan :Rp. " + bayar);
                
            }
            else
           {
               System.out.println("Tidak Ditemukan !!!");
           }
        }
        else
        {
            System.out.println("Tidak Ketemu ");
        }
        
        
        
    }
}
