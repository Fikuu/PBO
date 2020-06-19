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
public class samsung extends Monitor{
     protected String spesifikasi;
    
    public samsung(){
        this.spesifikasi="";
    }

    public samsung(String spesifikasi, String ukuran, String panjang, String lebar, String berat) {
        super(ukuran, panjang, lebar, berat);
        this.spesifikasi = spesifikasi;
    }

   void tampil(){
        System.out.println("Samsung");
        System.out.println("Panjang       :"+getPanjang());
        System.out.println("Lebar         :"+getLebar());
        System.out.println("Berat         :"+getBerat());
        System.out.println("Spesifikasi   :"+getSpesifikasi());
   }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }
   
   
    
}
