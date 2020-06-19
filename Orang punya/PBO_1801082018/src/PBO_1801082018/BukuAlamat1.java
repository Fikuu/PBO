/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_1801082018;
import java.io.*;
/**
 *
 * @author Fikri
 */
public class BukuAlamat1 
{
    public static void main(String[] args) {
        BukuAlamat BukuAlamat [] = new BukuAlamat[100];
        BufferedReader x =new BufferedReader (new InputStreamReader(System.in));
        
        int pil;
        pil=0;
        while(pil!=5)
        {
        System.out.println("Menu");
        System.out.println("------------");
        System.out.println("1. Entri Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Tampil Data");
        System.out.println("4. Hapus Data");  
        
        try 
        {
        System.out.println("pilihan anda ?");
        pil=Integer.parseInt(x.readLine());
        
        switch(pil)
        {
            case 1 :
            {
                BukuAlamat a =new BukuAlamat();
                System.out.println("Entri Data");
                System.out.println("---------------");
                System.out.println("Entri Nama :");
                a.setNama(x.readLine());
                System.out.println("Entri Alamat :");
                a.setAlamat(x.readLine());
                System.out.println("Entri Nomor Telpon :");
                a.setNomor_Telepon(x.readLine());
                System.out.println("Entri ALamat Email :");
                a.setAlamat_Email(x.readLine());
                BukuAlamat[0]=a;
                
            }break;
            
            case 2 :
            {
                
            }break;
                    
            case 3 :
            {
                System.out.println("Tampil Data");
                System.out.println("---------------");
                for(BukuAlamat data : BukuAlamat)
                {
                    if(data.getName() !=null)
                    {
                        System.out.println("Nama   : "+data.getName());
                        System.out.println("Alamat : "+data.getAlamat());
                        System.out.println("Telpon : "+data.getNomor_Telepon());
                        System.out.println("Email  : "+data.getAlamat_Email());
                    }
                        
                }
                
            }break;
            
            case 4 :
            {
                
            }break;
        }
        
            
        } catch (Exception e) {
        }
        }
     
        
    }
}
