package org.example.models;

import org.example.Commands;

public class Hamsters extends Home_Animal {
    public Hamsters(String nickname, int age) {
        super(nickname, age);
    }


    @Commands
    public String doEat(){
        return this.getNickname() + " is eating";
    }
    @Commands
    public String doRunningAtWheel(){
        return this.getNickname() + " is running at wheel";
    }

    @Override
    public void training() {

    }
}
