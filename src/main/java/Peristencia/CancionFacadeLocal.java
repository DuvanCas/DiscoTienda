/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peristencia;

import Entity.Cancion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author duvan
 */
@Local
public interface CancionFacadeLocal {

    void create(Cancion cancion);

    void edit(Cancion cancion);

    void remove(Cancion cancion);

    Cancion find(Object id);

    List<Cancion> findAll();

    List<Cancion> findRange(int[] range);

    int count();
    
}
