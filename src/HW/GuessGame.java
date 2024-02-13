package HW;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame () {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        boolean p1istRight = false;
        boolean p2istRight = false;
        boolean p3istRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9 .....");

        while (true) {
            System.out.println("Число которое нужно угадать, - " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);
            guessp2 = p2.number;
            System.out.println("Первый игрок думает, что это " + guessp2);
            guessp3 = p3.number;
            System.out.println("Первый игрок думает, что это " + guessp3);
            if (guessp1 == targetNumber) {
                p1istRight = true;
            }
            if (guessp2 == targetNumber) {
                p2istRight = true;
            }
            if (guessp3 == targetNumber) {
                p3istRight = true;
            }
            if (p1istRight || p2istRight || p3istRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1istRight);
                System.out.println("Первый игрок угадал? " + p2istRight);
                System.out.println("Первый игрок угадал? " + p3istRight);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз.");
            }
        }
    }
}

public class Player {

    int number = 0;

    public void guess() {
        number = (int) (Math.random() *10);
        System.out.println("Думаю это число " + number);
    }
}

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame;
    }
}