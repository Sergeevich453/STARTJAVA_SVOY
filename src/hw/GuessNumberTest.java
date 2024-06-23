package hw;

import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String [] args){
        Scanner playerName = new Scanner(System.in);
        Scanner playerNumber = new Scanner(System.in);
        Scanner answer = new Scanner(System.in);
        int playerNumber1 = 0;
        int playerNumber2 = 0;
        System.out.println("Введите имя первого игрока.");
        String playerName1 = playerName.nextLine();
        
        System.out.println("Введите имя второго игрока.");
        String playerName2 = playerName.nextLine();
        
        Player player1 = new Player(playerName1, playerNumber1);
        Player player2 = new Player(playerName2, playerNumber2);
        GuessNumber computerNum = new GuessNumber();
        //System.out.println("player1: " + player1.name + " " + player1.number + "\nplayer2: " + player2.name 
        //        + " " + player2.number);
        //boolean victory = true;
        while(true) {
            int condition = 0;
            double compNum = computerNum.computerMathNum();
            while(true) {
                System.out.println(player1.name + " введите число");
                int p1 = playerNumber.nextInt();
                if(p1 == compNum) {
                    System.out.println("Игрок: " + player1.name + " выиграл!!!");
                    break;
                } else if(p1 > compNum) {
                    System.out.println("Число " + p1 + " больше загаданного");
                } else if(p1 < compNum) {
                    System.out.println("Число " + p1 + " Меньше загаданного");
                }
                System.out.println(player2.name + " введите число");
                int p2 = playerNumber.nextInt();
                if(p2 == compNum) {
                    System.out.println("Игрок: " + player2.name + " выиграл!!!");
                    break;
                } else if(p2 > compNum) {
                    System.out.println("Число " + p2 + " больше загаданного");
                } else if(p2 < compNum){
                    System.out.println("Число " + p2 + " Меньше загаданного");
                }
                //break; ///---
            }
            System.out.println("Хотите продолжить игру: \nответьте yes если хотите продолжить" 
                    + "\nответьте no если хотите закончить");
            while(true) {
                String playerAnswer = answer.nextLine();
                if(playerAnswer.equals("yes")) {
                    break;
                } else if(playerAnswer.equals("no")) {
                    condition = 1;
                    break;
                } else {
                    System.out.println("Вы ввели ответ некорректно, повторите");
                    continue;
                }
            }
            if(condition == 1) {
                break;
            } else {
                continue;
            }
        }
    }
}