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
public class LuasSegitigaJOption
{
    public static void main (String[] args)
    {
        double luas,alas,tinggi=0;
        alas=Double.parseDouble(JOptionPane.showInputDialog("Masukkan Alas"));
        tinggi=Double.parseDouble(JOptionPane.showInputDialog("Masukkan Tinggi"));
        
        luas=(alas*tinggi)/2;
        
        String pesan ="Hasil Luas Segitiga\n"
                       +"Alas :"+alas+"\n"
                       +"Tinggi :"+tinggi+"\n"
                       +"Adalah :"+luas;
        
         JOptionPane.showMessageDialog(null, pesan);
    }
    }

