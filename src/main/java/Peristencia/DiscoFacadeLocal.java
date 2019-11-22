/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peristencia;

import Entity.Disco;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author duvan
 */
@Local
public interface DiscoFacadeLocal {

    void create(Disco disco);

    void edit(Disco disco);

    void remove(Disco disco);

    Disco find(Object id);

    List<Disco> findAll();

    List<Disco> findRange(int[] range);

    int count();
    
}
