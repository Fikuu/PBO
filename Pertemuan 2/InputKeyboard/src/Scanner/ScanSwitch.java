
package Scanner;
import java.util.Scanner;

public class ScanSwitch {
     public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String nama,email,alamat;
        int pil;
        
         System.out.println("Menu");
         System.out.println("1. Masukkan Nama dan Email");
         System.out.println("2. Masukkan Alamat");
         System.out.println("Pilihan Anda");
         pil=scan.nextInt();
         
         switch(pil)
         {
             case 1: 
                 System.out.print("Masukkan Nama :");
                 nama=scan.next();
                 System.out.print("Masukkan Email :");
                 email=scan.next();
                 System.out.println("Nama "+nama);
                 System.out.println("Email "+email);
                 break;
             case 2:
                 System.out.print("Masukkan Alamat :");
                 alamat=scan.next();
                 System.out.println("Alamat : "+alamat);
                 break;
             default:
         }

     }
}
