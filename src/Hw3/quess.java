package Hw3;

import java.util.Random;
import java.util.Scanner;

public class quess {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        do{
            int quessNumber = (int)(Math.random() * 9);
            System.out.println("Угадай число от 0 до 9. \n Даётся 3 попытки");
            for (int i = 0; i < 3; i++) {
                int userUnswer = scanner.nextInt();
                if (userUnswer == quessNumber){
                    System.out.println("Вы угадали!");
                    break;
                }
                if (userUnswer > quessNumber){
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
            System.out.println("Повторить игру ещё раз? 1- да / 0 - нет ");
        }
        while (scanner.nextInt() == 1);
    }
}



