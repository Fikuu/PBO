
package November262019;


public class MyInteger implements Relation{
   public boolean isGreater(Object a, Object b){
       int n1 = (int)a;
       int n2=(int)b;
       return n1>n2;
   }
   public boolean isLess(Object a, Object b){
       int n1 = (int)a;
       int n2=(int)b;
       return n1<n2;
   }
   public boolean isEqual(Object a, Object b){
       int n1 = (int)a;
       int n2=(int)b;
       return n1==n2;
   }
    public static void main(String[] args) {
        Relation myInt = new MyInteger();
        boolean hasil = myInt.isGreater(20,30);
        System.out.println(hasil);
    }
   
}
