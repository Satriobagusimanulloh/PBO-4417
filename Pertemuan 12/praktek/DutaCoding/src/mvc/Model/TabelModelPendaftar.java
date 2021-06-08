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
public class TabelModelPendaftar extends AbstractTableModel{
    List<Pendaftar> lstPendaftar;
    
    public TabelModelPendaftar(List<Pendaftar> lstPendaftar){
        this.lstPendaftar = lstPendaftar;
    }

    @Override
    public int getRowCount() {
        return lstPendaftar.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIK";
            case 1:
                return "Nama";
            case 2:
                return "Jenis Kelamin";
            case 3:
                return "Alamat";
            case 4:
                return "Usia";
            case 5:
                return "Alasan";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return lstPendaftar.get(rowIndex).getNik();
            case 1:
                return lstPendaftar.get(rowIndex).getNama();
            case 2:
                return lstPendaftar.get(rowIndex).getJk();
            case 3:
                return lstPendaftar.get(rowIndex).getAlamat();
            case 4:
                return lstPendaftar.get(rowIndex).getUsia();
            case 5:
                return lstPendaftar.get(rowIndex).getAlasan();
            default:
                return null;
        }
    }
}
