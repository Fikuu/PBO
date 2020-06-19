
package pbo_1801081021;

/**
 *
 * @author faizura
 */
public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord ali = new StudentRecord();
        StudentRecord ani = new StudentRecord();
        
        //mengisi data untuk ali
        ali.setname("Ali");
        ali.setaddress("Padang");
        ali.setage(20);
        ali.setmathGrade(80);
        ali.setenglishGrade(60);
        ali.setscienceGrade(80);
        
        //mengisi data untuk ani
        ani.setname("Ani");
        ani.setaddress("Padang");
        ani.setage(20);
        ani.setmathGrade(90);
        ani.setenglishGrade(70);
        ani.setscienceGrade(80);
        
        //Tampil data
        
        System.out.println("Nama        : "+ali.getname());
        System.out.println("Alamat      : "+ali.getaddress());
        System.out.println("Umur        : "+ali.getage());
        System.out.println("Matematika  : "+ali.getmathGrade());
        System.out.println("B. Inggris  : "+ali.getenglihsGrade());
        System.out.println("Ilmu Pengetahuan : "+ali.getenglihsGrade());
        System.out.println("Rata-Rata   : "+ali.getaverage());
        
        ani.print(""); //0 parameter
        ani.print(70, 60, 90);//3 parameter
        
        System.out.println("Jumlah Siswa : "+StudentRecord.getStudentCount());
        
        
    }
}
