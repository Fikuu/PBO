
package November262019;


public class ContohPolimorfis {
    public static void main(String[] args) {
        Person ref;
        Student student = new Student();
        Employee emp= new Employee();
        student.setName("Andi");
        student.setAddress("Padang");
        ref=student;
        System.out.println("Nama : "+ref.getName());
        System.out.println("Alamat : "+ref.getAddress());
        ref=emp;
        System.out.println("Nama : "+emp.getName());
        
        //Polimorfis digunakan untuk merubah sifat
        
    }
}
