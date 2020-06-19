/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnlabeledContinueStatement;

import java.util.Scanner;

/**
 *
 * @author Fikri
 */
public class Latihan2 
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        
        String motor [][]={{"invoice_01","Supra","10","10000"},
                           {"invoice_01","Oli","5","20000"},
                           {"invoice_01","Busi","6","10000"},
                           {"invoice_02","Ban","2","10000"},
                           {"invoice_02","Ban","3","30000"},
                           {"invoice_02","Benen","1","40000"}};
        int count=1;
        int total=0;
        String cari;
       
        System.out.println("Data  :");
        cari=a.nextLine();
        for(int i=0;i<motor.length;i++)
        {
            for(int j=0;j<motor[i].length;j++)
            {
                if(!motor[i][j].equals(cari))
                {
                    continue;
                }
                total +=(Integer.parseInt(motor[i][2]) * Integer.parseInt(motor[i][3]));
                System.out.println(count+".Merek |"+motor[i][1]+" | Jumlah |"+motor[i][2]+" | harga |"+motor[i][3]);
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Total Harga ==>"+total);
            
        }
    }
}
    

