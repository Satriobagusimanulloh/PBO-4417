/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import mvc.DAOInterface.IDutaCoding;
import mvc.Koneksi.Koneksi;
import mvc.Model.Pendaftar;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class DAODutaCoding implements IDutaCoding{
    Connection connection;
    final String insert = "INSERT INTO tb_pendaftaran (nik, nama, jenis_kelamin, alamat, usia, alasan) VALUES (?, ?, ?, ?, ?, ?);";
    final String select = "SELECT * FROM tb_pendaftaran;";
    final String update = "UPDATE tb_pendaftaran set nik=?, nama=?, jenis_kelamin=?, alamat=?, usia=?, alasan=?;";
    final String delete = "DELETE FROM tb_pendaftaran WHERE nik=?;";
    
    public DAODutaCoding(){
        connection = Koneksi.connection();
    }
    
    @Override
    public void insert(Pendaftar b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setInt(1, b.getNik());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlamat());
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Berhasil mendaftar");
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Gagal mendaftar");
            }
        }
    }

    @Override
    public void update(Pendaftar b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setInt(1, b.getNik());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlamat());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Berhasil update data");
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Gagal update data");
            }
        }
    }

    @Override
    public void delete(int nik) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, nik);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Berhasil menghapus data");
        } finally{
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Gagal menghapus data");
            }
        }
    }

    @Override
    public List<Pendaftar> getAll() {
        List<Pendaftar> lstPendaftar = null;
        try {
            lstPendaftar = new ArrayList<Pendaftar>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Pendaftar b = new Pendaftar();
                b.setNik(rs.getInt("nik"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jenis_kelamin"));
                b.setAlamat(rs.getString("alamat"));
                b.setUsia(rs.getInt("usia"));
                b.setAlasan(rs.getString("alasan"));
                lstPendaftar.add(b);
            }
        } catch (SQLException e) {
            Logger.getLogger(DAODutaCoding.class.getName()).log(Level.SEVERE, null, e);
        }
        return lstPendaftar;
    }
    
}
