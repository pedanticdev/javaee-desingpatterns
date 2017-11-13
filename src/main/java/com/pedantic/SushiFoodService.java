package com.pedantic;

import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

@Sushi
public class SushiFoodService implements Food {
    @Inject
    Logger logger;

    @Override
    public String prepare() {
        logger.log(Level.INFO, "Sushi food preparatio service called.");
        return "Sushi will be ready in ~20 minutes ....";
    }
}
