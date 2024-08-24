package org.example;

import org.example.models.Dogs;

public class Main {
    public static void main(String[] args) {

        Dogs dog1 = new Dogs("Sharik", 4);
        try {
            dog1.training();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}