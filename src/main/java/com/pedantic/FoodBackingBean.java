package com.pedantic;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@ViewScoped
@Named
public class FoodBackingBean implements Serializable {
    @Inject
    EJBSingleton ejbSingleton;
    @Inject
    CDISingleton cdiSingleton;
   
    private String food;

    public String saveFood() {
        cdiSingleton.addFood(food);
     
        return "list-foods.xhtml?faces-redirect=true";
    }

    public List<String> getFoods() {
        return cdiSingleton.getFoods();
    }

    public int getId() {
        return cdiSingleton.giveMeYourCode();
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
