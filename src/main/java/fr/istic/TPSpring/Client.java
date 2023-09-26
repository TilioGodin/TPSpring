package fr.istic.TPSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {

    @Value("${name:Jean}")
    private String name;

    public String getName() {
        return this.name;
    }
}
