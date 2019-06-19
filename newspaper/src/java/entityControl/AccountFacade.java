/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityControl;

import entities.Account;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ailan
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> {

    @PersistenceContext(unitName = "newspaperPU")
    private EntityManager em;
    
    // default constructor
    public AccountFacade() {
        super(Account.class);
    }
    
    
    protected EntityManager getEntityManager() {
        return em;
    }
}
