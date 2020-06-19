
package Penjualan.model;

import java.util.*;

public class penjualanDao {
    private List<penjualan> data = new ArrayList<penjualan>();
    private List<penjualan> dataall = new ArrayList<penjualan>();
    
    public void insert(penjualan s){
        data.add(s);
    }   
    
    public void delete(int delete){
        data.remove(delete);
    }
    
    public void update(int index, penjualan s){
        data.set(index, s);
    }
    
    public void simpan(penjualan x, penjualan s){
        dataall.add(x);
        data.add(s);
    
    }
    
    public penjualan getPenjualan(int index){
        return data.get(index);
    }
    
    public penjualan getPenjualanAll(int index1){
        return dataall.get(index1);
    }
    
    public List<penjualan> getData(){
        return data;
    }
    
    public List<penjualan> getDataAll(){
       return dataall;
    }
}
