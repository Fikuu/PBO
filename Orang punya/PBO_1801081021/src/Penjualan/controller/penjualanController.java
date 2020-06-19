
package Penjualan.controller;

import javax.swing.table.DefaultTableModel;
import Penjualan.view.View_Penjualan;
import Penjualan.model.penjualan;
import Penjualan.model.penjualanDao;

public class penjualanController {
    View_Penjualan view;
    penjualan model;
    penjualan model1;
    penjualanDao dao;
    
    public penjualanController(View_Penjualan view){
        this.view = view;
        dao = new penjualanDao();
    }
    
    public void bersihForm(){
       view.getkd_faktur().setText("");
       view.gettgl_Faktur().setText("");
       view.getpelanggan().setText("");
       view.getnamaBrg().setText("");
       view.getharga().setText("");
       view.getjumlah().setText("");
       view.getlistData().clearSelection();
    }
    
    public void insert(){
        model = new penjualan();
        model.setNama(view.getnamaBrg().getText());
        model.setHarga(Double.parseDouble(view.getharga().getText()));
        model.setJumlah(Double.parseDouble(view.getjumlah().getText()));
        dao.insert(model);
        javax.swing.JOptionPane.showMessageDialog(view, "Entri Data OK");
        
    }
    
    public void simpan(){
        model1 = new penjualan();
        model1.setKdfaktur(view.getkd_faktur().getText());
        model1.setDate(view.gettgl_Faktur().getText());
        model1.setPelanggan(view.getpelanggan().getText());
        
        dao.simpan(model1,model);
        javax.swing.JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
    }
    
    public void delete(){
        int delete = view.getlistData().getSelectedRow();
        dao.delete(delete);
    }
    
    public void cari(){
        int index = view.getlistData().getSelectedRow();
        int index1 = view.getListFaktur().getSelectedRow();
        
        
        model = dao.getPenjualan (index);
        model1 = dao.getPenjualanAll(index1);
         

        
         view.getkd_faktur().setText(model1.getKdfaktur());
         view.gettgl_Faktur().setText(model1.getDate());
         view.getpelanggan().setText(model1.getPelanggan());
         view.getnamaBrg().setText(model.getNama());
         view.getharga().setText(model.getHarga()+"");
         
         view.getjumlah().setText(model.getJumlah()+"");
    }
    
    
    public void viewData(){
        DefaultTableModel tableModel = (DefaultTableModel) view.getlistData().getModel();
        tableModel.setRowCount(0);
        for(penjualan s : dao.getData()){
            Object[] d = {
                s.getNama(),
                s.getHarga(),
                s.getJumlah(),
                s.getTotal(),
                s.getKdfaktur()
            };
            tableModel.addRow(d);
        }
    }
    
    public void viewDataFaktur(){
        DefaultTableModel tableModel1 = (DefaultTableModel) view.getListFaktur().getModel();
        tableModel1.setRowCount(0);
        for(penjualan x : dao.getDataAll()){
            Object[] e = {
                x.getKdfaktur(),
                x.getDate(),
                x.getPelanggan(),
                x.getNama()
            };
            tableModel1.addRow(e);
        }
    }
}
