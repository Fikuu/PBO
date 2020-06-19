/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat2;

/**
 *
 * @author Fikri
 */
public class data {
    public static void main(String[] args) {
         ///-----------Definisikan dulu orang tua----------////
        String ukuran="12";
        String panjang="30";
        String lebar="15";
        String berat="10";
        
        
        /// class A
        acer a=new acer("acer",ukuran,panjang);
        a.tampil();
        
        System.out.println("----------------------");
        
        // class B
        samsung b=new samsung(" Dell X02", ukuran, panjang, lebar, berat);
        b.tampil();
    }
}
