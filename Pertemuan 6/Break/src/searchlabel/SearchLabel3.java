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

public class SearchLabel3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner (System.in);
        String [][] mbl = {
            {"Avanza","Toyota","150000000"},
            {"Brio","onda","130000000"},
            {"Nissan","Daitsu","200000000"}
        };
        int i,j;
        String mobil;
        
        System.out.println("Masukkan Mobil : ");
        mobil = a.nextLine();
        String merek=" ",harga=" ";
        boolean foundNum = false;
        
        searchLabel:
        for( i=0; i<mbl.length; i++)
        {
            for( j=0;j<mbl[i].length;j++)
            {
                if(mobil.equals(mbl[i][j]))
                {
                    foundNum = true;
                    merek=mbl[i][1];
                    harga=mbl[i][2];
                    break searchLabel;
                }
            }
        }
        
        if (foundNum) {
            System.out.println("Mobil "+mobil+"Merek "+merek+"Harga "+harga);
        }
    }
    
}
