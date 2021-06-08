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
import mvc.View.UserView2;

public class ControllerPendaftar {
    UserView2 frameUser;
    IDutaCoding pendaftar;
    List<Pendaftar> lp;
    
    public ControllerPendaftar(UserView2 frameUser){
        this.frameUser = frameUser;
        pendaftar = new DAODutaCoding();
        lp = pendaftar.getAll();
    }

    public void reset() {
        frameUser.getTfNIK().setText("");
        frameUser.getTfNama().setText("");
        frameUser.getCbJK().setSelectedItem("");
        frameUser.getTfAlamat().setText("");
        frameUser.getTfUsia().setText("");
        frameUser.getTaAlasan().setText("");
    }

    public void insert() {
        if (!frameUser.getTfNIK().getText().trim().isEmpty() & !frameUser.getTfNama().getText().trim().isEmpty()) {
            Pendaftar b = new Pendaftar();
            b.setNik(Integer.parseInt(frameUser.getTfNIK().getText()));
            b.setNama(frameUser.getTfNama().getText());
            b.setJk(frameUser.getCbJK().getSelectedItem().toString());
            b.setAlamat(frameUser.getTfAlamat().getText());
            b.setUsia(Integer.parseInt(frameUser.getTfUsia().getText()));
            b.setAlasan(frameUser.getTaAlasan().getText());
            pendaftar.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan data sukses");
        } else{
            JOptionPane.showMessageDialog(frameUser, "Data tidak boleh kosong!");
        }
    }
}