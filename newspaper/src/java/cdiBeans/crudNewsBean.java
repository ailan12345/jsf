/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdiBeans;

import entities.News;
import entities.Press;
import entityControl.NewsFacade;
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
@Named(value = "crudNewsBean")
@SessionScoped
public class crudNewsBean implements Serializable {
    
    @EJB
    private NewsFacade newsFacade;
    @EJB
    private PressFacade pressFacade;

    public NewsFacade getNewsFacade() {
        return newsFacade;
    }

    public void setNewsFacade(NewsFacade newsFacade) {
        this.newsFacade = newsFacade;
    }

    public News getNewNews() {
        return newNews;
    }

    public void setNewNews(News newNews) {
        this.newNews = newNews;
    }
    
    private News newNews;
    
    private Long pressID;

    public PressFacade getPressFacade() {
        return pressFacade;
    }

    public Long getPressID() {
        return pressID;
    }

    public void setPressID(Long pressID) {
        this.pressID = pressID;
    }

    public void setPressFacade(PressFacade pressFacade) {
        this.pressFacade = pressFacade;
    }

  
 
    /**
     * Creates a new instance of crudNewsBean
     */
    public crudNewsBean() {
    }
    
    public List<News> findAll(){
        return newsFacade.findAll();
    }
    
    public String goNewPressPage(){
        this.newNews = new News();
        return "createNews";
    }
    
    public String addNews(){
//        System.out.println(pressID);
        Press aPress = pressFacade.find(pressID);
        newNews.setPress(aPress);
//        newNews.setContent("AAAAA");
        newsFacade.create(newNews);
        return "news";
    }
   
}
