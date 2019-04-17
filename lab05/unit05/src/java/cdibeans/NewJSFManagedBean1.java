/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author karta
 */
@Named(value = "newJSFManagedBean1")
@SessionScoped
public class NewJSFManagedBean1 implements Serializable {

    /**
     * Creates a new instance of NewJSFManagedBean1
     */
    public NewJSFManagedBean1() {
    }
    
}
