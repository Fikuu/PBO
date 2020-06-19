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
public class ClassLooping {
    int i,a;
    
    void ulang (){
     for(i=1;i<=10;i++)
     {
         if(i % 2 ==0)
         {
            System.out.println("hasil"+i+" ="+i+"==> genap");
         }
         else
         {
             System.out.println("hasil"+i+" ="+i+"==> Ganjil");
         }
     }
   }
            
        
    
    
}
