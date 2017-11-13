package com.pedantic;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

@Decorator
public class SushiServiceDecorator implements Food {

    @Inject
    @Sushi
    @Delegate
    Food food;

    @Inject
    Logger logger;

    @Override
    public String prepare() {
        logger.log(Level.INFO, "Adding 20gm of pepper to the sushi");
        return food.prepare();
    }
}
