package com.pedantic;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@ApplicationScoped
public class CDISingleton {

    List<String> foods = new CopyOnWriteArrayList<>();


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
