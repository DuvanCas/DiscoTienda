/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peristencia;

import Entity.Artista;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author duvan
 */
@Stateless
public class ArtistaFacade extends AbstractFacade<Artista> implements ArtistaFacadeLocal {
    @PersistenceContext(unitName = "com.udec_disco_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArtistaFacade() {
        super(Artista.class);
    }
    
}
