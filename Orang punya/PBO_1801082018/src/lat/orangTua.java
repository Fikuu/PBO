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
public class orangTua {
    protected String warna_kulit;
    protected String sifat;
    protected String bentuk_wajah;
    
    public orangTua()
    {
        this.warna_kulit="";
        this.sifat="";
        this.bentuk_wajah="";
    }

    public orangTua(String warna_kulit, String sifat, String bentuk_wajah) {
        this.warna_kulit = warna_kulit;
        this.sifat = sifat;
        this.bentuk_wajah = bentuk_wajah;
    }
    
    /// construktor A
    public orangTua(String warna_kulit){
        this.warna_kulit="";
    }
    
    /// construktor B
    public orangTua(String sifat,String bentuk_wajah){
        this.sifat=sifat;
        this.bentuk_wajah=bentuk_wajah;
        
    }

    public String getWarna_kulit() {
        return warna_kulit;
    }

    public void setWarna_kulit(String warna_kulit) {
        this.warna_kulit = warna_kulit;
    }

    public String getSifat() {
        return sifat;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getBentuk_wajah() {
        return bentuk_wajah;
    }

    public void setBentuk_wajah(String bentuk_wajah) {
        this.bentuk_wajah = bentuk_wajah;
    }
    
    
    
        


}
