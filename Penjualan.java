/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuap;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Penjualan implements ProductCounter {
    private ArrayList<Produk> listProduk;
    private int jumlahProduk;
    private int stok;
    
    public void hitungJumlahProduk() {
    }
    
    public void hitungHargaProduk() {
    }

    public Penjualan(ArrayList<Produk> listProduk, int jumlahProduk, int stok) {
        this.listProduk = listProduk;
        this.jumlahProduk = jumlahProduk;
        this.stok = stok;
    }

    public ArrayList<Produk> getListProduk() {
        return listProduk;
    }

    public void setListProduk(ArrayList<Produk> listProduk) {
        this.listProduk = listProduk;
    }

    public int getJumlahProduk() {
        return jumlahProduk;
    }

    public void setJumlahProduk(int jumlahProduk) {
        this.jumlahProduk = jumlahProduk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void getProduk() {
    }
}
