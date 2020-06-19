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

public class Searchlabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner (System.in);
        String [][] mhs = {
            {"Eko","TK2A","Teknik Komputer"},
            {"Dani","TK2B","Teknik Komputer"},
            {"Ari","MI2B","Manajemen Informatika"}
        };
        int i,j;
        String nama;
        
        System.out.println("Masukkan Nama : ");
        nama = a.nextLine();
        String kelas=" ",prodi=" ";
        boolean foundNum = false;
        
        searchLabel:
        for( i=0; i<mhs.length; i++)
        {
            for( j=0;j<mhs[i].length;j++)
            {
                if(nama.equals(mhs[i][j]))
                {
                    foundNum = true;
                    kelas=mhs[i][1];
                    prodi=mhs[i][2];
                    break searchLabel;
                }
            }
        }
        
        if (foundNum) {
            System.out.println("Nama mahasiswa "+nama+"Kelas "+kelas+"Prodi "+prodi);
        }
    }
    
}
