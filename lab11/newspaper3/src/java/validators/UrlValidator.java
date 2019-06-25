/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validators;

import static com.sun.faces.facelets.util.Path.context;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author ailan
 */
@FacesValidator(value = "validators.UrlValidator")
public class UrlValidator implements Validator{
    @Override
    public void validate(FacesContext context, UIComponent uic, Object o) throws ValidatorException {
       StringBuilder url = new StringBuilder();
       String urlValue = o.toString();

       if(!urlValue.startsWith("http", 0)) {
           ((UIInput) uic).setValid(false);
            String msg = "url 格式輸入錯誤";
            context.addMessage(uic.getClientId(), new FacesMessage(msg));
       }
    }
}
