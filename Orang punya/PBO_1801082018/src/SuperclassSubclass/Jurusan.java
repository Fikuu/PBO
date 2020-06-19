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
public class Jurusan {
    protected String nama_jurusan;
    
    
    public  Jurusan(){              /// constuktor//
       nama_jurusan="";
    }
    
    public Jurusan(String nama_jurusan){
        this.nama_jurusan=nama_jurusan;
    }
    
    public String getNama_jurusan(){
        return nama_jurusan;
    }
    
    public void setNama_jurusan(String nama_jurusan){
        this.nama_jurusan=nama_jurusan;
        
    }
    
}
