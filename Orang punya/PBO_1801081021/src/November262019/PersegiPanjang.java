
package November262019;


public class PersegiPanjang implements Relation{
    private int panjang;
    private int lebar;
    
    public PersegiPanjang(){
        panjang=0;
        lebar=0;
    }

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getLuas(){
        return panjang*lebar;
    }
    
    public boolean isGreater(Object a, Object b){
       PersegiPanjang p1 = (PersegiPanjang)a;
       PersegiPanjang p2 = (PersegiPanjang)b;
       return p1.getLuas()>p2.getLuas();
   }
   public boolean isLess(Object a, Object b){
       PersegiPanjang p1 = (PersegiPanjang)a;
       PersegiPanjang p2 = (PersegiPanjang)b;
       return p1.getLuas()<p2.getLuas();
   }
   public boolean isEqual(Object a, Object b){
       PersegiPanjang p1 = (PersegiPanjang)a;
       PersegiPanjang p2 = (PersegiPanjang)b;
       return p1.getLuas()==p2.getLuas();
   }
   
    public static void main(String[] args) {
        Relation p = new PersegiPanjang();
        boolean hasil=p.isGreater(new PersegiPanjang(10,5), new PersegiPanjang(2,12));
        System.out.println(hasil);
    }
    
    
    
    
}
