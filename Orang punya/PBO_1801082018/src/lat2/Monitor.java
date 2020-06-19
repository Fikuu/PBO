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
public class Monitor {
    protected String ukuran;
    protected String panjang;
    protected String lebar;
    protected String berat;
    
    
    public Monitor(){
        this.ukuran="";
        this.panjang="";
        this.lebar="";
        this.berat="";
    }

    public Monitor(String ukuran, String panjang, String lebar, String berat) {
        this.ukuran = ukuran;
        this.panjang = panjang;
        this.lebar = lebar;
        this.berat = berat;
    }

   /// construktor A

    public Monitor(String ukuran, String panjang) {
        this.ukuran = ukuran;
        this.panjang = panjang;
    }
   
    /// construktor B

    public Monitor(String panjang, String lebar, String berat) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.berat = berat;
    }

    
    
    
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getPanjang() {
        return panjang;
    }

    public void setPanjang(String panjang) {
        this.panjang = panjang;
    }

    public String getLebar() {
        return lebar;
    }

    public void setLebar(String lebar) {
        this.lebar = lebar;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }
    
    
    
    
}
