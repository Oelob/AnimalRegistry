package org.example;

import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);



    public static void Menu(){
        while (true){
            System.out.println("Добро пожаловать в питомник домашних животных!");
            System.out.println("==============================================");
            System.out.println();
            System.out.println("Выберите действие:\n" +
                    "1. Добавить новое животное в питомник\n" +
                    "2. Удалить животное из пистомника\n" +
                    "3. Выбрать животное\n" +
                    "0. Завершить работу\n"
            );
            if (sc.hasNext()){
                if (sc.nextInt() == 1){

                }
            }

        }
    }

}
