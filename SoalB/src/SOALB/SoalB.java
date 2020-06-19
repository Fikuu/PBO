/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOALB;
import java.io.*;
/**
 *
 * @author maitsanabila
 */
public class SoalB {
    public static void main(String[] args) {
         BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
         int pilih=0;
         String ulang="";
         try{
             do{
             System.out.println("Menu Pilihan");
             System.out.println("1. Aritmayika");
             System.out.println("2. Penjualan");
             System.out.println("3. Kasus Beli");
             System.out.println("4. Array");
             System.out.println("5. Exit");
              System.out.print("Pilihan=");
              pilih=Integer.parseInt(input.readLine());
              
              switch(pilih)
              {
                  case 1 : {
                                System.out.println("Anda Memilih Aritmatika");
                                System.out.println("1. Volume Tabung");
                                System.out.println("2. Luas Permukaan Tabung");
                                System.out.print("Pilihan=");
                                int pilih2=Integer.parseInt(input.readLine());
                                
                                if(pilih2==1){
                                    System.out.println("\n Volume Tabung");
                                    System.out.print("Jari-jari Tabung=");
                                    int r=Integer.parseInt(input.readLine());
                                    System.out.print("Tinggi Tabung=");
                                    int t=Integer.parseInt(input.readLine());
                                    
                                    double jari=Math.pow(r, 2);
                                    double v=3.14*jari*t;
                                    System.out.println("Volume Tabung = "+v);
                                    
                                }else
                                {
                                     System.out.println("\n Luas Permukaan Tabung");
                                    System.out.print("Jari-jari Tabung=");
                                    int r=Integer.parseInt(input.readLine());
                                    System.out.print("Tinggi Tabung=");
                                    int t=Integer.parseInt(input.readLine());
                                    
                                    double lpt=2*3.14*r*( t + r );
                                    System.out.println("Volume Tabung = "+lpt);

                                }
                                        
                           }break;
                  case 2 : {
                                System.out.println("Anda Memilih Penjualan");
                                System.out.println("1. OPPO V11");
                                System.out.println("2. SAMSUNG");
                                System.out.println("3. IPHONE 7");
                                System.out.println("4. XIOMI");
                                System.out.print("Pilihan=");
                                int pilih3=Integer.parseInt(input.readLine());
                                
                                if(pilih3==1){
                                    System.out.println("Anda Membeli OPPO V11");
                                    System.out.print("Banyak Yang Dibeli = ");
                                    int banyak=Integer.parseInt(input.readLine());
                                    if (banyak>1){
                                        double harga=2000000;
                                        double biaya=banyak*harga;
                                        double diskon=0.01*biaya;
                                        double pajak=0.01*biaya;
                                        double total=biaya+pajak-diskon;
                                        
                                        System.out.println("No Invoice : xxxx");
                                        System.out.println("|No | Nama  | Banyak Barang | Harga | Bayar | Disc | Pajak |");
                                        System.out.println("|1|"+"OPPO V11|"+""+banyak+"|"+harga+"|"+total+"|"+diskon+"|"+pajak+"|");
                                    }
                                    else
                                    {
                                        double harga=2000000;
                                        double biaya=banyak*harga;
                                        double diskon=0;
                                        double pajak=0;
                                        double total=biaya+pajak-diskon;
                                        
                                        System.out.println("No Invoice : xxxx");
                                        System.out.println("|No | Nama  | Banyak Barang | Harga | Bayar | Disc | Pajak |");
                                        System.out.println("|1|"+"OPPO V11|"+" "+banyak+"|"+harga+"|"+total+"|"+diskon+"|"+pajak+"|");
                                    }
                                    
                                }
                                else if (pilih3==2){
                                    
                                    System.out.println("Anda Membeli SAMSUNG");
                                    System.out.print("Banyak Yang Dibeli = ");
                                    int banyak=Integer.parseInt(input.readLine());
                                    if (banyak>=2){
                                        double harga=3000000;
                                        double biaya=banyak*harga;
                                        double diskon=0.03*biaya;
                                        double pajak=0.02*biaya;
                                        double total=biaya+pajak-diskon;
                                        
                                        System.out.println("No Invoice : xxxx");
                                        System.out.println("|No | Nama  | Banyak Barang | Harga | Bayar | Disc | Pajak |");
                                        System.out.println("|1|"+"SAMSUNG|"+""+banyak+"|"+harga+"|"+total+"|"+diskon+"|"+pajak+"|");
                                    }
                                    else
                                    {
                                        double harga=3000000;
                                        double biaya=banyak*harga;
                                        double diskon=0;
                                        double pajak=0;
                                        double total=biaya+pajak-diskon;
                                        
                                        System.out.println("No Invoice : xxxx");
                                        System.out.println("|No | Nama  | Banyak Barang | Harga | Bayar | Disc | Pajak |");
                                        System.out.println("|1|"+"SAMSUNG|"+" "+banyak+"|"+harga+"|"+total+"|"+diskon+"|"+pajak+"|");
                                    }
                                }
                                else if(pilih3==3){
                                    System.out.println("Anda Membeli IPHONE 7");
                                    System.out.print("Banyak Yang Dibeli = ");
                                    int banyak=Integer.parseInt(input.readLine());
                                    if (banyak>=3){
                                        double harga=5000000;
                                        double biaya=banyak*harga;
                                        double diskon=0.01*biaya;
                                        double pajak=0.01*biaya;
                                        double total=biaya+pajak-diskon;
                                        
                                        System.out.println("No Invoice : xxxx");
                                        System.out.println("|No | Nama  | Banyak Barang | Harga | Bayar | Disc | Pajak |");
                                        System.out.println("|1|"+"IPHONE 7|"+""+banyak+"|"+harga+"|"+total+"|"+diskon+"|"+pajak+"|");
                                    }
                                    else
                                    {
                                        double harga=5000000;
                                        double biaya=banyak*harga;
                                        double diskon=0;
                                        double pajak=0;
                                        double total=biaya+pajak-diskon;
                                        
                                        System.out.println("No Invoice : xxxx");
                                        System.out.println("|No | Nama  | Banyak Barang | Harga | Bayar | Disc | Pajak |");
                                        System.out.println("|1|"+"IPHONE 7|"+" "+banyak+"|"+harga+"|"+total+"|"+diskon+"|"+pajak+"|");
                                    }
                                }
                                else
                                {
                                    System.out.println("Anda Membeli XIOMI");
                                    System.out.print("Banyak Yang Dibeli = ");
                                    int banyak=Integer.parseInt(input.readLine());
                                    if (banyak>4){
                                        double harga=1000000;
                                        double biaya=banyak*harga;
                                        double diskon=0.02*biaya;
                                        double pajak=0.02*biaya;
                                        double total=biaya+pajak-diskon;
                                        
                                        System.out.println("No Invoice : xxxx");
                                        System.out.println("|No | Nama  | Banyak Barang | Harga | Bayar | Disc | Pajak |");
                                        System.out.println("|1|"+"XIOMI|"+""+banyak+"|"+harga+"|"+total+"|"+diskon+"|"+pajak+"|");
                                    }
                                    else
                                    {
                                        double harga=1000000;
                                        double biaya=banyak*harga;
                                        double diskon=0;
                                        double pajak=0;
                                        double total=biaya+pajak-diskon;
                                        
                                        System.out.println("No Invoice : xxxx");
                                        System.out.println("|No | Nama  | Banyak Barang | Harga | Bayar | Disc | Pajak |");
                                        System.out.println("|1|"+"XIOMI|"+" "+banyak+"|"+harga+"|"+total+"|"+diskon+"|"+pajak+"|");
                                    }
                                }
                           }break;
                      
                  case 3 : {
                            String [][] data={ { "Sepatu","10000","2","100"},   
                                               {"Sepatu","2000","1","0"},
                                               {"Baju","2600","3","200"},
                                                {"Baju","1400","3","250"}};
                           System.out.print("Anda Mencari Barang ?(Sepatu/Baju)");
                           String cari=input.readLine();
                        
                               String barang="";
                               double harga=0;
                               double banyak=0;
                               double disc=0;
                               double total=0;
                               double bayar = 0;
                                
                                 System.out.println(" No | Barang | Jumlah Beli | Total Beli | Disc");
                               for(int i=0;i<data.length;i++){
                                   for(int j=0;j<data.length;j++){
                                       if(!data[i][j].equals(cari)){
                                           continue;
                                       }
                                       barang=data[i][0];
                                       harga=Double.parseDouble(data[i][1]);
                                       banyak=Double.parseDouble(data[i][2]);
                                       disc=Double.parseDouble(data[i][3]);
                                       
                                       bayar=harga*banyak;
                                       total=total+bayar;
                                        
                                       System.out.println(" "+(i+1)+"|"+barang+"|"+banyak+"|"+harga+"|"+disc);
                                       
                                   }
                               }
                               double diskon=bayar*disc;
                               double totalbayar=total-diskon;
                                System.out.println("==================================================================");
                                System.out.println("Total Biaya Kesulurahan= "+totalbayar);
                               
                           
                                                             
                           }break;
                  
                  case 4 : {
                                System.out.println("Array");
                                System.out.println("1. Tampilkam Data Barang");
                                System.out.println("2. Array Dua Dimensi");
                                System.out.print("Pilihan=");
                                int pilih3=Integer.parseInt(input.readLine());
                                
                                if(pilih3==1){
                                    System.out.println("Menampilkan Data Barang");
                                    String [][] barang = {
                                            {"Semen Tiga Roda"," Rp. 2000/sak"},
                                            {"Semen Padang","Rp. 1500/sak"},
                                            {"Flash disk OTG 4G","45 Rb"}, 
                                            {"Headshet","25 Rb"}	
                                        };
                                        String nmbarang="";
                                        String hrg="";
                                 
                                 
                                    System.out.println("No | Barang | Harga");
                                    for(int i=0;i<barang.length;i++){
                                            nmbarang=barang[i][0];
                                            hrg=barang[i][1];
                                         System.out.println(""+(i+1)+"|"+nmbarang+"|"+hrg);
                                    }
                                }
                                else{
                                    System.out.println("Array 2 Dimensi");
                                   String[][] nama = new String[8][8];

                                    System.out.println("Ketikan 64 Nama Mahasiswa PNP yang Dikenali");
                                    for(int i=0;i<nama.length;i++)
                                    {
                                        for(int j=0;j<nama[i].length;j++)
                                        {
                                            System.out.print("Nama ["+(i+1)+"]"+"["+(j+1)+"]   : ");
                                            nama[i][j]=input.readLine();
                                        }
                                    }

                                    for(int i=0;i<nama.length;i++)
                                    {
                                        for(int j=0;j<nama[i].length;j++)
                                        {
                                            System.out.print("  "+nama[i][j]);
                                        }

                                        System.out.println("  ");
                                    }
                                }
                          }break;
                  
                  case 5 :{
                      System.exit(pilih);
                  }break;
              }
            System.out.println("Apakah Anda Ingin Membeli Lagi ...? ");
            System.out.print("Pilih (Y/T) : ");
            
            ulang = input.readLine();
            
            }while (ulang.equals("Y") || ulang.equals("y")  );
          }catch (IOException e){
            System.out.println("Error!!!"+e.getMessage());
          }
          
    }
}
