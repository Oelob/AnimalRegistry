package org.example.models;

public class Hamsters extends Home_Animal {
    public Hamsters(String nickname, int age) {
        super(nickname, age);
    }

//region Методы
    @Commands
    public String doEat(){
        return this.getNickname() + " is eating";
    }
    @Commands
    public String doRunningAtWheel(){
        return this.getNickname() + " is running at wheel";
    }
//endregion
}
