/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdiBeans;

import entities.News;
import entities.Press;
import entityControl.NewsFacade;
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
    
    String newsID;

    public String getNewsID() {
        return newsID;
    }

    public void setNewsID(String newsID) {
        this.newsID = newsID;
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
        newsFacade.create(newNews);
        return "news";
    }
    
//    public List<Press> pressListl(){
//        return pressFacade.findAll();
//    }
    
}
