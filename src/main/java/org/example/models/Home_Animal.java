package org.example.models;

import lombok.Getter;
import lombok.Setter;
import org.example.NewCommands;

@Getter
@Setter
public abstract class Home_Animal implements NewCommands {

    private String nickname;
    private int age;

    public Home_Animal(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
}
