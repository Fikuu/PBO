
package pbo_1801081021;


public class BukuAlamat {
    public String Nama;
    private String Alamat;
    private String Telepon;
    private String Email;
    public static int bukualamatcount;
    
    
    public BukuAlamat(){
        Nama="";
        Alamat="";
        Telepon="";
        Email="";
        
        
    }
    
    public String getNama(){
        return Nama;
    }
    public void setNama(String Nama){
        this.Nama=Nama;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    public void setAlamat(String Alamat){
        this.Alamat=Alamat;
    }
    
    public String getTelepon(){
        return Telepon;
    }
    public void setTelepon(String Telepon){
        this.Telepon=Telepon;
    }
    
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }
    
    public static int getbukualamatcount(){
        
        return bukualamatcount;
        
    }
}
    
    
