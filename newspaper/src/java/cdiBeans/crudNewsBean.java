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
    
    String pressID;

    public String getPressID() {
        return pressID;
    }

    public void setPressID(String pressID) {
        this.pressID = pressID;
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
//        newNews.press = pressFacade.find(Long.parseLong(pressID));
        newsFacade.create(newNews);
//        newsFacade.edit(newNews);
        return "news";
    }
    
//    public List<Press> pressListl(){
//        return pressFacade.findAll();
//    }
    
    
}
