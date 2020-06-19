/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid_a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author G531GD
 */
public class MID_A {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        BufferedReader a =  new BufferedReader(new InputStreamReader(System.in));
        
        
        try 
        
        {
            
            System.out.println(" MENU PEMOGRAMAN JAVA ");
            
            System.out.println("1. A R I T M A T I K A ");
            System.out.println("2. PENJUALAN MOTOR ( IF BERSARANG )");
            System.out.println("3. UNLABELED CONTINUE STATEMNET ( KASUS PENJUALAN )");
            System.out.println("4. A R R A Y");
            System.out.println("5. E X I T");
            
            System.out.print("Pilihan : ");

            int pilih = Integer.parseInt(a.readLine());
            
            switch(pilih)
            {
                case 1 :
                {
                    
                    System.out.println("\n\nA R I T M A T I K A ");
                    System.out.println("1. VOLUME LIMAS SEGITIGA");
                    System.out.println("2. VOLUME DAN LUAS BOLA");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.print("Pilihan : ");
                    
                    int pilih1 = Integer.parseInt(a.readLine());
                    
                    switch (pilih1)
                    {
                        case 1: 
                        {
                            System.out.println("\n\nVOLUME LIMAS SEGITIGA");
                            System.out.print(">> Panjang Limas      :  ");
                            double panjang = Double.parseDouble(a.readLine());
                            
                            System.out.print(">> Lebar Limas        :  ");
                            double lebar = Double.parseDouble(a.readLine());
                            
                            System.out.print(">> Tinggi Limas       :  ");
                            double tinggi = Double.parseDouble(a.readLine());
                            
                            //RUMUS VOLUME LIMAS
                            double vol = (0.33*(0.50*panjang*lebar)*tinggi);
                            
                            //Output
                            System.out.println("\n--------------------------------------------");
                            System.out.println("Volume Limas Segitiga :  " + vol );
                            System.out.println("--------------------------------------------");
                            
                        }break;
                        
                        case 2: 
                        {
                            System.out.println("\n\nVOLUME DAN LUAS BOLA ");
                            System.out.print(">> Jari - Jari Bola      :  ");
                            double jari = Double.parseDouble(a.readLine());
                            
                            //RUMUS VOLUME BOLA
                            double vol_bola = (1.33 * 3.14 * Math.pow(jari, 3));
                            
                            //RUMUS LUAS BOLA
                            double luas_bola = 4*3.14*Math.pow(jari, 2);
                            
                            //Output
                            System.out.println("\n-------------------------------------------");
                            System.out.println(">> VOLUME BOLA              : " + vol_bola );
                            System.out.println(">> LUAS BOOLA               : " + luas_bola );
                            System.out.println("-------------------------------------------");
                        }break;
                    }
                    
                    
                }break;
                
                case 2 :
                {
                    System.out.println("\n\nPENJUALAN MOTOR");
                    System.out.println("MENU MOTOR");
                    System.out.println("1. SUPRA ");
                    System.out.println("2. VARIO ");
                    System.out.println("3. SATRIA ");
                    System.out.println("4. SCOOPY ");
                    System.out.println("====================================");
                    System.out.print(">> PILIH  : ");
                    
                    String pilih2 = a.readLine();
                    
                        if (pilih2.equals("1") || pilih2.equalsIgnoreCase("supra"))
                        {
                            System.out.println("S U P R A ");
                            System.out.println("Harga           == 10 000 000 ");
                            System.out.println("Discount        == 3% jika beli > 2 ");
                            System.out.println("Pajak           == 10% ");
                            System.out.println("------------------------------------------------------");
                            System.out.print(">> Jumlah Beli  : ");
                            int banyak1 = Integer.parseInt(a.readLine());
                            
                            // RUMUS PEMBELIAN
                            
                            if(banyak1 > 2 )
                            {
                                int harga = banyak1*10000000;
                                int disc = (harga)* 3/100 ;
                                int pajak = (harga) * 10/100;
                                int total = (harga) + pajak - disc;
                                
                                //OUTPUT
                                System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println(" BANYAK BELI             :  " + banyak1);
                                System.out.println(" HARGA                   :  " + harga );
                                System.out.println(" DISCOUNT                :  " + disc );
                                System.out.println(" PAJAK                   :  " + pajak );
                                System.out.println(" TOTAL BAYAR             :  " + total );
                            }
                            else
                            {
                                int harga = banyak1*10000000;
                                int disc = 0 ;
                                int pajak = (harga) * 10/100;
                                int total = (harga) + pajak - disc;
                                
                                //OUTPUT
                                System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println(" BANYAK BELI             :  " + banyak1);
                                System.out.println(" HARGA                   :  " + harga );
                                System.out.println(" DISCOUNT                :  " + disc );
                                System.out.println(" PAJAK                   :  " + pajak );
                                System.out.println(" TOTAL BAYAR             :  " + total );
                            }
                        }
                        
                        else if (pilih2.equals("2") || pilih2.equalsIgnoreCase("vario"))
                        {
                            System.out.println(" V A R I O ");
                            System.out.println("Harga           == 15 000 000 ");
                            System.out.println("Discount        == 1% jika beli >= 2 ");
                            System.out.println("Pajak           == 5% ");
                            System.out.println("------------------------------------------------------");
                            System.out.print(">> Jumlah Beli  : ");
                            int banyak1 = Integer.parseInt(a.readLine());
                            
                            // RUMUS PEMBELIAN
                            
                            if(banyak1 >= 2 )
                            {
                                int harga = banyak1*15000000;
                                int disc = (harga)* 1/100 ;
                                int pajak = (harga) * 5/100;
                                int total = (harga) + pajak - disc;
                                
                                //OUTPUT
                                System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println(" BANYAK BELI             :  " + banyak1);
                                System.out.println(" HARGA                   :  " + harga );
                                System.out.println(" DISCOUNT                :  " + disc );
                                System.out.println(" PAJAK                   :  " + pajak );
                                System.out.println(" TOTAL BAYAR             :  " + total );
                            }
                            else
                            {
                                int harga = banyak1*15000000;
                                int disc = 0 ;
                                int pajak = (harga) * 5/100;
                                int total = (harga) + pajak - disc;
                                
                                //OUTPUT
                                System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println(" BANYAK BELI             :  " + banyak1);
                                System.out.println(" HARGA                   :  " + harga );
                                System.out.println(" DISCOUNT                :  " + disc );
                                System.out.println(" PAJAK                   :  " + pajak );
                                System.out.println(" TOTAL BAYAR             :  " + total );
                            }
                        }
                        
                        else if (pilih2.equals("3") || pilih2.equalsIgnoreCase("satria"))
                        {
                            System.out.println("--------------------- S A T R I A ----------------------");
                            System.out.println("Harga           == 18 000 000 ");
                            System.out.println("Discount        == 5% jika beli > 1 ");
                            System.out.println("Pajak           == 7% ");
                            System.out.println("------------------------------------------------------");
                            System.out.print(">> Jumlah Beli  : ");
                            int banyak1 = Integer.parseInt(a.readLine());
                            
                            // RUMUS PEMBELIAN
                            
                            if(banyak1 > 1 )
                            {
                                int harga = banyak1*18000000;
                                int disc = (harga)* 5/100 ;
                                int pajak = (harga) * 7/100;
                                int total = (harga) + pajak - disc;
                                
                                //OUTPUT
                                System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println(" BANYAK BELI             :  " + banyak1);
                                System.out.println(" HARGA                   :  " + harga );
                                System.out.println(" DISCOUNT                :  " + disc );
                                System.out.println(" PAJAK                   :  " + pajak );
                                System.out.println(" TOTAL BAYAR             :  " + total );
                            }
                            else
                            {
                                int harga = banyak1*18000000;
                                int disc = 0 ;
                                int pajak = (harga) * 7/100;
                                int total = (harga) + pajak - disc;
                                
                                //OUTPUT
                                System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println(" BANYAK BELI             :  " + banyak1);
                                System.out.println(" HARGA                   :  " + harga );
                                System.out.println(" DISCOUNT                :  " + disc );
                                System.out.println(" PAJAK                   :  " + pajak );
                                System.out.println(" TOTAL BAYAR             :  " + total );
                            }
                        }
                        
                        else if (pilih2.equals("4") || pilih2.equalsIgnoreCase("scoopy"))
                        {
                            System.out.println(" S C O O P Y ");
                            System.out.println("Harga           == 16 000 000 ");
                            System.out.println("Discount        == 2% jika beli >= 4 ");
                            System.out.println("Pajak           == 3% ");
                            System.out.println("------------------------------------------------------");
                            System.out.print(">> Jumlah Beli  : ");
                            int banyak1 = Integer.parseInt(a.readLine());
                            
                            // RUMUS PEMBELIAN
                            
                            if(banyak1 >= 4 )
                            {
                                int harga = banyak1*16000000;
                                int disc = (harga)* 2/100 ;
                                int pajak = (harga) * 3/100;
                                int total = (harga) + pajak - disc;
                                
                                //OUTPUT
                                System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println(" BANYAK BELI             :  " + banyak1);
                                System.out.println(" HARGA                   :  " + harga );
                                System.out.println(" DISCOUNT                :  " + disc );
                                System.out.println(" PAJAK                   :  " + pajak );
                                System.out.println(" TOTAL BAYAR             :  " + total );
                            }
                            else
                            {
                                int harga = banyak1*16000000;
                                int disc = 0 ;
                                int pajak = (harga) * 3/100;
                                int total = (harga) + pajak - disc;
                                
                                //OUTPUT
                                System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println(" BANYAK BELI             :  " + banyak1);
                                System.out.println(" HARGA                   :  " + harga );
                                System.out.println(" DISCOUNT                :  " + disc );
                                System.out.println(" PAJAK                   :  " + pajak );
                                System.out.println(" TOTAL BAYAR             :  " + total );
                            }
                        }
                }break;
                
                case 3:
                {
                    System.out.println("\n\n KASUS PENJUALAN ");
                    
                    
                    int total = 0;
                    int i,j;
                    String barang="";
                    String nama="";
                    int harga1=0;
                    int jumlah=0;
                    int bayar1=0;
                    
                    String data[][] = {
                        {"laptop","Dell i7","10000","2"},
                        {"laptop","Dell i5","20000","3"},
                        {"monitor","Samsung","1000","2"},
                        {"memori","Sandisk","9000","4"}
                    };
                    
                    System.out.print(">> CARI BARANG  [Laptop/Monitor/Memori]   :  ");
                    String cari = a.readLine();
                    
                    System.out.println("=======================================================================");
                    System.out.println("|   Barang  |   Nama Barang |   Harga   |   Jumlah Beli |   Total   | ");
                    System.out.println("-----------------------------------------------------------------------");
                    
                    for (i=0;i<data.length;i++)
                    {
                        for (j=0;j<data[i].length;j++)
                        {
                            if(!data[i][j].equalsIgnoreCase(cari)  )
                            {
                                continue;
                            }
                            barang = data[i][0];
                            nama  = data[i][1];
                            harga1 =Integer.parseInt(data[i][2]);
                            jumlah = Integer.parseInt(data[i][3]);
                            bayar1 = harga1 * jumlah ;
                            
                            total = total + bayar1;
                            System.out.println("|   "+barang+"  |   "+nama+"      |   "+harga1+"  |       "+jumlah+"        |   "+bayar1+"  |");
                        }
                    }
                    
                    System.out.println("==========================================================================");
                    System.out.println("--- TOTAL KESELURUHAN       :  " +total);
                    
                }break;
                
                case 4 :
                {
                    System.out.println("\n\n A R R A Y ");
                    System.out.println(" 1. Tampilkan Data Jurusan ");
                    System.out.println(" 2. Array 2D (10 x 10) ");
                    System.out.println("======================================================");
                    System.out.print(">> PILIH  : ");
                    
                    int pilih3 = Integer.parseInt(a.readLine());
                    
                    switch(pilih3)
                    {
                        case 1 : 
                        {
                            System.out.println(" TAMPILKAN DATA JURUSAN ");
                            
                            String jurusan[][] = {
                                {"Teknologi Informasi","Teknik Komputer","MI"},
                                {"Akuntansi","D3 AK","D4 AK"},
                                {"Sipil","D3 Sipil","D4 Rawa"},
                                {"AN","D3 AN","D3 UPW"}
                                
                            };
                            
                            System.out.println("=======================================================================");
                            System.out.println("|   Jurusan  |   Prodi 1 |   Prodi 2   |");
                            System.out.println("-----------------------------------------------------------------------");
                            
                            for (int i=0; i<jurusan.length;i++)
                            {
                            
                                    String nama_jurusan = jurusan[i][0];
                                    String prodi1 = jurusan[i][1];
                                    String prodi2 = jurusan[i][2];
                                
                                
                                System.out.println("|   "+nama_jurusan+"    |   "+prodi1+"    |   "+prodi2+"    |");
                            }
                        }break;
                        
                        case 2 :
                        {
                            System.out.println("  ARRAY 2D (10 x 10) ");
                            
                            int[][] array = new int[10][10];
                            
                            for(int i=0;i<array.length;i++)
                            {
                                for(int j=0;j<array[i].length;j++)
                                {
                                    System.out.print("["+i+"]"+"["+j+"]   : ");
                                    array[i][j]=Integer.parseInt(a.readLine());
                                }
                            }
                            
                            System.out.println("HASIL ARRAY 2D ");
                            
                            for(int i=0;i<array.length;i++)
                            {
                                for(int j=0;j<array[i].length;j++)
                                {
                                    System.out.print("  "+array[i][j]);
                                }
                                
                                System.out.println("  ");
                            }
                        }break;
                    }
                }break;
            }
        
        }
        
        catch (IOException e )
        {
            System.out.println(" Error  !!!  >>> " + e.getMessage());
        }
    }
    
}
