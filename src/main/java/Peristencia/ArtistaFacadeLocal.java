/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peristencia;

import Entity.Artista;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author duvan
 */
@Local
public interface ArtistaFacadeLocal {

    void create(Artista artista);

    void edit(Artista artista);

    void remove(Artista artista);

    Artista find(Object id);

    List<Artista> findAll();

    List<Artista> findRange(int[] range);

    int count();
    
}
