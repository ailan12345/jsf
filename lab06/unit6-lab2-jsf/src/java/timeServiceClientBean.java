/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ejb3.session.TimeService;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author karta
 */
@Named(value = "timeServiceClientBean")
@RequestScoped
public class timeServiceClientBean {
    
   @EJB
   TimeService timeServiceBean;
    /**
     * Creates a new instance of timeServiceClientBean
     */
    public timeServiceClientBean() {
    }
    
    public String getCurrentTime(){
        System.out.println(timeServiceBean.getClass());
        return timeServiceBean.getTime();
    }
    
}
