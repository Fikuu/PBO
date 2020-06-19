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
public class JOptionPangkat
{
    public static void main (String[] args)
    {
        double hasil,nilai,pangkat=0; 
        nilai=Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai"));
        pangkat=Double.parseDouble(JOptionPane.showInputDialog("Masukkan Pangkat"));
        
        hasil=Math.pow(nilai,pangkat);
        
        String pesan ="Hasil Pankat\n"
                       +"Nilai :"+nilai+"\n"
                       +"Pangkat :"+pangkat+"\n"
                       +"Adalah :"+hasil;
        
        
         JOptionPane.showMessageDialog(null, pesan);
    }
    }

