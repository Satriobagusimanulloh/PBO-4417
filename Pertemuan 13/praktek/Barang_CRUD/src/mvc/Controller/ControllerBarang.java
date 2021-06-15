package mvc.Controller;

import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAO.DAOBarang;
import mvc.DAOInterface.IBarang;
import mvc.Model.Barang;
import mvc.Model.TabelModelBarang;
import mvc.View.FormView;

public class ControllerBarang {
    FormView frame;
    IBarang implBarang;
    List<Barang> lb;
    
    public ControllerBarang(FormView frame) {
        this.frame = frame;
        implBarang = new DAOBarang();
        lb = implBarang.getAll();
    }
        
    public  void isiTable() {
        lb = implBarang.getAll();
        TabelModelBarang tmb = new TabelModelBarang(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void reset() {
        frame.getTxtKode().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtHarga().setText("");
    }
    
    public void isiField(int row) {
        frame.getTxtKode().setText(lb.get(row).toString());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtHarga().setText(lb.get(row).getHarga());
    }

    public void insert() {
        if (!frame.getTxtKode().getText().trim().isEmpty()& !frame.getTxtNama().getText().trim().isEmpty()) {
            Barang b = new Barang();
            b.setKode(Integer.parseInt(frame.getTxtKode().getText()));
            b.setNama(frame.getTxtNama().getText());
            b.setHarga(frame.getTxtHarga().getText());
            implBarang.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan data sukses");
        } else{
            JOptionPane.showMessageDialog(frame, "Data tidak boleh kosong!");
        }
    }

    public void update() {
        if (!frame.getTxtKode().getText().trim().isEmpty()) {
            Barang b = new Barang();
            b.setNama(frame.getTxtNama().getText());
            b.setHarga(frame.getTxtHarga().getText());
            b.setKode(Integer.parseInt(frame.getTxtKode().getText()));
            implBarang.update(b);
            JOptionPane.showMessageDialog(null, "Update data sukses");
        } else{
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan diubah!");
        }
    }

    public void delete() {
        if (!frame.getTxtKode().getText().trim().isEmpty()) {
            int kode = Integer.parseInt(frame.getTxtKode().getText());
            implBarang.delete(kode);
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        } else{
        JOptionPane.showMessageDialog(frame, "Pilih data yang akan dihapus");
        }
    }
}
