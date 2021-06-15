/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.DAOInterface.IBarang;
import mvc.Koneksi.Koneksi;
import mvc.Model.Barang;

/**
 *
 * @author acer
 */
public class DAOBarang implements IBarang {
    Connection connection;
    final String insert = "INSERT INTO tb_barang (KODE, NAMA_BARANG, HARGA) VALUES (?, ?, ?);";
    final String update = "UPDATE tb_barang set NAMA_BARANG=?, HARGA=? where KODE=? ;";
    final String delete = "DELETE FROM tb_barang where id=?;";
    final String select = "SELECT * FROM tb_barang;";
    
    public  DAOBarang() {
        connection = Koneksi.connection();
    }

    @Override
    public void insert(Barang b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setInt(1, b.getKode());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getHarga());
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Berhasil input");
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Gagal input");
            }
        }
    }

    @Override
    public void update(Barang b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setInt(5, b.getKode());
            statement.setString(1, b.getNama());
            statement.setString(2, b.getHarga());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Berhasil update!");
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Gagal input!");
            }
        }
    }

    @Override
    public void delete(int kode) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, kode);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Berhasil delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Gagal delete!");
            }
        }
    }

    @Override
    public List<Barang> getAll() {
        List<Barang> lb = null;
        try {
            lb = new ArrayList<Barang>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Barang b = new Barang();
                b.setKode(rs.getInt("KODE"));
                b.setNama(rs.getString("NAMA_BARANG"));
                b.setHarga(rs.getString("HARGA"));
                lb.add(b);
            }
        } catch (SQLException e) {
            Logger.getLogger(DAOBarang.class.getName()).log(Level.SEVERE, null, e);
        }
        return lb;
    }  
}
