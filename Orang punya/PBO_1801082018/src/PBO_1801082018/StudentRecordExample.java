/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_1801082018;



/**
 *
 * @author Fikri
 */
public class StudentRecordExample 
{
    public static void main(String[] args)
    {
        StudentRecord ali = new StudentRecord();
        StudentRecord ani = new StudentRecord();
        
        ali.setName("Ali");
        ali.setAddress("Padang");
        ali.setAge(20);
        ali.setMathGrade(80);
        ali.setenglishGrade(70);
        ali.setScienceGrade(80);
        
        ani.setName("Ani");
        ani.setAddress("Padang");
        ani.setAge(20);
        ani.setMathGrade(80);
        ani.setenglishGrade(70);
        ani.setScienceGrade(80);
        
        
        
      System.out.println("Nama               :"+ali.getName());
      System.out.println("Alamat             :"+ali.getAddress());
      System.out.println("Umur               :"+ali.getAge());
      System.out.println("Matematika         :"+ali.getMathGrade());
      System.out.println("Matematika         :"+ali.getEnglishGrade());
      System.out.println("Matematika         :"+ali.getScienceGrade());
      System.out.println("Rata-Rata          :"+ali.getAverage());
      
      
      ani.print("");
      ani.print(70,60,90);
      
      System.out.println("Jumlah Siswa :"+StudentRecord.getStudentCount());
      
      
                
        
    }
    
}
