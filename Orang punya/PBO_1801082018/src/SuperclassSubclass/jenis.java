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
public class jenis extends mobil{
    protected String jenis;
    
    
    public jenis(){
       /// System.out.println("Ini adalah prodi teknik komputer");///
       this.jenis="";
    }

    public jenis(String jenis, String mobil) {
        super(mobil);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
   

   
    
    
}
