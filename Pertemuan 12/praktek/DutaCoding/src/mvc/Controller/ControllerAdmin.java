/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAO.DAODutaCoding;
import mvc.DAOInterface.IDutaCoding;
import mvc.Model.Pendaftar;
import mvc.Model.TabelModelPendaftar;
import mvc.View.AdminView;

/**
 *
 * @author acer
 */
public class ControllerAdmin {
    AdminView frameAdmin;
    IDutaCoding pendaftar;
    List<Pendaftar> lp;
    
    public ControllerAdmin(AdminView frameAdmin){
        this.frameAdmin = frameAdmin;
        pendaftar = new DAODutaCoding();
        lp = pendaftar.getAll();
    }
    
    public void update() {
        if (!frameAdmin.getTfNIK().getText().trim().isEmpty()) {
            Pendaftar b = new Pendaftar();
            b.setNik(Integer.parseInt(frameAdmin.getTfNIK().getText()));
            b.setNama(frameAdmin.getTfNama().getText());
            b.setJk(frameAdmin.getCbJK().getSelectedItem().toString());
            b.setAlamat(frameAdmin.getTfAlamat().getText());
            b.setUsia(Integer.parseInt(frameAdmin.getTfUsia().getText()));
            b.setAlasan(frameAdmin.getTaAlasan().getText());
            pendaftar.update(b);
            JOptionPane.showMessageDialog(null, "Update data sukses");
        } else{
            JOptionPane.showMessageDialog(frameAdmin, "Pilih data yang akan diubah!");
        }
    }

    public void delete() {
        if (frameAdmin.getTfNIK().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(frameAdmin, "Pilih data yang akan dihapus");
        } else{
            int nik = Integer.parseInt(frameAdmin.getTfNIK().getText());
            pendaftar.delete(nik);
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        }
    }
    
    public  void isiTable() {
        lp = pendaftar.getAll();
        TabelModelPendaftar tmp = new TabelModelPendaftar(lp);
        frameAdmin.getTabelData().setModel(tmp);
    }
    
    public void isiField(int row) {
        frameAdmin.getTfNIK().setText(lp.get(row).toString());
        frameAdmin.getTfNama().setText(lp.get(row).getNama());
        frameAdmin.getCbJK().setSelectedItem(lp.get(row).getJk());
        frameAdmin.getTfAlamat().setText(lp.get(row).getAlamat());
        frameAdmin.getTfUsia().setText(lp.get(row).toString());
        frameAdmin.getTaAlasan().setText(lp.get(row).getAlasan());
    }
    
    public void reset() {
        frameAdmin.getTfNIK().setText("");
        frameAdmin.getTfNama().setText("");
        frameAdmin.getCbJK().setSelectedItem("");
        frameAdmin.getTfAlamat().setText("");
        frameAdmin.getTfUsia().setText("");
        frameAdmin.getTaAlasan().setText("");
    }
}
