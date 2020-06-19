/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperclassSubclass;
import java.io.*;
/**
 *
 * @author Fikri
 */
public class hasil {
    public static void main(String[] args) throws IOException {
    BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
       /// mengguanakan variabel///
    
     jenis jenis=new jenis();
     
     
    int pil=0;
    System.out.println("Masukkan Pilihan ");
    System.out.println("1. Masukkan Nama Jurusan dan Prodi");
    System.out.println("2. Exit");
    System.out.println("pilihan : ");
    pil=Integer.parseInt(a.readLine());
    while(pil!=2)
    {
        System.out.println("Masukkan Nama Mobil : ");
        jenis.setMobil(a.readLine());
        
        System.out.println("Masukkan Jenis Mobil :");
        jenis.setJenis(a.readLine());
        
        System.out.println("Nama Mobil  :"+jenis.getMobil());
        System.out.println("Jenis Mobil :"+jenis.getJenis());
        
    System.out.println("Masukkan Pilihan ");
    System.out.println("1. Masukkan Nama Jurusan dan Prodi");
    System.out.println("2. Exit");
    System.out.println("pilihan : ");
    pil=Integer.parseInt(a.readLine());
    
    }
    
      
        
}
}
