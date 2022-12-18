/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuap;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class KategoriModel {
    private final Connection CONN;

    public KategoriModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addKategori (Kategori kategori) {
        String insert = "INSERT INTO kategori VALUES ('"
                + kategori.getNama_kategori() + "');";
        
        try {
            if (CONN.createStatement().executeUpdate(insert) > 0){
            System.out.println("Berhasil memasukkan data");
        } else {
                System.out.println("Gagal Memasukkan data");
                }
        } catch (SQLException ex) {
            Logger.getLogger(ProdukModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan data");
        }
    }
    
    public void deleteKategori(Kategori kategori) {
        String delete = "DELETE FROM kategori WHERE nama_kategori = '"
                + kategori.getNama_kategori() + "';";
        
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0){
            System.out.println("Berhasil menghapus data");
        } else {
                System.out.println("Gagal menghapus data");
                }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus data");
        }
    }
}
