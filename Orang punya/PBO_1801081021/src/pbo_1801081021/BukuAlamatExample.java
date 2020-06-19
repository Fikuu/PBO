
package pbo_1801081021;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BukuAlamatExample extends BukuAlamat{
    public static void main(String[] args) {
        BukuAlamat bukuAlamat[] = new BukuAlamat[100];
        BukuAlamat b = new BukuAlamat();
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        
        int pilihan = 0,i;
        
        while(pilihan!=5){
        try{
            System.out.println("1. Memasukkan Data\n"+"2. Menghapus Data\n"+"3. Menampilkan Data\n"+"4. Update Data\n"+"5. Exit");
            System.out.print("Masukkan Pilihan : ");
            pilihan=Integer.parseInt(input.readLine());
            
            switch(pilihan){
                case 1 : {
                    
                    if(bukualamatcount>100){
                        System.out.println("Data yang diinputkan sudah melewati batas");
                        System.exit(0);
                        
                    }else{
                        
                        
                        System.out.print("Masukkan Nama : ");
                        b.setNama(input.readLine());

                        System.out.print("Masukkan Alamat : ");
                        b.setAlamat(input.readLine());

                        System.out.print("Masukkan No Telepon : ");
                        b.setTelepon(input.readLine());

                        System.out.print("Masukkan Email : ");
                        b.setEmail(input.readLine());
                        
                    
                        bukuAlamat[bukualamatcount]=b;
                        
                        
                        
                        
                        bukualamatcount++;


                        
                    }
            
                }break;
                case 2 :{
                    System.out.println("Menghapus Data");
                    int delete;
                }break;
                
                case 3 :{
                    
                   
                   
                    for(BukuAlamat ba:bukuAlamat){
                        if(ba.getNama()!=null){
                            System.out.println("Nama : "+ba.getNama());
                            System.out.println("Alamat : "+ba.getAlamat());
                            System.out.println("No Telepon : "+ba.getTelepon());
                            System.out.println("Email : "+ba.getEmail());
                            
                            System.out.println("Jumlah Data : "+BukuAlamat.getbukualamatcount());
                        }
                    }
                      
                }break;
                
                case 4 :{
                    
                }break;
                
                case 5 :{
                    System.exit(0);
                }break;
                        
            }
            
            
        }catch(Exception ex){
            
        }
        }
        
       
        
    }
}
