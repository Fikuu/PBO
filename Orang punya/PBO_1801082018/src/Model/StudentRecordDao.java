/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;
/**
 *
 * @author Fikri
 */
public class StudentRecordDao {
    private List<StudentRecord> data = new ArrayList<StudentRecord>();
    
    public void insert(StudentRecord s){
        data.add(s);
    }
    public void update(int index, StudentRecord s){
        data.set(index, s);
    }
    public void delete(int index){
        data.remove(index);
    }
    public StudentRecord getStudentRecord(int index){
        return data.get(index);
    }
    public List<StudentRecord> getData(){
        return data;
    }

   
    
}

