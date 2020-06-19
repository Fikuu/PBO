/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;
import java.util.Scanner;
/**
 *
 * @author LABP1KOMP
 */
public class InputOutputScanner {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String nama;
        
        System.out.println("Masukkan Nama :");
        nama=scan.nextLine();
        System.out.println("nama "+nama);
    }
    
}
