/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ailan
 */
@FacesConverter(value = "converters.urlConverter")
public class UrlConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
         String url = string.replaceAll("[http://]+", "");
        return url;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        String inputVal = (String) o;
        return "https://" + inputVal;
    }
    
}
