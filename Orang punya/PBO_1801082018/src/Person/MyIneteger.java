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
public class MyIneteger implements relation{
    public boolean isGreater( Object a, Object b){
        int n1 = (int)a;
        int n2 = (int)b;
        
        return n1>n2;
    }
    
    public boolean isLess( Object a, Object b){
        int n1 = (int)a;
        int n2 = (int)b;
        
        return n1<n2;
    }
    public boolean isEqual( Object a, Object b){
        int n1 = (int)a;
        int n2 = (int)b;
        
        return n1==n2;
    }
    
    public static void main(String[] args) {
        relation myInt = new MyIneteger();
        boolean hasil = myInt.isGreater(20, 30);
        System.out.println("hasil   :"+hasil);
    }
    
    
}
