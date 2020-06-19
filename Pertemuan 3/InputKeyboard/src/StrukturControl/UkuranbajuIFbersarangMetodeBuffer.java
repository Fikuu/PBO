/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturControl;

import java.io.*;

/**
 *
 * @author LABP1KOMP
 */
public class UkuranbajuIFbersarangMetodeBuffer 
{
    public static void main(String[] args) 
    {
      BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
      int pil,pil1;
      
      try
      {
       System.out.println("Menu Baju");
       System.out.println("1. Polo");
       System.out.println("2. Guci");
       System.out.println("3. Kapuyuak");
       pil=Integer.parseInt(input.readLine());
        
    if(pil==1)
       {
           System.out.println("Masukkan Ukuran Baju :\n1. S \n2. M \n3. L");
           System.out.println("Pilih ==>");
           pil1=Integer.parseInt(input.readLine());
           
           if(pil1==1)
           {
               System.out.println("Baju Polo Ukuran S dengan harga RP.10k");
           }
           else if(pil==2)
           {
               System.out.println("Baju Polo Ukuran M dengan harga RP.15k");
           }
           else if(pil==3)
           {
               System.out.println("Baju Polo Ukuran M dengan harga RP.20k");
           }
       }
    else if(pil==2)
       {
           System.out.println("Masukkan Ukuran Baju :\n1. S \n2. M \n3. L");
           System.out.println("Pilih ==>");
           pil1=Integer.parseInt(input.readLine());
           
            if(pil1==1)
           {
               System.out.println("Baju Guci Ukuran S dengan harga RP.30k");
           }
           else if(pil==2)
           {
               System.out.println("Baju Polo Ukuran M dengan harga RP.35k");
           }
           else if(pil==3)
           {
               System.out.println("Baju Polo Ukuran M dengan harga RP.45k");
           }
       }
       
    else if(pil==3)
       {
           System.out.println("Masukkan Ukuran Baju :\n1. S \n2. M \n3. L");
           System.out.println("Pilih ==>");
           pil1=Integer.parseInt(input.readLine());
           
            if(pil1==1)
           {
               System.out.println("Baju Kapuyuak Ukuran S dengan harga RP.50k");
           }
           else if(pil==2)
           {
               System.out.println("Baju Kapuyuak Ukuran M dengan harga RP.55k");
           }
           else if(pil==3)
           {
               System.out.println("Baju kapuyuak M dengan harga RP.60k");
           }
       }
    }catch(IOException e)
    {
        System.err.println("eror");
    }
    }
}
