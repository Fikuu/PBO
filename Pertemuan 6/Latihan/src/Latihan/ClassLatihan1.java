/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Fikri
 */
public class ClassLatihan1 
{

 private String [] Nama = new String[100];
 private String [] Alamat = new String[100];
 private String [] Phone = new String[100];
 private String [] Email = new String[100];
 
 private static int count;
 private static int index;
   
    

 
 public ClassLatihan1()
 {
     count=0;
 }
 public String getNama(int index)
 {
     return Nama [index];
 }
 public String getAlamat(int index)
 {
     return Alamat [index];
 }
 public String getPhone(int index)
 {
     return Phone [index];
 }
 public String getEmail(int index)
 {
     return Email [index];
 }
 public void setAlamat(String Nama, String Alamat, String Phone, String Email,  int index)
 {
     this.Nama[index]=Nama;
     this.Alamat[index]=Alamat;
     this.Phone[index]=Phone;
     this.Email[index]=Email;
     count++;
 }
 public static int getCount()
 {
     return count;
 }

    String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setAlamat(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getAlamat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getPhone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
 

}
