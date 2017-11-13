package com.pedantic;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@ApplicationScoped
public class CDISingleton {

    List<String> foods = new CopyOnWriteArrayList<>();
    @Inject
    Event<String> orderEvent;

    @Inject
    @Sushi
    Food foodService;

    public void addFood(String food) {
        foods.add(food);
//        orderEvent.fire(food + " was ordered at " + new Date().toString());


//        orderEvent.fireAsync(food + " was ordered at " + new Date().toString());
        System.out.println(foodService.prepare());

    }

    public int giveMeYourCode() {
        return this.hashCode();
    }

    public List<String> getFoods() {
        return foods;
    }
}
