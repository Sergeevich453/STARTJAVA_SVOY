import java.util.Scanner;

public class GuessNumber {
    public Player player1;
    public Player player2;
    public int numberComp;
    Scanner guess = new Scanner(System.in);

<<<<<<< HEAD
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
=======
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
}

    public void game(Player player1, Player player2){
        numberComp = (int) ((Math.random()*(101 - 1)) + 1);
        while(true) {
            System.out.println(player1.name + " Ведите свое число:");
            int number = guess.nextInt();
            if (number > numberComp) {
                    System.out.println("Число: " + number + " играка: " + player1.name + " больше загаданного компьютером");
                } else if (number < numberComp) {
                    System.out.println("Число: " + number + " играка: " + player1.name + " меньше загаданного компьютером");
                } else if (number == numberComp) {
                    System.out.println(player1.name + "Выиграл!!!");
                    break;
                }
                System.out.println(player2.name + " Ведите свое число:");
                number = guess.nextInt();
            if (number > numberComp) {
                    System.out.println("Число: " + number + " играка: " + player2.name + " больше загаданного компьютером");
                } else if (number < numberComp) {
                    System.out.println("Число: " + number + " играка: " + player2.name + " меньше загаданного компьютером");
                } else if (number == numberComp) {
                    System.out.println(player2.name + "Выиграл!!!");
                    break;
            }
        }
    }
}
>>>>>>> d62c392b4ca2c3261927b20741cac37a0258de2e
