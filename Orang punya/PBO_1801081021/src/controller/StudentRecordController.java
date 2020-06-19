/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.table.DefaultTableModel;
import view.FormStudentRecord;
import model.StudentRecord;
import model.StudentRecordDao;

/**
 *
 * @author faizura
 */
public class StudentRecordController {
    FormStudentRecord view;
    StudentRecord model;
    StudentRecordDao dao;
    
    public StudentRecordController(FormStudentRecord view){
        this.view = view;
        dao = new StudentRecordDao();
    }
    
    public void bersihForm(){
        view.getTxtName().setText("");
        view.getTxtAddress().setText("");
        view.getTxtAge().setText("");
        view.getTxtMathGrade().setText("");
        view.getTxtEnglishGrade().setText("");
        view.getTxtScienceGrade().setText("");
    }
    
    public void insert(){
        model = new StudentRecord();
        model.setname(view.getTxtName().getText());
        model.setaddress(view.getTxtAddress().getText());
        model.setage(Integer.parseInt(view.getTxtAge().getText()));
        model.setmathGrade(Double.parseDouble(view.getTxtMathGrade().getText()));
        model.setenglishGrade(Double.parseDouble(view.getTxtEnglishGrade().getText()));
        model.setscienceGrade(Double.parseDouble(view.getTxtScienceGrade().getText()));
        dao.insert(model);
        javax.swing.JOptionPane.showMessageDialog(view, "Entri Data OK");
        
        
    }
    
    public void update(){
        model = new StudentRecord();
        model.setname(view.getTxtName().getText());
        model.setaddress(view.getTxtAddress().getText());
        model.setage(Integer.parseInt(view.getTxtAge().getText()));
        model.setmathGrade(Double.parseDouble(view.getTxtMathGrade().getText()));
        model.setenglishGrade(Double.parseDouble(view.getTxtEnglishGrade().getText()));
        model.setscienceGrade(Double.parseDouble(view.getTxtScienceGrade().getText()));
        dao.update(view.gettabelStudentRecord().getSelectedRow(),model);
        javax.swing.JOptionPane.showMessageDialog(view, "Update Data Berhasil");
    }
    
    public void delete(){
        int index = view.gettabelStudentRecord().getSelectedRow();
        dao.delete(index);
    }
    
    public void onClickTabel(){
        int index = view.gettabelStudentRecord().getSelectedRow();
        model = dao.getStudentRecord(index);
        view.getTxtName().setText(model.getname());
        view.getTxtAddress().setText(model.getaddress());
        view.getTxtAge().setText(model.getage()+"");
        view.getTxtMathGrade().setText(model.getmathGrade()+"");
        view.getTxtEnglishGrade().setText(model.getenglihsGrade()+"");
        view.getTxtScienceGrade().setText(model.getscienceGrade()+"");
    }
    
    public void viewTabel(){
        DefaultTableModel tabelModel = (DefaultTableModel) view.gettabelStudentRecord().getModel();
        tabelModel.setRowCount(0);
        for(StudentRecord s : dao.getData()){
            Object[]  d = {
                s.getname(),
                s.getaddress(),
                s.getmathGrade(),
                s.getenglihsGrade(),
                s.getscienceGrade()
            };
            tabelModel.addRow(d);
        }
    }
}
