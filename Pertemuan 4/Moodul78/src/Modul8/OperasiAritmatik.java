/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8;

/**
 *
 * @author Fikri
 */
public class OperasiAritmatik {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        
        int tambah=a+b;
        int kurang=a-b;
        double kali=a*b;
        double bagi=a/b;
        
        System.out.println("Hasil Tambah = "+tambah);
        System.out.println("Hasil Kurang = "+kurang);
        System.out.println("Hasil Kali = "+kali);
        System.out.println("Hasil Bagi = "+bagi);
    }
}
