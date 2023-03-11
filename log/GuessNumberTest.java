import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String answer;
        System.out.println("Введите имя первого игрока: ");
        String name1 = scaner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String name2 = scaner.nextLine();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру [yes / no]");
                answer = scaner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}

