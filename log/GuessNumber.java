import java.util.Scanner;

public class GuessNumber {

    Scanner console = new Scanner(System.in);

    public void start(Player player1, Player player2) {
        int secretNumber = (int) (Math.random()* 100 ) + 1;
        while (true) {
            System.out.println(player1.getName() + " Ведите свое число:");
            int number = console.nextInt();
            if (number > secretNumber) {
                System.out.println("Число: " + number + " игрока: " + player1.getName() 
                        + " больше загаданного компьютером");
                } else if (number < secretNumber) {
                    System.out.println("Число: " + number + " игрока: " + player1.getName() 
                            + " меньше загаданного компьютером");
                } else if (number == secretNumber) {
                    System.out.println(player1.getName() + " Выиграл!!!");
                    break;
                }
            System.out.println(player2.getName() + " Ведите свое число:");
            number = console.nextInt();
            if (number > secretNumber) {
                    System.out.println("Число: " + number + " игрока: " + player2.getName() 
                            + " больше загаданного компьютером");
                } else if (number < secretNumber) {
                    System.out.println("Число: " + number + " игрока: " + player2.getName() 
                            + " меньше загаданного компьютером");
                } else if (number == secretNumber) {
                    System.out.println(player2.getName() + "Выиграл!!!");
                    break;
            }
        }
    }
}
