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
public class Kategori {
    private String nama_kategori;
    public Barang barang;

    public Kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    
    public void getProduk() { 
    }
}
