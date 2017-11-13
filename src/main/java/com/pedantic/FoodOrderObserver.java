package com.pedantic;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.ObservesAsync;
@RequestScoped
public class FoodOrderObserver {

    public void foodOrderObserver(@ObservesAsync String payload) {
        System.out.println(payload);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(FoodOrderObserver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
