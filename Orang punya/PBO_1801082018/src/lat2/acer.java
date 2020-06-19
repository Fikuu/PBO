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
public class acer extends Monitor{
    protected String spesifikasi;
    
    public acer(){
        this.spesifikasi="";
    }

    public acer(String spesifikasi, String ukuran, String panjang) {
        super(ukuran, panjang);
        this.spesifikasi = spesifikasi;
    }
    
    void tampil(){
        System.out.println("ACER");
        System.out.println("Ukuran       :"+getUkuran());
        System.out.println("Panjang      :"+getPanjang());
        System.out.println("Spesifikasi  :"+getSpesifikasi());
    
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }
    
    
}
