/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;
import javax.swing.JOptionPane;
/**
 *
 * @author Fikri
 */
public class NomorTerbesarJOption {
    public static void main(String[] args) {
        int i,banyak=10;
        int[] a=new int[100];
        
        
        for(i=0;i<banyak;i++)
        {
            a[i]=Integer.parseInt(JOptionPane.showInputDialog("Angka "+(i+1)));
                
        }
       int max=0;
       for(i=0;i<banyak;i++)
       {
           max=(max>a[i])? max:a[i];
       }
       JOptionPane.showMessageDialog(null, "angka terbesar"+max);
    
        
    }
}
