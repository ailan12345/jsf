/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

import entities.Item;
import entityControl.AbstractFacade;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ailan
 */
@Stateless
public class ItemFacade extends AbstractFacade<Item>{

     @PersistenceContext(unitName = "unit07PU")
    private EntityManager em;
    
    // default constructor
    public ItemFacade() {
        super(Item.class);
    }
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
