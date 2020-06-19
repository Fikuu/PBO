/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fikri
 */
public class Penjualan {
    private String kode_faktur;
    private String tanngal_faktur;
    private String pelanggan;
    
    private String nama_barang;
    private double harga;
    private double jumlah;
    private double total;

    public String getKode_faktur() {
        return kode_faktur;
    }

    public void setKode_faktur(String kode_faktur) {
        this.kode_faktur = kode_faktur;
    }

    public String getTanngal_faktur() {
        return tanngal_faktur;
    }

    public void setTanngal_faktur(String tanngal_faktur) {
        this.tanngal_faktur = tanngal_faktur;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
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
    

    public double getTotal() {
        total= (jumlah*harga);
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
