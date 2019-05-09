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
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author karta
 */
@Stateless
@LocalBean
public class ItemFacade extends AbstractFacade<Item>{

    /* Note to the revision
      @PersistenceUnit 和 PersistenceContext 是不同的, 應使用 @PersistenceContext. <br/>
      @PersistenceUnit: Expresses a dependency on an EntityManagerFactory and its associated persistence unit. 
    see: https://docs.oracle.com/javaee/6/api/javax/persistence/PersistenceUnit.html  <br/>
    @PersistenceContext: Expresses a dependency on a container-managed EntityManager and its associated persistence context.
    See: https://docs.oracle.com/javaee/7/api/javax/persistence/PersistenceContext.html
        
    */
    @PersistenceContext(unitName = "unit07PU")   
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
