/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat;

/**
 *
 * @author Fikri
 */
public class Data {
    public static void main(String[] args) {
        ///-----------Definisikan dulu orang tua----------////
        String warna_kulit="putih";
        String sifat="ramaha";
        String bentuk_wajah="tirus";
        
        
        /// class A
        A a=new A("Game",warna_kulit);
        a.tampil();
        
        System.out.println("----------------------");
        
        // class B
        B b=new B("Programing",sifat,bentuk_wajah);
        b.tampil();
        
    }
    
}
