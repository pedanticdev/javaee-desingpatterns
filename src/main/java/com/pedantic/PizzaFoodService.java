package com.pedantic;

@Pizza
public class PizzaFoodService implements Food {
    @Override
    public String prepare() {
        return "Pizza will be ready in ~5 minutes...";
    }
}
