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
public class mobil {
    protected String mobil;
    
    
    public  mobil(){              /// constuktor//
       mobil="";
    }
    
    public mobil(String mobil){
        this.mobil=mobil;
    }
    
    public String getMobil(){
        return mobil;
    }
    
    public void setMobil(String mobil){
        this.mobil=mobil;
        
    }
    
    
   
    
}
