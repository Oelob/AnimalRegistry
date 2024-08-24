package org.example.models;

import org.example.Commands;

import static java.lang.Thread.sleep;

public class Dogs extends Home_Animal {

    public Dogs(String nickname, int age) {
        super(nickname, age);
    }


    @Commands
    public String doSeatDown(){
        return this.getNickname() + "is seatting";
    }

    @Commands
    public String doGaw(){
        return "Gaw gaw gaw";
    }

    @Override
    public void training() throws InterruptedException {
        System.out.println("Training has been starting");
        Thread training = new Thread();
        training.start();
        StringBuilder trainingProccess = new StringBuilder("[]"+"[]"+"[]"+"[]"+"[]");
        System.out.println(trainingProccess);
        for (int i = 0; i<6; i++){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            trainingProccess.deleteCharAt(i);
            trainingProccess.insert(i,"[X]");
            System.out.println(trainingProccess);
        }
        training.interrupt();
        System.out.println("Training has finished");
    }
}
