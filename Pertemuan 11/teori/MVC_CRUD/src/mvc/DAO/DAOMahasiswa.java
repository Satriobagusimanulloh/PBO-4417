/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.DAOInterface.IMahasiswa;
import mvc.Koneksi.Koneksi;
import mvc.Model.Mahasiswa;

/**
 *
 * @author acer
 */
public class DAOMahasiswa implements IMahasiswa{
    Connection connection;
    final String insert = "INSERT INTO tblmahasiswa (id, nim, nama, jk, alamat) VALUES (?, ?, ?, ?, ?);";
    final String update = "UPDATE tblmahasiswa set nim=?, nama=?, jk=?, alamat=? where id=? ;";
    final String delete = "DELETE FROM tblmahasiswa where id=?;";
    final String select = "SELECT * FROM tblmahasiswa;";
    final String carinama = "SELECT * FROM tblmahasiswa where nama like ?;";
    
    public  DAOMahasiswa() {
        connection = Koneksi.connection();
    }

    @Override
    public void insert(Mahasiswa b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setInt(1, b.getId());
            statement.setString(2, b.getNim());
            statement.setString(3, b.getNama());
            statement.setString(4, b.getJk());
            statement.setString(5, b.getAlamat());
            statement.execute();
//            ResultSet rs = statement.getGeneratedKeys();
//            while (rs.next()) {
//                b.setId(rs.getInt(1));
//            }
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
    public void update(Mahasiswa b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNim());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setInt(5, b.getId());
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
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, id);
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
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> lb = null;
        try {
            lb = new ArrayList<Mahasiswa>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Mahasiswa b = new Mahasiswa();
                b.setId(rs.getInt("id"));
                b.setNim(rs.getString("nim"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                lb.add(b);
            }
        } catch (SQLException e) {
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, e);
        }
        return lb;
    }

    @Override
    public List<Mahasiswa> getCariNama(String nama) {
        List<Mahasiswa> lb = null;
        try {
            lb = new ArrayList<Mahasiswa>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1,  "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Mahasiswa b = new Mahasiswa();
                b.setId(rs.getInt("id"));
                b.setNim(rs.getString("nim"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                lb.add(b);
            }
        } catch (SQLException e) {
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, e);
        }
        return lb;
    }
}
