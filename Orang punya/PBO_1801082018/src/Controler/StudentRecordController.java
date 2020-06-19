/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.StudentRecordDao;
import Model.StudentRecord;
import View.FromStudentRecord;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fikri
 */
public class StudentRecordController {
    FromStudentRecord view;
    StudentRecord model;
    StudentRecordDao dao;
    
    public StudentRecordController(FromStudentRecord view){
        this.view = view;
        dao = new StudentRecordDao();
    }
    
    public void bersihFrom(){
        view.getTxtName().setText("");
        view.getTxtAddress().setText("");
        view.getTxtAge().setText("");
        view.getTxtMathGrade().setText("");
        view.getTxtEnglishGrade().setText("");
        view.getTxtScienceGrade().setText("");
    }
    
    public void insert(){
        model = new StudentRecord();
        model.setName(view.getTxtName().getText());
        model.setAddress(view.getTxtAddress().getText());
        model.setAge(Integer.parseInt(view.getTxtAge().getText()));
        model.setMathGrade(Double.parseDouble(view.getTxtMathGrade().getText()));
        model.setenglishGrade(Double.parseDouble(view.getTxtEnglishGrade().getText()));
        model.setScienceGrade(Double.parseDouble(view.getTxtScienceGrade().getText()));
        
        dao.insert(model);
        javax.swing.JOptionPane.showMessageDialog(view, "Entri data OK");
        
    }
    
    public void update(){
        model = new StudentRecord();
        model.setName(view.getTxtName().getText());
        model.setAddress(view.getTxtAddress().getText());
        model.setAge(Integer.parseInt(view.getTxtAge().getText()));
        model.setMathGrade(Double.parseDouble(view.getTxtMathGrade().getText()));
        model.setenglishGrade(Double.parseDouble(view.getTxtEnglishGrade().getText()));
        model.setScienceGrade(Double.parseDouble(view.getTxtScienceGrade().getText()));
        
        dao.update(view.getTableStudentRecord().getSelectedRow(),model);
        javax.swing.JOptionPane.showMessageDialog(view, "Update data OK");
    }
    
    public void delete(){
        int index = view.getTableStudentRecord().getSelectedRow();
        dao.delete(index);
    }
    
    public void onClickTable(){
        int index = view.getTableStudentRecord().getSelectedRow();
        model = dao.getStudentRecord(index);
        view.getTxtName().setText(model.getName());
        view.getTxtAddress().setText(model.getAddress());
        view.getTxtAge().setText(model.getAge()+"");
        view.getTxtMathGrade().setText(model.getMathGrade()+"");
        view.getTxtEnglishGrade().setText(model.getEnglishGrade()+"");
        view.getTxtScienceGrade().setText(model.getScienceGrade()+"");
       
    }
    
    public void viewTable(){
        DefaultTableModel tableModel = (DefaultTableModel)view.getTableStudentRecord().getModel();
        tableModel.setRowCount(0);
        for(StudentRecord s : dao.getData()){
            Object[] d={
                s.getName(),
                s.getAddress(),
                s.getAge(),
                s.getMathGrade(),
                s.getEnglishGrade(),
                s.getScienceGrade(),
                s.getAverage(),
                s.getJumlah()
                
            };
            tableModel.addRow(d);
        }
    }
    
    
        
}
    

