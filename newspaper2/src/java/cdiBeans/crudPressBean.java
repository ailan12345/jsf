/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdiBeans;

import entities.Press;
import entityControl.PressFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author ailan
 */
@Named(value = "crudPressBean")
@SessionScoped
public class crudPressBean implements Serializable {
    
    @EJB
    private PressFacade pressFacade;
    
    private Press newsPress;

    public PressFacade getPressFacade() {
        return pressFacade;
    }

    public void setPressFacade(PressFacade pressFacade) {
        this.pressFacade = pressFacade;
    }

    public Press getNewsPress() {
        return newsPress;
    }

    public void setNewsPress(Press newsPress) {
        this.newsPress = newsPress;
    }

    /**
     * Creates a new instance of crudPressBean
     */
    public crudPressBean() {
    }
    
    public List<Press> findAll(){
        return pressFacade.findAll();
    }
    
    public String goNewPressPage(){
        this.newsPress = new Press();
        return "createPress";
    }
    
    public String addPress(){
        pressFacade.create(newsPress);
        return "press";
    }
    
}
