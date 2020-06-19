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
import java.io.*;
public class ClassJualBaju 
{
    public static void main(String[] args) 
    {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        
        String ulang;
        
        try
        {
            do 
            {
            System.out.println("=== Menu ===");
            System.out.println("1. Baju \n 2. Celana \n 3. Exit");
            System.out.print("Pilih :");
            int pil1 = Integer.parseInt(a.readLine());
            
            switch (pil1)
            {
                case 1: 
                {
                    System.out.println(" Menu Baju ");
                    System.out.println("1. Adidas \n 2. Nike  ");
                    System.out.print("Pilih : ");
                    int pil2 = Integer.parseInt(a.readLine());
                    
                    switch (pil2)
                    {
                        case 1 : 
                        {
                            System.out.println(" ADIDAS");
                            System.out.print("Pilih Ukuran 1. S\n2. L\n3. M");
                            String pil3 = a.readLine();
                            
                            if(pil3.equals("S") || pil3.equals("s"))
                            {
                                System.out.println("Baju Adidas Ukuran S Seharga = 30k");
                                System.out.print("Banyak Beli : ");
                                double banyak = Double.parseDouble(a.readLine());
                                
                                double jumlah = 30000* banyak ;
                                
                                System.out.println(" Total Bayar : Rp." +jumlah);
                            }
                            else if (pil3.equals("M") || pil3.equals("m"))
                            {
                                System.out.println("Baju Adidas Ukuran M Seharga = 35k");
                                System.out.println("Banyak Beli : ");
                                double banyak =  Double.parseDouble(a.readLine());
                                
                                double jumlah = 35000 * banyak ;
                                
                                System.out.println(" Total Bayar : Rp." +jumlah);
                            }
                            else if (pil3.equals("L") || pil3.equals("l"))
                            {
                                System.out.println("Baju Adidas Ukuran L Seharga = 40k");
                                System.out.println("Banyak Beli : ");
                                double banyak =  Double.parseDouble(a.readLine());
                                
                                double jumlah = 40000 * banyak ;
                                
                                System.out.println(" Total Bayar : Rp." +jumlah); 
                            }
                            else
                            {
                                System.err.println("Maaf, Ukuran Belum Ada !!!");
                            }
                                
                        }break;
                        
                        case 2 : 
                        {
                            System.out.println(" NIKE ");
                            System.out.println("Pilihan Tipe: \n 1. KAOS \n 2. KRAH ");
                            System.out.print("Pilih : ");
                            String pil4 = a.readLine();
                            
                            if(pil4.equals("Kaos") || pil4.equals("KAOS") || pil4.equals("kaos") )
                            {
                                System.out.println("KAOS");
                                System.out.print("Ukuran 1. S\n2. M\n3. L\n");
                                String pil5 = a.readLine();
                                
                                if(pil5.equals("S") || pil5.equals("s"))
                                {
                                    System.out.println("Baju Merek Nike Ukuran S Seharga = 36K");
                                    System.out.print("Banyak Beli : ");
                                    double banyak = Double.parseDouble(a.readLine());
                                    
                                    double jumlah = 36000 * banyak;
                                    
                                    System.out.println("Total Bayar : Rp." +jumlah);
                                }
                                else if (pil5.equals("M") || pil5.equals("m"))
                                {
                                    System.out.println("Baju Merek Nike Ukuran M Seharga = 40K");
                                    System.out.print("Banyak Beli : ");
                                    double banyak = Double.parseDouble(a.readLine());
                                    
                                    double jumlah = 40000 * banyak;
                                    
                                    System.out.println("Total Bayar : Rp." +jumlah);
                                }
                                else if ( pil5.equals("L") || pil5.equals("l"))
                                {
                                    System.out.println("Baju Merek Nike Ukuran L Seharga = 45K");
                                    System.out.print("Banyak Beli : ");
                                    double banyak = Double.parseDouble(a.readLine());
                                    
                                    double jumlah = 45000 * banyak;
                                    
                                    System.out.println("Total Bayar : Rp." +jumlah);
                                }
                                else 
                                {
                                    System.out.println("Maaf, Ukuran tidak ada !!!");
                                }
                            }
                            
                            else if (pil4.equals("KRAH") || pil4.equals("Krah") || pil4.equals("krah") )
                            {
                                System.out.println("KRAH ");
                                System.out.println(" Tipe\n 1. Lengan Panjang \n 2. Lengan Pendek");
                                System.out.print("Pilih : ");
                                
                                String pil6 = a.readLine();
                                
                                if(pil6.equals("Lengan Panjang") || pil6.equals("lengan panjang "))
                                {
                                    System.out.println("Tipe Lengan Panjang");
                                    System.out.print("Ukuran 1. S\n2. M\n3. L\n: ");
                                    String pil7 = a.readLine();
                                    
                                    if(pil7.equals("S")||pil7.equals("s"))
                                    {
                                        System.out.println("Baju Nike Tipe Krah Ukuran S Lengan Panjang Seharga =52K");
                                        System.out.println("Banyak Beli : ");
                                        double banyak = Double.parseDouble(a.readLine());
                                        
                                        double jumlah = 520000 * banyak ;
                                        
                                        System.out.println("Total Bayar : Rp." +jumlah);
                                    }
                                    
                                    else if(pil7.equals("M")||pil7.equals("m"))
                                    {
                                        System.out.println("Baju Nike Tipe Krah Ukuran M Lengan Panjang Seharga = 50K");
                                        System.out.println("Banyak Beli : ");
                                        double banyak = Double.parseDouble(a.readLine());
                                        
                                        double jumlah = 50000 * banyak ;
                                        
                                        System.out.println("Total Bayar : Rp." +jumlah);
                                    }
                                    
                                    else if(pil7.equals("L")||pil7.equals("l"))
                                    {
                                        System.out.println("Baju Nike Tipe Krah Ukuran L Lengan Panjang Seharga = 60K");
                                        System.out.println("Banyak Beli : ");
                                        double banyak = Double.parseDouble(a.readLine());
                                        
                                        double jumlah = 600000 * banyak ;
                                        
                                        System.out.println("Total Bayar : Rp." +jumlah);
                                    }
                                    else
                                    {
                                        System.err.println("Maaf. Ukuran Tidak Tersedia !!!");
                                    }
                                    
                                 
                                }
                                else if(pil6.equals("Lengan Pendek") || pil6.equals("lengan pendek ") )
                                {
                                    System.out.println("Tipe Lengan Pendek");
                                    System.out.print("Ukuran 1. S\n2. M\n: ");
                                    String pil8 = a.readLine();
                                    
                                    if (pil8.equals("S") ||pil8.equals("s"))
                                    {
                                        System.out.println("Baju Nike Tipe Krah Ukuran S Lengan Pendek Seharga = 57K");
                                        System.out.print("Banyak Beli : ");
                                        double banyak = Double.parseDouble(a.readLine());
                                        
                                        double jumlah = 57000 * banyak;
                                        
                                        System.out.println("Total Bayar : Rp." +jumlah);
                                    }
                                    else if (pil8.equals("L") )
                                    {
                                        System.out.println("Baju NIke Tipe Krah Ukuran L Lengan Pendek Seharga = 60K");
                                        System.out.print("Banyak Beli : ");
                                        double banyak = Double.parseDouble(a.readLine());
                                        
                                        double jumlah = 600000 * banyak;
                                        
                                        System.out.println("Total Bayar : Rp." +jumlah);
                                    }
                                    else 
                                    {
                                        System.err.println("Maaf. Ukuran tidak ada !!!!");
                                    }
                                       
                                }
                                else 
                                {
                                    System.err.println("belum Tersedia !");
                                }
                                
                            }
                                
                        }break;
                        
                        default : 
                        {
                            System.out.println("belum tersedia !!!");
                        }
                        
                        
                        

                    }
                }break;
                
                case 2: 
                {
                    System.out.println("Menu Celana");
                    System.out.println("1. Jeans \n 2. Katun ");
                    System.out.print("Pilih : ");
                    int pil14 = Integer.parseInt(a.readLine());
                    
                    switch (pil14)
                    {
                        case 1 : 
                        {
                            System.out.println("JEANS  ");
                            System.out.print(" Ukuran 1. S\n2. M\n3. L\n : ");
                            String pil11 = a.readLine();
                            
                            if(pil11.equals("S") || pil11.equals("s"))
                            {
                                System.out.println("Celana Jeans Ukuran S Seharga = 50K");
                                System.out.print("Banyak Beli : ");
                                double banyak = Double.parseDouble(a.readLine());
                                
                                double jumlah = 50000 * banyak ;
                                
                                System.out.println("Total Bayar : Rp." +jumlah);
                            }
                           else if(pil11.equals("L") )
                            {
                                System.out.println("Celana Jeans Ukuran L Seharga = 60 K");
                                System.out.print("Banyak Beli : ");
                                double banyak = Double.parseDouble(a.readLine());
                                
                                double jumlah = 60000 * banyak ;
                                
                                System.out.println("Total Bayar : Rp." +jumlah);
                            }
                           else 
                           {
                               System.out.println("Belum Tersedia !!! ");
                           }
                        }break;
                        
                        case 2 :
                        {
                            System.out.println(" KATUN ");
                            System.out.println("Tipe Celana \n 1. Kantor \n 2. Harian ");
                            System.out.print("Pilih : ");
                            String pil9 = a.readLine();
                            
                            if (pil9.equals("KANTOR") || pil9.equals("Kantor") || pil9.equals("kantor") || pil9.equals("1"))
                            {
                                System.out.println("Celana Katun untuk Kantor");
                                System.out.print("Ukuran 1. S\n2. M\n   : ");
                                String pil10 = a.readLine();
                                
                                if(pil10.equals("S") || pil10.equals("s"))
                                {
                                    System.out.println("Celana Katun untuk Kantor Ukuran S Seharga = 100K");
                                    System.out.print("Banyak Beli : ");
                                    double banyak = Double.parseDouble(a.readLine());
                                    
                                    double jumlah = 1000000 * banyak;
                                    
                                    System.out.println("Total Bayar : Rp." +jumlah);
                                    
                                }
                                
                                else if(pil10.equals("M") || pil10.equals("m"))
                                {
                                    System.out.println("Celana Katun untuk Kantor Ukuran M Seharga = 120K");
                                    System.out.print("Banyak Beli : ");
                                    double banyak = Double.parseDouble(a.readLine());
                                    
                                    double jumlah = 120000 * banyak;
                                    
                                    System.out.println("Total Bayar : Rp." +jumlah);
                                    
                                    
                                }
                                else
                                {
                                    System.err.println("Maaf. Ukuran Tidak Tersedia !!!");
                                }
                                
                                
                            }
                            
                            else if (pil9.equals("HARIAN") || pil9.equals("Harian") || pil9.equals("harian") || pil9.equals("2"))
                            {
                                System.out.println("Celana untuk Harian");
                                System.out.print("Ukuran L : ");
                                String pil10 = a.readLine();
                                
                                if(pil10.equals("L") || pil10.equals("l"))
                                {
                                    System.out.println("Celana Katun Untuk Harian Ukuran L Seharga 150K");
                                    System.out.print("Banyak Beli : ");
                                    double banyak = Double.parseDouble(a.readLine());
                                    
                                    double jumlah = 150000 * banyak;
                                    
                                    System.out.println("Total Bayar : Rp." +jumlah);
                                    
                                }
                                else
                                {
                                    System.err.println("Maaf. Ukuran Tidak Tersedia !!!");
                                }
                            
                            }
                                
                                
                        }break;
                        
                        default :
                        {
                            System.err.println("Maaf. Celana yang Anda Cari Belum Tersedia !!!");
                        }
                    }
                }break;
                
                case 3 :
                {
                    System.out.println("Thank You ");
                }
                default :
                {
                    System.err.println("\n Menu Yang Anda Cari Belum Tersedia !!!!");
                }
            }
            
            System.out.println("\n Apakah Anda Ingin Membeli Lagi ...? ");
            System.out.print("Pilih (Y/T) : ");
            
            ulang = a.readLine();
            
            
            }while (ulang.equals("Y") || ulang.equals("y")  );
            
            
            
        }
        catch ( IOException e)
        {
            System.err.println("Error !!!!");
        }
    }
}
