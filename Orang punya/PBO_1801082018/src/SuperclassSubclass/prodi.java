/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperclassSubclass;

/**
 *
 * @author Fikri
 */
public class prodi extends Jurusan{
    protected String nama_prodi;
    
    
    public prodi(){
       /// System.out.println("Ini adalah prodi teknik komputer");///
       this.nama_prodi="";
    }

    public prodi(String nama_prodi, String nama_jurusan) {
        super(nama_jurusan);
        this.nama_prodi = nama_prodi;
    }

    public String getNama_prodi() {
        return nama_prodi;
    }

    public void setNama_prodi(String nama_prodi) {
        this.nama_prodi = nama_prodi;
    }
    
    
}
