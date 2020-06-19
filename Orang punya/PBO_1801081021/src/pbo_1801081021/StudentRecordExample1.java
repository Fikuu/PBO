
package pbo_1801081021;

/**
 *
 * @author faizura
 */
public class StudentRecordExample1 {
    public static void main(String[] args) {
        StudentRecord andi =  new StudentRecord();
        StudentRecord ali =  new StudentRecord("Ali");
        StudentRecord ani = new StudentRecord("Ani","Padang");
        
        ali.print("");
        ani.print("");
        andi.print("");
    }
}
