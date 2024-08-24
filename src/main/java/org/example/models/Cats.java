package org.example.models;

import org.example.Commands;

import static java.lang.Thread.sleep;

public class Cats extends Home_Animal {
    public Cats(String nickname, int age) {
        super(nickname, age);
    }


    @Commands
    public String doJumpingToToy(){
        return this.getNickname() + " is jumping to the toy";
    }
    @Commands
    public String doMiau(){
        return "Miau miau miau";
    }


    @Override
    public void training() throws InterruptedException {
        System.out.println("Training has been starting");
        Thread training = new Thread();
        training.start();
        StringBuilder trainingProccess = new StringBuilder("[]"+"[]"+"[]"+"[]"+"[]");
        System.out.println(trainingProccess);
        for (int i = 0; i<6; i++){
            sleep(500);
            trainingProccess.replace(i,i,"[X]");
            System.out.println(trainingProccess);
        }
        training.interrupt();
        System.out.println("Training has finished");
    }
}
