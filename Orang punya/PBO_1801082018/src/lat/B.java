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
public class B extends orangTua{
    protected String hobby;
    
    public B(){
        this.hobby="";
    }

    public B(String hobby, String sifat, String bentuk_wajah) {
        super(sifat, bentuk_wajah);
        this.hobby = hobby;
    }

    
    void tampil (){
        System.out.println("Ciri - ciri dari B");
        System.out.println("Sifat         :"+getSifat());
        System.out.println("Bnetuk Wajah  :"+getBentuk_wajah());
        System.out.println("Hobby         :"+getHobby());
    }
    
      public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    
}
