/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import ejb.ItemFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import entities.Item;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author ailan
 */
@Named(value = "crudBean")
@SessionScoped
public class CrudBean implements Serializable {
    
    @EJB
    private ItemFacade itemFacade;
    
    private Item newItem;
    private Item item;
    private Long itemId;
    /**
     * Creates a new instance of CrudBean
     */
    public CrudBean() {
    }
    
     public Item getNewItem() {
        return newItem;
    }

    public void setNewItem(Item newItem) {
        this.newItem = newItem;
    }
    
    
    public List<Item> findAll(){
        return itemFacade.findAll();
    }
    
    public String goNewItemPage(){
        this.newItem = new Item();
        return "createItem";
    }
    
    public String addItem(){
        itemFacade.create(newItem);
        return "itemList";
    }
    
//    public Item getItem() {
//        return itemFacade.find(itemId);
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }
    
    public String deleteItem(long itemId){
        itemFacade.remove(itemFacade.find(itemId));
        return "itemList";
    }
    
}
