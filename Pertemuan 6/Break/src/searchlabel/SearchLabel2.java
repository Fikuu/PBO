/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchlabel;
/**
 *
 * @author LABP1KOMP
 */import java.util.*;

public class SearchLabel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner (System.in);
        String [][] mtr = {
            {"Supra","Honda","15.000.000"},
            {"Fino","Yamaha","18.000.000"},
            {"Shogun","Suzuki","14.000.000"}
        };
        int i,j;
        String motor;
        
        System.out.println("Masukkan Motor : ");
        motor = a.nextLine();
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
            System.out.println("Motor "+motor+"Merek "+merek+"Harga "+harga);
        }
    }
    
}
