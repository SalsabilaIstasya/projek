/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectuap;

import db.DBHelper;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class ProjectUap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        DBHelper.getConnection();
//        ProdukModel p = new ProdukModel();
          KategoriModel k = new KategoriModel();
        
//        Produk add = new Produk("Handphone", 25000000, 1, 2.0);
//        Produk dlt = new Produk("Ayam", 15000, 2, 4.0);
//        p.addProduk(add);
//        p.deleteProduk(dlt);

//        ArrayList<Produk> listProduk = p.getProduk();
//        for (int i=0; i<listProduk.size(); i++) {
//            System.out.println("Nama Produk = " + listProduk.get(i).getNama_produk());
//            System.out.println("Harga = " + listProduk.get(i).getHarga());
//            System.out.println("Jumlah = " + listProduk.get(i).getJumlah());
//            System.out.println("Diskon = " + listProduk.get(i).getDiskon());
//            System.out.println("");
//        }
//    }

        Kategori add = new Kategori ("Jantan");
//        Kategori dlt = new Kategori ("Jantan");
        k.addKategori(add);
//        k.deleteKategori(dlt);
    
    }
}
