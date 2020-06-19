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
public class ContohPolimerfis {
    public static void main(String[] args) {
        person ref;
        student Student = new student();
        employee emp = new employee();
        
        Student.setName("Andi");
        Student.setAddress("padamg");
        
        ref = Student;
        System.out.println("Nama     :"+ref.getName());
        System.out.println("Alamat   :"+ref.getAddress());
        
        ref = emp;
        System.out.println("Nama     :"+ref.getName());
        
        
    }
}
