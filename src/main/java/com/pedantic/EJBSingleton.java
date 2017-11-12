package com.pedantic;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class EJBSingleton {

    List<String> foods = new ArrayList<>();

    public void addFood(String food) {
        foods.add(food);
    }

    public int giveMeYourCode() {
        return this.hashCode();
    }

    public List<String> getFoods() {
        return foods;
    }
}
