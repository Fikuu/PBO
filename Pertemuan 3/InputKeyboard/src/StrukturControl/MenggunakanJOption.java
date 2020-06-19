/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturControl;
import javax.swing.JOptionPane;
/**
 *
 * @author LABP1KOMP
 */
public class MenggunakanJOption 
{
    
     public static void main (String[] args)
    {
        int bil; 
        bil=Integer.parseInt(JOptionPane.showInputDialog("Inputkan"));
        
        if(bil>60)
        {
            String pesan =" lulus:"+bil;       
            JOptionPane.showMessageDialog(null, pesan);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "noob");
        }
        
    }
  }

