/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.Pendaftar;

/**
 *
 * @author acer
 */
public interface IDutaCoding {
    public void insert(Pendaftar b);
    public void update(Pendaftar b);
    public void delete(int NIK);
    public List<Pendaftar> getAll();
}
