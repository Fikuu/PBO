/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Fikri
 */
public class PersegiPanjang implements relation{
    private int panjang;
    private int lebar;
    
    public PersegiPanjang(){
        panjang = 0;
        lebar = 0;
    }
    
    public PersegiPanjang(int panjang, int lebar){
        this.panjang= panjang;
        this.lebar = lebar;
    }
    
    public double getLuas(){
        return panjang*lebar;
    }
    
     public boolean isGreater( Object a, Object b){
        PersegiPanjang p1 = (PersegiPanjang)a;
        PersegiPanjang p2 = (PersegiPanjang)b;
        return p1.getLuas()>p2.getLuas();
    }
    
    public boolean isLess( Object a, Object b){
        PersegiPanjang p1 = (PersegiPanjang)a;
        PersegiPanjang p2 = (PersegiPanjang)b;
        return p1.getLuas()<p2.getLuas();
    }
    public boolean isEqual( Object a, Object b){
        PersegiPanjang p1 = (PersegiPanjang)a;
        PersegiPanjang p2 = (PersegiPanjang)b;
        return p1.getLuas()==p2.getLuas();
    }
    
    public static void main(String[] args) {
        relation p = new PersegiPanjang();
        boolean hasil = p.isGreater(new PersegiPanjang(10,5),new PersegiPanjang(2,12));
        System.out.println("hasil   :"+hasil);
    }
    
    
}
