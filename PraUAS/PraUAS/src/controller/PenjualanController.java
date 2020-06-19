/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Fikri
 */
import model.Penjualan;
import model.Penjualan1;
import view.FormPenjualan;
import javax.swing.table.DefaultTableModel;
import model.Penjualan2;

public class PenjualanController {
    FormPenjualan view;
    Penjualan model;
    Penjualan1 dao;
    Penjualan2 dai;
    

    public PenjualanController(FormPenjualan view) {
        this.view = view;
        dao = new Penjualan1();
        this.view = view;
        dai = new Penjualan2();
    }
    
    public void bersihform(){
        view.getTxtkode_faktur().setText("");
        view.getTxttgl_faktur().setText("");
        view.getTxtpelanggan().setText("");
        view.getTxtnama_barang().setText("");
        view.getTxtharga().setText("");
        view.getTxtjumlah().setText("");
       
    }
    
    public void insert(){
        model= new Penjualan();
        model.setNama_barang(view.getTxtnama_barang().getText());
        model.setHarga(Double.parseDouble(view.getTxtharga().getText()));
        model.setJumlah(Double.parseDouble(view.getTxtjumlah().getText()));
        dao.insert(model);
    }
    
    public void delete(){
        int index = view.getTable_penjualan().getSelectedRow();
        dao.delete(index);
    }
    
    public void onClickTable(){
        int index = view.getTable_penjualan().getSelectedRow();
        model = dao.getPenjualan(index);
        view.getTxtnama_barang().setText(model.getNama_barang());
        view.getTxtharga().setText(model.getHarga()+"");
        view.getTxtjumlah().setText(model.getJumlah()+"");
       
    }
    
    public void viewTable(){
        DefaultTableModel tableModel = (DefaultTableModel)view.getTable_penjualan().getModel();
        tableModel.setRowCount(0);
        for(Penjualan s : dao.getData()){
            Object[] d={
                s.getNama_barang(),
                s.getHarga(),
                s.getJumlah(),
                s.getTotal()
            };
            tableModel.addRow(d);
        }     
    }
    
    public void simpan(){
        model= new Penjualan();
        model.setKode_faktur(view.getTxtkode_faktur().getText());
        model.setTanngal_faktur(view.getTxttgl_faktur().getText());
        model.setPelanggan(view.getTxtpelanggan().getText());
        dai.simpan(model);
        
        javax.swing.JOptionPane.showMessageDialog(view, "Berhasil Disimpan");
    }
    
    

   
     
 
    
}
