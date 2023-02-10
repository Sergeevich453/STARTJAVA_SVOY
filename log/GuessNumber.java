import java.util.Scanner;

public class GuessNumber {

    public Player player1;
    public Player player2;
    public GuessNumber guessNum;
    public int numberComp;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int guess() {
        Scanner guess = new Scanner(System.in);
        return guess.nextInt();
    }

    public void game(Player player1, Player player2) {
        numberComp = (int) ((Math.random() * (101 - 1)) + 1);
        while (true) {
            System.out.println("Игрок: " + player1.name + " введите ваше число:");
            int number = guessNum.guess();
            if (number == numberComp) {
                System.out.println("Игрок: " + player1.name + " Вы выиграли!!!");
                break; 
            } else if (number > numberComp) {
                System.out.println("Число: " + number + " больше чем загаданное!");
            } else {
                System.out.println("Число: " + number + " меньше чем загаданное!");
            }
            System.out.println("Игрок: " + player2.name + " введите ваше число:");
            number = guessNum.guess();
            if (number == numberComp) {
                System.out.println("Игрок: " + player2.name + " Вы выиграли!!!");
                break; 
            } else if (number > numberComp) {
                System.out.println("Число: " + number + " больше чем загаданное!");
            } else {
                System.out.println("Число: " + number + " меньше чем загаданное!");
            }
        }
    }
}
