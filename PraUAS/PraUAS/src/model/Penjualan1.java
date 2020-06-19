/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fikri
 */
import java.util.*;
public class Penjualan1 {
    private List<Penjualan> data = new ArrayList<Penjualan>();
    
    public void insert(Penjualan s){
        data.add(s);
    }
    public void delete(int index){
        data.remove(index);
    }
    
    public Penjualan getPenjualan(int index){
        return data.get(index);
    }

    public List<Penjualan> getData() {
        return data;
    }
   
    
    

   
    
    
    
   
        
    
    
}
