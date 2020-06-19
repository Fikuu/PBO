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
public class Penjualan2 {
    private List<Penjualan> data = new ArrayList<Penjualan>();
    
    public void simpan(Penjualan s){
        data.add(s);
    }
    
    public void edit(int index, Penjualan s){
        data.set(index, s);
    }
    
    public void detele1(int index){
        data.remove(this);
    }
    
     public Penjualan getPenjualan(int index){
        return data.get(index);
    }

    public List<Penjualan> getData() {
        return data;
    }
}
