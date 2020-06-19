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
public class ClassHuruf {
    int nilai;
    String huruf;
    
    void jika (){
       if (nilai >= 85 && nilai <=100)
        {
            huruf="A";
            System.out.println("nilai ="+huruf);
        }
       else
           if(nilai >= 80 && nilai <85)
           {
               huruf="-A";
               System.out.println("nilai ="+huruf);
           }
       else
           if(nilai >=75 && nilai <80)
           {
               huruf="B+";
               System.out.println("nilai ="+huruf);
           }
       else
           if(nilai >=70 && nilai <75)
           {
               huruf="B";
               System.out.println("nilai ="+huruf);
           }
       else
           if(nilai >= 65 && nilai <70)
           {
               huruf="B-";
               System.out.println("nilai ="+huruf);
           }
      else
           if(nilai >= 60 && nilai <65)
           {
               huruf="C+";
               System.out.println("nilai ="+huruf);
           }
       else
            if(nilai >=55 && nilai <60)
            {
                huruf="C";
                System.out.println("nilai ="+huruf);
            }
       else
            if(nilai >=50 && nilai <55)
            {
                huruf="C-";
                System.out.println("nilai ="+huruf);
            }
       else
            if(nilai >=40 && nilai <50)
            {
                huruf="D";
                System.out.println("nilai ="+huruf);
            }
       else
             if(nilai <40 && nilai <50)
             {
                 huruf="E";
                 System.out.println("nilai ="+huruf);
             }
    }
}
       
    
       
       
       
       
         
           
           
           
            
    
    

