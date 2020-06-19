/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.io.*;
/**
 *
 * @author Fikri
 */
public class Latihan1 
{
    public static void main(String[] args)
    {
        ClassLatihan1 BukuAlamat= new ClassLatihan1();
        BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
        
        String [] Nama = new String[100];
        String [] Alamat = new String[100];
        String [] Phone = new String[100];
        String [] Email = new String[100];
        
        
        int i,pil,pil1=0,pil2;
        

            try 
            {
                System.out.println("Menu");
                System.out.println("1. Memasukkan Data");
                System.out.println("2. Menghapus Data");
                System.out.println("3. Menampilkan Data");
                System.out.println("4. Mengubah Data");
                System.out.println("5. Keluar");
                System.out.println("Pilihan =>");
                pil=Integer.parseInt(a.readLine());
                
                switch(pil)
                {
                    case 1 : 
                    {
                        System.out.println("Inputkan Data");
                        System.out.println("Masukkan Banyak Data yang Diinputkan =>");
                        pil1=Integer.parseInt(a.readLine());
                        
                        for(i=0;i<pil1;i++)
                        {
                            System.out.println("Data Ke :"+(i+1));
                            System.out.println("Input Nama   =");
                            Nama[i]=a.readLine();
                            
                            System.out.println("Input Alamat =");
                            Alamat[i]=a.readLine();
                            
                            System.out.println("Input Phone  =");
                            Phone[i]=a.readLine();
                            
                            System.out.println("Input Email  =");
                            Email[i]=a.readLine();
            
                        }
                        for(i=0;i<pil;i++)
                        {
                            BukuAlamat.setAlamat(Nama[i],Alamat[i],Phone[i],Email[i]);
                            System.out.println("Nama              = "+BukuAlamat.getNama(i));
                            System.out.println("Alamat            = "+BukuAlamat.getAlamat(i));
                            System.out.println("Phone             = "+BukuAlamat.getPhone(i));
                            System.out.println("Email             = "+BukuAlamat.getEmail(i));
                        }
                        System.out.println("Data Disimpan");
                    }break;
                    
                    case 2 :
                    {
                         System.out.println("Data yang akan dihapus");
                         int hapus;
                         hapus=-1;
                         
                         System.out.println("Data yang ada");
                         BukuAlamat.setAlamat(Nama[hapus], Alamat[hapus], Phone[hapus], Email[hapus]);
                         System.out.println("Nama              = "+BukuAlamat.getNama(hapus));
                         System.out.println("Alamat            = "+BukuAlamat.getAlamat(hapus));
                         System.out.println("Phone             = "+BukuAlamat.getPhone(hapus));
                         System.out.println("Email             = "+BukuAlamat.getEmail(hapus));
                         System.out.println("Hapus data Y/T");
                         pil2=Integer.parseInt(a.readLine());
                        
                    }
                }
                
                    
            } catch (Exception e) {
            }
            
       
       
        
    }
}
