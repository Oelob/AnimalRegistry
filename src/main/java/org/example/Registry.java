package org.example;

import org.example.models.Home_Animal;

import java.util.ArrayList;
import java.util.List;

public class Registry {

    private List<Home_Animal> registry;

    public Registry() {
        this.registry = new ArrayList<>();
    }

    public void addAnimal(Home_Animal animal){
        registry.add(animal);
    }

    public void removeAnimal(Home_Animal animal){
        registry.remove(animal);
    }

}
