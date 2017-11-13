package com.pedantic;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class SushiServiceDecorator implements Food {

    @Inject
    @Sushi
    @Delegate
    Food food;


    @Override
    public String prepare() {
        System.out.println("Adding 20gm of pepper to the sushi");
        return food.prepare();
    }
}
