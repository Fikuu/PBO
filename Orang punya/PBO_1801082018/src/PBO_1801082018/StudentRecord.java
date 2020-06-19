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
public class StudentRecord 
{
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    
    public StudentRecord()
    {
        studentCount++;
    }
    public StudentRecord(String temp)
    {
        this.name=temp;
    }
    
    public StudentRecord(String name,String address)
    {
        this.name = name;
        this.address =address;
    }
    
    public void setName(String name)
    {
        this.name= name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setAddress(String address)
    {
        this.address =address;
    }
    public String getAddress()
    {
        return address;
    }
    
    public void setAge(int age )
    {
        this.age =age;
    }
    public int getAge()
    {
        return age;
    }
    
    public void  setMathGrade(double matchGrade )
    {
        this.mathGrade =mathGrade;  
    
    }
    
    public double getMathGrade()
    {
        return mathGrade;
    }
    
    public void setenglishGrade(double englishGrade )
    {
        this.englishGrade =englishGrade;
       
    }
      public double getEnglishGrade()
    {
        return mathGrade;
    }
    
    public void setScienceGrade(double scienceGrade )
    {
        this.scienceGrade =scienceGrade;
        
    }
    public double getScienceGrade()
    {
        return scienceGrade;
    }
    
    
    public double getAverage()
    {
        average=(mathGrade+englishGrade+scienceGrade)/3;
        return average;
    }
    
    public static int getStudentCount()
    {
        return studentCount;
    }
    
    public void print (String temp)
    {
        System.out.println("Name         :"+name);
        System.out.println("Address      :"+address);
        System.out.println("Age          :"+age);
    }
    
    public void print (double mGrade, double eGrade, double sGrade)
    {
        System.out.println("Name                  :"+name);
        System.out.println("Matematika            :"+mGrade);
        System.out.println("English               :"+eGrade);
        System.out.println("Ilmu Pengetahuan      :"+sGrade);
    }

    
   
    
}

