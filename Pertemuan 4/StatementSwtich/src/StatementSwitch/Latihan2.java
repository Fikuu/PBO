/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatementSwitch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Fikri
 */
public class Latihan2 
{
       public static void main(String[] args) 
       {
           BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
           
           int pil,pil1,pil2;
           String pil3;
           
           try 
           {
               System.out.println("1. Baju\n2. Celana\n3. Exit");
               System.out.println("Pilihan : ?");
               pil=Integer.parseInt(input.readLine());
               
               switch(pil)
               {
                   case 1: System.out.println("===Merek Baju=== \n1. Adidas\n"+"2. Nike\n"+"================");
                           System.out.println("Pilihan : ?");
                           pil2=Integer.parseInt(input.readLine());
                           
                         switch(pil2)
                                    {

                                       case 1 : {
                                                    System.out.println("Adidas \n===Ukuran===\n1. S\n"+"2. M\n"+"3. L\n"); 
                                                    System.out.println("Pilihan : ?");
                                                    pil3=input.readLine(); 
                                              
                                                 
                                                    if((pil3.equals("S")))
                                                    {
                                                        System.out.println("S");
                                                        System.out.println("\nBaju Merek Adidas dengan Ukuran S berhaga = 25K");
                                                    }
                                                    else if(pil3.equals("M"))
                                                    {
                                                        System.out.println("M");
                                                        System.out.println("\nBaju Merek Adidas dengan Ukuran M berharga = 30K");
                                                    }
                                                    else if(pil3.equals("L"))
                                                    {
                                                        System.out.println("L");
                                                        System.out.println("\nBaju merek Adidas dengan Ukuran L berharga = 45k");
                                                    }
                                                    
                                                 }break;

                                       case 2 : {
                                                     System.out.println("Nike \n===Tipe===\n1. Kaos\n"+"2. Krah\n"); 
                                                     System.out.println("Pilihan : ?");
                                                     pil3=input.readLine(); 
                                                     
                                                     if(pil3.equals(""))
                                                     {
                                                         System.out.println("");
                                                        System.out.println("\nBaju Merek Adidas dengan Ukuran S berhaga = 25K");
                                                     }
                                                }break;
                                                
                                    }
                                    
               }
           } catch (Exception e) {
           }
       }
       
}
