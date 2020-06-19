
package November262019;


public class Student extends Person{

    public Student() {
        super("Ani","Padang");
        System.out.println("Inside Student:Constructor");
    }
    
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
    
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.address);
    }
    
    //Jika memakai Final maka tidak bisa di override lagi
    
}
