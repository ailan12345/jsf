/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdiBeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

/**
 *
 * @author karta
 */
@Named(value = "addressBean")
@SessionScoped
public class addressBean implements Serializable, ActionListener {

    private String address;
    private String zipCode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public void handleActionEvent(ActionEvent enent) {
        System.out.println("aaaa");
    }
    /**
     * Creates a new instance of addressBean
     */
    public addressBean() {
    }
    
    public String actionMethod() {
        System.out.println("bbbbbbbbb");
        return "";
    }
    
    public String back() {
        return "home2";
    }

    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
        System.out.println("Execute Action Method codes in the Action Event Class");
    }
    
}
