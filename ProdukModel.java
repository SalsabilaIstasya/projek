/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuap;

import db.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class ProdukModel {
    private final Connection CONN;

    public ProdukModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addProduk(Produk produk) {
        String insert = "INSERT INTO produk VALUES ('"
                + produk.getNama_produk() + "', " + produk.getHarga() + ", " + produk.getJumlah() + ", " + produk.getDiskon()
                + ");";
        
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
    
    public void deleteProduk(Produk produk) {
        String delete = "DELETE FROM produk WHERE nama_produk = '"
                + produk.getNama_produk() + "';";
        
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0){
            System.out.println("Berhasil menghapus data");
        } else {
                System.out.println("Gagal menghapus data");
                }
        } catch (SQLException ex) {
            Logger.getLogger(ProdukModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus data");
        }
    }
    
    public ArrayList<Produk> getProduk() {
        String query = "SELECT * FROM produk ";
        ArrayList<Produk> prd = new ArrayList<Produk>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Produk temp = new Produk(rs.getString("nama_produk"), rs.getDouble("harga"), rs.getInt("jumlah"), rs.getDouble("diskon"));
                prd.add(temp);
            }
            System.out.println("Berhasil Mengambil data");
        } catch (SQLException ex) {
            Logger.getLogger(ProdukModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Mengambil data");
        }
        return prd;
    } 
}
