/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uibeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import repository.CarRepositoryBean;
import java.util.List;
import repository.Car;

/**
 *
 * @author karta
 */
@Named(value = "newJSFManagedBean")
@SessionScoped
public class NewJSFManagedBean implements Serializable {

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    @EJB CarRepositoryBean repositoryBean;
    
    
    public List<Car> getCars(){
        return repositoryBean.findAll();
    }
    
    String carId;
    
    public String getCarId(){
        return carId;
    }
    
    public void setCarId (String carId) {
        this.carId = carId;
    }

    public Car getCar () {
       return repositoryBean.query(Integer.valueOf(carId));
    }
    
    private String price;
    
    public String getPrice() {
        Car car = getCar();
        price = String.valueOf(car.getPrice());
        return price;
    }
  
    public void setPrice(String price) {
        this.price = price;
    }
    
    public String updateCarInfo(){
        Car car = getCar();
        car.setPrice(Integer.valueOf(price));
        return "home";
    }
    
}
