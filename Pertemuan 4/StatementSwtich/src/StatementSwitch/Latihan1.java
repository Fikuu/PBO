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
public class Latihan1 
{
    public static void main(String[] args) 
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        int pil1,a,b,pil3,p,l;
        String pil2;
        double hasil;
        
        try 
        {   
            System.out.println("1. Aritmatika"+"\n"+"2. Bangun Datar");
            System.out.println("Pilihan : ?");
            pil1=Integer.parseInt(input.readLine());
            
            switch(pil1)
            {
                case 1: System.out.println("1. Aritmatika ");
                        System.out.println("+\n"+"-\n"+"/\n"+"*");
                        System.out.println("Pilihan :?");
                        pil2=input.readLine();
                        
                        if(pil2.equals("+"))
                        {
                            System.out.println("==Penjumlahan==");
                            System.out.println("Masukkan Nilai A :");
                            a=Integer.parseInt(input.readLine());
                            
                            System.out.println("Masukkan Nilai B :");
                            b=Integer.parseInt(input.readLine());
                            
                            hasil=a+b;
                            
                            System.out.println("Hasil Penjumlahan = "+hasil);
                        }
                         
                        if(pil2.equals("-"))
                        {
                            System.out.println("==Penguarngan==");
                            System.out.println("Masukkan Nilai A :");
                            a=Integer.parseInt(input.readLine());
                            
                            System.out.println("Masukkan Nilai B :");
                            b=Integer.parseInt(input.readLine());
                            
                            hasil=a-b;
                            
                            System.out.println("Hasil Pengurangan = "+hasil);
                        }
                        
                        if(pil2.equals("/"))
                        {
                            System.out.println("==Pembagian==");
                            System.out.println("Masukkan Nilai A :");
                            a=Integer.parseInt(input.readLine());
                            
                            System.out.println("Masukkan Nilai B :");
                            b=Integer.parseInt(input.readLine());
                            
                            hasil=a/b;
                            
                            System.out.println("Hasil Pembagian = "+hasil);
                        }
                        
                        if(pil2.equals("*"))
                        {
                            System.out.println("==Perkalaiann==");
                            System.out.println("Masukkan Nilai A :");
                            a=Integer.parseInt(input.readLine());
                            
                            System.out.println("Masukkan Nilai B :");
                            b=Integer.parseInt(input.readLine());
                            
                            hasil=a*b;
                            
                            System.out.println("Hasil Perkalian = "+hasil);
                        }
                         break;
                         
                case 2: System.out.println("2. Bangun Datar ");
                        System.out.println("1. Persegi\n"+"2. Persegi Panjang\n"+"3. Lingkaran\n");
                        System.out.println("Pilihan :?");
                        pil2=input.readLine();
                        
                        if(pil2.equals("Persegi"))
                        {
                            System.out.println("1. Luas \n2. Keliling");
                            System.out.println("Pilihan : ?");
                            pil2=input.readLine();
                            if(pil2.equals("Luas"))
                            {
                                System.out.println("Luas");
                                System.out.println("Masukkan Sisi ");
                                a=Integer.parseInt(input.readLine());
                                
                                System.out.println("Masukkan Sisi ");
                                b=Integer.parseInt(input.readLine());
                                
                                hasil=a*b;
                                System.out.println("Luas = "+hasil);
                               
                            }
                            if(pil2.equals("Keliling"))
                            {
                                System.out.println("Luas");
                                System.out.println("Masukkan Sisi ");
                                a=Integer.parseInt(input.readLine());
                                
                                hasil=4*a;
                                System.out.println("Keliling = "+hasil);
                               
                            }
                            
                        }
                        if(pil2.equals("Persegi Panjang"))
                        {
                            System.out.println("1. Luas \n2. Keliling");
                            System.out.println("Pilihan : ?");
                            pil2=input.readLine();
                            if(pil2.equals("Luas"))
                            {
                                System.out.println("Luas");
                                System.out.println("Masukkan Panjang ");
                                a=Integer.parseInt(input.readLine());
                                
                                System.out.println("Masukkan Lebar ");
                                b=Integer.parseInt(input.readLine());
                                
                                hasil=a*b;
                                System.out.println("Luas = "+hasil);
                               
                            }
                            if(pil2.equals("Keliling"))
                            {
                                System.out.println("Luas");
                                System.out.println("Masukkan Panjang ");
                                a=Integer.parseInt(input.readLine());
                                
                                System.out.println("Masukkan Lebar ");
                                b=Integer.parseInt(input.readLine());
                                
                                hasil=2*a+2*b;
                                System.out.println("Keliling = "+hasil);
                               
                            }
                            
                        }
                        if(pil2.equals("Lingkaran"))
                        {
                            System.out.println("1. Luas \n2. Keliling");
                            System.out.println("Pilihan : ?");
                            pil2=input.readLine();
                            if(pil2.equals("Luas"))
                            {
                                System.out.println("Luas");
                                System.out.println("Masukkan Jari - Jari ");
                                a=Integer.parseInt(input.readLine());
                               
                                hasil=3.14*a*a;
                                System.out.println("Luas = "+hasil);
                               
                            }
                            if(pil2.equals("Keliling"))
                            {
                                System.out.println("Luas");
                                System.out.println("Masukkan Panjang ");
                                a=Integer.parseInt(input.readLine());
                                
                                hasil=2*3.14*a;
                                System.out.println("Keliling = "+hasil);  
                            }  
                        }
                        break;
            }   
        } catch (Exception e) 
        {
            System.err.println("Eror)");
        }
    }
    
   
}
