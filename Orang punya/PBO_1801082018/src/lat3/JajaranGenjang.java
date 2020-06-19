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
public class JajaranGenjang extends BangunDatar{
    protected int luas;
    
    public JajaranGenjang(){
        this.luas=0;
    }

    public JajaranGenjang(int a, int t) {
        super(a, t);
    }
    
    void tampil(){
        System.out.println("Jajarn Genjang");
        System.out.println("Luas      :"+getLuas());
    }

    public int getLuas() {
        return luas=a*t;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }
    
    
}
