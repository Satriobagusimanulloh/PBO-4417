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
public class TabelModelMahasiswa extends AbstractTableModel{
    List<Mahasiswa> lb;
    
    public TabelModelMahasiswa(List<Mahasiswa> lb) {
        this.lb = lb;
    }
    
    @Override
    public  int getColumnCount() {
        return 5;
    }
    
    @Override
    public int getRowCount() {
        return lb.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "NIM";
            case 2:
                return "Nama";
            case 3:
                return "Kelamin";
            case 4:
                return "Alamat";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lb.get(rowIndex).getId();
            case 1:
                return lb.get(rowIndex).getNim();
            case 2:
                return lb.get(rowIndex).getNama();
            case 3:
                return lb.get(rowIndex).getJk();
            case 4:
                return lb.get(rowIndex).getAlamat();
            default:
                return null;
        }
    }
}