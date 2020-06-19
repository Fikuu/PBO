/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnlabeledContinueStatement;

/**
 *
 * @author Fikri
 */
public class Latihan1 
{
    public static void main(String[] args)
    {
        
        String tk2a[][]={{"Eko","PBO","80"},
                   {"Eko","Jarkom","90"},
                   {"Dani","PBO","70"},
                   {"Dani","Jarkom","80"},
                   {"Dani","Routing","70"}};
        
        int count=0;
        int totalNilai=0;
        int rata=0;
        String cari = "Eko";
        
        
        for(int i=0;i<tk2a.length;i++)
        {
            for(int j=0;j<tk2a[i].length;j++)
            {                
                if(!tk2a[i][j].equals(cari))
                {
                  continue;
                }
                 totalNilai += Integer.parseInt(tk2a[i][2]);
                count++;
                System.out.println(count+".Matakuliah |"+tk2a[i][1]+" | Nilai |"+tk2a[i][2]);
            }
        }
        
        if(count>0)
        {
            rata=totalNilai/count;
            System.out.println("============================");
            System.out.println("Total Nilai dari "+cari+" adalah "+totalNilai);
        }
        else
        {
            System.out.println(cari+"Tidak Ketemu");
        }
    }
}
        
    
