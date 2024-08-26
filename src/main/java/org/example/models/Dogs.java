package org.example.models;

import static java.lang.Thread.sleep;

public class Dogs extends Home_Animal {

    public Dogs(String nickname, int age) {
        super(nickname, age);
    }

//region Методы
    @Commands
    public String doSeatDown(){
        return this.getNickname() + "is seatting";
    }

    @Commands
    public String doGaw(){
        return "Gaw gaw gaw";
    }

//endregion
}
