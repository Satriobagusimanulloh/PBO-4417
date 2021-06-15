/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author acer
 */
public class TabelModelBarang extends AbstractTableModel{

    List<Barang> lb;
    
    public TabelModelBarang(List<Barang> lb) {
        this.lb = lb;
    }
    
    @Override
    public int getRowCount() {
        return lb.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE";
            case 1:
                return "NAMA_BARANG";
            case 2:
                return "HARGA ";
            
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lb.get(rowIndex).getKode();
            case 1:
                return lb.get(rowIndex).getNama();
            case 2:
                return lb.get(rowIndex).getHarga();
            default:
                return null;
        }
    }    
}
