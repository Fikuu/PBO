/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_1801082018;
import java.util.Scanner;
/**
 *
 * @author Fikri
 */
public class BukuAlamat 
{
       private String nama;
       private String alamat;
       private String nomor_telepon;
       private String alamat_email;
       
       public void setNama(String nama)
       {
           this.nama = nama;
       }
       public String getName()
       {
           return nama;
       }
       
       public void setAlamat(String alamat)
       {
           this.alamat = alamat;
       }
       public String getAlamat()
       {
           return alamat;
       }
       
       public void setNomor_Telepon(String nomor_telepon)
       {
           this.nomor_telepon=nomor_telepon;
       }
       public String getNomor_Telepon()
       {
           return nomor_telepon;
       }
       
       public void setAlamat_Email(String alamat_email)
       {
           this.alamat_email=alamat_email;
       }
       public String getAlamat_Email()
       {
           return alamat_email;
       }
    
    
}
