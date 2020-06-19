/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import jdk.internal.util.xml.impl.Input;
/**
 *
 * @author Fikri
 */
public class arrayHondaMotor 
{
    public static void main(String[] args) 
    {
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
       int pil,i;
       String pil2="";
       String club[]={"Revo","Supra_X125","Supra_X150"};
       
       String matic[]={"Picx_h","Picx_150","Vario_150"};
       String yamaha_max[]={"Lexi_hbr","Lexi_150","Lexi"};
       String yamaha_sport[]={"Yzr_R155","Yzr_R130"};
       String daihatsu[]={"Xenia","Terios","Ayla"};
       String toyota[]={"Fortuner","Avanza","Rush"};
       boolean foundName=false;
      
        try 
        {
            System.out.println("1. Motor\n2. Mobil");
            System.out.println("Pilihan ?");
            pil=Integer.parseInt(input.readLine());
            
            switch(pil)
            {
                case 1 :
                {
                    System.out.println("1. Honda\n2. Yamaha");
                    System.out.println("Pilihan ?");
                    pil2=input.readLine();   
                        
                    if(pil2.equals("Honda"))
                    {
                        System.out.println("Jenis Motor\n"+"1. Club\n2. Matic");
                        System.out.println("Pilihan ?");
                        pil2=input.readLine();
                        
                        if(pil2.equals("Club"))
                        {
                            System.out.println("Silahkan cari :");
                            pil2=(input.readLine());
                            
                            for(i=0;i<club.length;i++)
                            {
                                if(club[i].equals(pil2))
                                {
                                    foundName=true;
                                    
                                }
                            }
                            if(foundName)
                            {
                                System.out.println (pil2+" Ketemu!");
                                if(club[i].equals("Revo"))
                                {
                                    System.out.println("asdasd");
                                }
                                    
                            }
                            else 
                            {
                                System.out.println(pil2 +"Tidak ketemu!");
                            }
                         }
                        if(pil2.equals("Matic"))
                        {
                            System.out.println("Silahkan cari :");
                            pil2=(input.readLine());
                            
                            for(i=0;i<matic.length;i++)
                            {
                                if(club[i].equals(pil2))
                                {
                                    foundName=true;
                                    
                                }
                            }
                            if(foundName)
                            {
                                System.out.println (pil2+" Ketemu!");
                            }
                            else 
                            {
                                System.out.println(pil2 +"Tidak ketemu!");
                            }
                         }
                        
                    }
                      if(pil2.equals("Yamaha"))
                    {
                        System.out.println("Jenis Motor\n"+"1. Max_X\n2. Sport");
                        System.out.println("Pilihan ?");
                        pil2=input.readLine();
                        
                        if(pil2.equals("Max_X"))
                        {
                            System.out.println("Silahkan cari :");
                            pil2=(input.readLine());
                            
                            for(i=0;i<yamaha_max.length;i++)
                            {
                                if(yamaha_max[i].equals(pil2))
                                {
                                    foundName=true;
                                    
                                }
                            }
                            if(foundName)
                            {
                                System.out.println (pil2+" Ketemu!");
                            }
                            else 
                            {
                                System.out.println(pil2 +"Tidak ketemu!");
                            }
                         }
                        if(pil2.equals("Sport"))
                        {
                            System.out.println("Silahkan cari :");
                            pil2=(input.readLine());
                            
                            for(i=0;i<yamaha_sport.length;i++)
                            {
                                if(yamaha_sport[i].equals(pil2))
                                {
                                    foundName=true;
                                    
                                }
                            }
                            if(foundName)
                            {
                                System.out.println (pil2+" Ketemu!");
                            }
                            else 
                            {
                                System.out.println(pil2 +"Tidak ketemu!");
                            }
                         }
                        
                    }

               }break;
                
           }

        } catch (Exception e) {
        }
       
       
    }
    
}
