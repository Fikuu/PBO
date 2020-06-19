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
public class InputJOptionPane
{
    public static void main (String[] args)
    {
        String nama,alamat,nohp;
       
        nama=JOptionPane.showInputDialog("Nama :");
        alamat=JOptionPane.showInputDialog("Alamat :");
        nohp=JOptionPane.showInputDialog("Nomor HP :");
        
        String pesan ="Selamat Datang "+nama+"dengan alamat :"+alamat+"dengan no hp"+nohp;
        JOptionPane.showMessageDialog(null, pesan);
                
        
                
    }
}

