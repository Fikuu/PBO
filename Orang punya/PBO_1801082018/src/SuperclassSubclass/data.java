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
public class data {
    public static void main(String[] args) {
        /// dengan cara konstrutor tanpa variable///
      prodi prodi=new prodi();
      prodi.setNama_jurusan("Teknologi Informasi");
      prodi.setNama_prodi("Teknik Komputer");
        System.out.println("Nama Jurusan :"+prodi.getNama_jurusan());
        System.out.println("Nama Prodi   :"+prodi.getNama_prodi());
        
        
       /// mengguanakan variabel///
    
     prodi prodi2=new prodi("Teknik Komputer","Teknologi Informasi");
     System.out.println("Nama Jurusan :"+prodi2.getNama_jurusan());
     System.out.println("Nama Prodi   :"+prodi2.getNama_prodi());
    }
    
   
    
}
