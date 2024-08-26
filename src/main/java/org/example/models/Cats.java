package org.example.models;

import static java.lang.Thread.sleep;

public class Cats extends Home_Animal {
    public Cats(String nickname, int age) {
        super(nickname, age);
    }

//region Методы
    @Commands
    public String doJumpingToToy(){
        return this.getNickname() + " is jumping to the toy";
    }
    @Commands
    public String doMiau(){
        return "Miau miau miau";
    }
//endregion
}
