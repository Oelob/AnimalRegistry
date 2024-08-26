package org.example.models;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Thread.sleep;

@Getter
@Setter
public abstract class Home_Animal {

    public void training() throws InterruptedException {
        System.out.println("Training has been starting");
        Thread training = new Thread();
        training.start();
        String[] trainingProccess = new String[]{"[]","[]","[]","[]","[]"};
        String temp = String.join("",trainingProccess);
        System.out.println(temp);
        for (int i = 0; i<trainingProccess.length; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            trainingProccess[i] = "[X]";
            String res = String.join("",trainingProccess);
            System.out.println(res);
        }
        sleep(1000);
        training.interrupt();
        System.out.println("Training has finished");
    }

    //region Поля
    private String nickname;
    private int age;
    //endregion

    //region Конструктор
    public Home_Animal(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
    //endregion
}
