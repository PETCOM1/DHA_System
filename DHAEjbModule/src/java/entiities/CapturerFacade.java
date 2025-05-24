/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Student
 */
@Stateless
public class CapturerFacade extends AbstractFacade<Capturer> implements CapturerFacadeLocal {

    @PersistenceContext(unitName = "DHAEjbModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CapturerFacade() {
        super(Capturer.class);
    }

    @Override
    public Integer countTotalOfSpecific(Integer id) {
        
        Query query = em.createQuery("SELECT COUNT(c) FROM Capturer c WHERE c.privateKey= :id");
        query.setParameter("id", id);
        Long cnt=(Long)query.getSingleResult();
        return cnt.intValue();
    }
    
    
    
    
}
