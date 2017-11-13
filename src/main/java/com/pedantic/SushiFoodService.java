package com.pedantic;

@Sushi
public class SushiFoodService implements Food {
    @Override
    public String prepare() {
        return "Sushi will be ready in ~20 minutes ....";
    }
}
