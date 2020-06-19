
package Penjualan.model;


public class penjualan {
    private String kdfaktur;
    private String date;
    private String pelanggan;
    private String nama;
    private String cari;
    private double harga;
    private double jumlah;
    private double total;
    
    public penjualan(){
        kdfaktur="";
        date="";
        pelanggan="";
        nama="";
        
    }

    public String getKdfaktur() {
        return kdfaktur;
    }

    public void setKdfaktur(String kdfaktur) {
        this.kdfaktur = kdfaktur;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    
     public String getcari() {
        return cari;
    }

    public void setcari(String cari) {
        this.cari = cari;
    }
    
    public double getTotal(){
        total = (harga*jumlah);
        return total;
    }

    
     
}
