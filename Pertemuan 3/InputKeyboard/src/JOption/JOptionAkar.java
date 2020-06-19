/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOption;
import javax.swing.JOptionPane;
/**
 *
 * @author LABP1KOMP
 */
public class JOptionAkar 
{
     public static void main (String[] args)
    {
        double hasil,a,b,c,a1,b1,c1,jumlah; 
        a=Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai"));
        c=Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai"));
        
        a1=Math.pow(a,2);
        b1=Math.pow(b,3);
        c1=Math.pow(c,2);
        jumlah=a1+b1+c1;
        hasil=Math.sqrt(jumlah);
        
        String pesan ="Hasil akar :"+hasil;       
        JOptionPane.showMessageDialog(null, pesan);
    }
  }

