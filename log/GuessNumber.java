    import java.util.Scanner;

public class GuessNumber {

    Scanner console = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int secretNumber = (int) (Math.random() * 100 ) + 1;
        while (true) {
            System.out.println(player1.getName() + " Ведите свое число:");
            int number = console.nextInt();
            if (number == secretNumber) {
                System.out.println(player1.getName() + "- Выиграл!!!");
                break;
            } else if (number < secretNumber) {
                System.out.println("Число: " + number + " игрока: " + player1.getName()
                        + " меньше загаданного компьютером");
            } else {
                System.out.println("Число: " + number + " игрока: " + player1.getName()
                        + " больше загаданного компьютером");
            }

            System.out.println(player2.getName() + " Ведите свое число:");
            number = console.nextInt();
            if (number == secretNumber) {
                System.out.println(player2.getName() + "- Выиграл!!!");
                break;
            } else if (number < secretNumber) {
                System.out.println("Число: " + number + " игрока: " + player2.getName()
                        + " меньше загаданного компьютером");
            } else {
                System.out.println("Число: " + number + " игрока: " + player2.getName()
                        + " больше загаданного компьютером");
            }
        }
    }
}
