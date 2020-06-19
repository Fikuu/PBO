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
public class biodata1 {
    private List<biodata> data = new ArrayList<biodata>();
    
    public void insert(biodata s){
        data.add(s);
    }
    public void update(int index, biodata s){
        data.set(index, s);
    }
    public void delete(int index){
        data.remove(index);
    }
    
    public biodata getBiodata(int index){
        return data.get(index);
    }

    public List<biodata> getData() {
        return data;
    }
    
    
}
