/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Item;
import entityControl.AbstractFacade;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author karta
 */
@Stateless
@LocalBean
public class ItemFacade extends AbstractFacade<Item>{

    
    @PersistenceUnit(unitName = "unit07PU")   
    private EntityManager em;
        
    public ItemFacade() {
        super(Item.class);
    }

    @Override
    protected EntityManager getEntityManager() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return em;
    }

}
