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
import model.biodata;
import model.biodata1;
import view.formBiodata;
import javax.swing.table.DefaultTableModel;
public class biodataController {
    formBiodata view;
    biodata model;
    biodata1 dao;
    
    public biodataController(formBiodata view){
        this.view = view;
        dao = new biodata1();
    }
    
    public void bersih(){
        view.getTxtNama().setText("");
        view.getTxtUmur().setText("");
        view.getTxtAlamat().setText("");
        view.getTxtAgama().setText("");
    }
    
    public void insert(){
        model = new biodata();
        model.setNama(view.getTxtNama().getText());
        model.setUmur(Integer.parseInt(view.getTxtUmur().getText()));
        model.setAlamat(view.getTxtAlamat().getText());
        model.setAgama(view.getTxtAgama().getText());
        
        dao.insert(model);
        javax.swing.JOptionPane.showMessageDialog(view, "Entri data OK");
    }
    
     public void update(){
        model = new biodata();
        model.setNama(view.getTxtNama().getText());
        model.setUmur(Integer.parseInt(view.getTxtUmur().getText()));
        model.setAlamat(view.getTxtAlamat().getText());
        model.setAgama(view.getTxtAgama().getText());
        
        dao.update(view.getTableBiodata().getSelectedRow(),model);
        javax.swing.JOptionPane.showMessageDialog(view, "Update data OK");
    }
    
    public void delete(){
         int index = view.getTableBiodata().getSelectedRow();
        dao.delete(index);
    }
    
    public void onClick(){
         int index = view.getTableBiodata().getSelectedRow();
        model = dao.getBiodata(index);
        view.getTxtNama().setText(model.getNama());
        view.getTxtUmur().setText(model.getUmur()+"");
        view.getTxtAlamat().setText(model.getAgama());
       
        
    }
     public void viewTable(){
        DefaultTableModel tableModel = (DefaultTableModel)view.getTableBiodata().getModel();
        tableModel.setRowCount(0);
        for(biodata s : dao.getData()){
            Object[] d={
                s.getNama(),
                s.getUmur(),
                s.getAlamat(),
                s.getAgama(),
            };
            tableModel.addRow(d);
        }
    }
    
  
    
    
}
