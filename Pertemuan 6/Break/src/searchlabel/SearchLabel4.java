/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchlabel;
import java.util.*;
import javafx.beans.property.LongProperty;
/**
 *
 * @author Fikri
 */
public class SearchLabel4 
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner (System.in);
        
         String [][] mtr = {
                        {"Supra","Honda","15000000"},
                        {"Vario","Yamaha","18000000"},
                        {"Shogun","Suzuki","14000000"}
                    };
        
        int pil,pil2;
        long banyak,discont,pajak,total,hrg,bayar;
        System.out.println("===menu===\n1. Motor\n2. Mobil");
        pil=Integer.parseInt(a.next());
        
       switch(pil)
       {
           case 1 : 
                 int i,j;
                        String motor;

                        System.out.println("Masukkan Motor : ");
                        motor = a.next();
                        
                        String merek=" ",harga=" ";
                        boolean foundNum = false;

                        searchLabel:
                        for( i=0; i<mtr.length; i++)
                        {
                            for( j=0;j<mtr[i].length;j++)
                            {
                                if(motor.equals(mtr[i][j]))
                                {
                                    foundNum = true;
                                    merek=mtr[i][1];
                                    harga=mtr[i][2];
                                    break searchLabel;
                                }
                            }
                        }

                        if (foundNum) {
                            System.out.println("Masukkan Banyak beli = ");
                            banyak=Long.parseLong(a.next());
                            if(motor.equals("Supra"))
                            {
                               
                                hrg=Long.parseLong(harga);
                                total=banyak*hrg;
                                discont=(long)(0.02*total);
                                pajak=(long)(total*0.1);
                                bayar=total+pajak-discont;
                                
                                System.out.println("Total beli : "+total);
                                System.out.println("Discont :"+discont);
                                System.out.println("Pajak :"+pajak);
                                System.out.println("Total bayar :"+bayar);
                 
                            }
                            if(motor.equals("Vario"))
                            {
                               
                                hrg=Long.parseLong(harga);
                                total=banyak*hrg;
                                discont=(long)(0.04*total);
                                pajak=(long)(total*0.1);
                                bayar=total+pajak-discont;
                                
                                System.out.println("Total beli : "+total);
                                System.out.println("Discont :"+discont);
                                System.out.println("Pajak :"+pajak);
                                System.out.println("Total bayar :"+bayar);
                 
                            }
                        }
                        
                break;
           
           case 2 : 
                break;
                    
            default:
                break;

        }

    }

}
