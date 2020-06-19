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
public class A extends orangTua{
    protected String hobby;
    
    protected A(){
        this.hobby="";
    }
    
    /// construktor orang tua terhadap A
    public A(String hobby, String warna_kulit) {
        super(warna_kulit);
        this.hobby = hobby;
    }
    
    void tampil(){
        System.out.println("Ciri - ciri dari A");
        System.out.println("Warna kulit :"+getWarna_kulit());
        System.out.println("Hobby       :"+getHobby());
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getWarna_kulit() {
        return warna_kulit;
    }

    public void setWarna_kulit(String warna_kulit) {
        this.warna_kulit = warna_kulit;
    }
    
    
    
    
    
    
}
