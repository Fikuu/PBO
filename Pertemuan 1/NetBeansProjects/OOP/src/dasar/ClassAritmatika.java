/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author LABP1KOMP
 */
public class ClassAritmatika {
    float tambah,kurang,kali,a,b,bagi;
     
    void Penjumlah(){
        tambah=a+b;
        System.out.println("tambah : "+tambah);        
    }
    
    void Pengurangan(){
         if(a<b)
        {
            kurang=a-b;
            System.out.println("tidak bisa dikurang");
        }
         else
         {
              System.out.println("kurang : "+kurang);
         }
                  
    }
    
    void Perkalian(){
        kali=a*b;
        System.out.println("kali : "+kali);              
    }
    
    void Pembagian(){
        if(a<b)
        {
            bagi=a/b;
            System.out.println("Tidak bisadi dibagi");
        }
        else
        {
            System.out.println("bagi : "+bagi);
        }                            
    }
}
