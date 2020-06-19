/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Fikri
 */
public class student extends person{
    public student(){
        super("ani","padang");
        System.out.println("Inside Student : Constructor");
    }
    
    public String getName(){
        System.out.println("Student:getNmae");
        return name;
    }
    
    public static void main(String[] args) {
        student Student = new student();
        System.out.println(Student.name);
        System.out.println(Student.address);
        
    }
            
    
}
