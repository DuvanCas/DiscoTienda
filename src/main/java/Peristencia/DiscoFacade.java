/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peristencia;

import Entity.Disco;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author duvan
 */
@Stateless
public class DiscoFacade extends AbstractFacade<Disco> implements DiscoFacadeLocal {
    @PersistenceContext(unitName = "com.udec_disco_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiscoFacade() {
        super(Disco.class);
    }
    
}
