/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat3;

/**
 *
 * @author Fikri
 */
public class Segitiga extends BangunDatar{
    protected int luas;
    
    public Segitiga(){
        this.luas=0;
    }

    public Segitiga(int a, int t) {
        super(a, t);
    }
    
    void tampil(){
        System.out.println("Segitiga");
        System.out.println("Luas      :"+getLuas());
    }

    public int getLuas() {
        return luas=(a*t)/2;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }
    
    
    
    
    
}
