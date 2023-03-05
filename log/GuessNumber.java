    import java.util.Scanner;

public class GuessNumber {

    Scanner console = new Scanner(System.in);

    public void start(String name1, String name2) {
        int secretNumber = (int) (Math.random() * 100 ) + 1;
        while (true) {
            System.out.println(name1 + " Ведите свое число:");
            int number = console.nextInt();
            if (number > secretNumber) {
                System.out.println("Число: " + number + " игрока: " + name1
                        + " больше загаданного компьютером");
            } else if (number < secretNumber) {
                System.out.println("Число: " + number + " игрока: " + name1
                        + " меньше загаданного компьютером");
            } else if (number == secretNumber) {
                System.out.println(name1 + " Выиграл!!!");
                break;
            }

            System.out.println(name2 + " Ведите свое число:");
            number = console.nextInt();
            if (number > secretNumber) {
                System.out.println("Число: " + number + " игрока: " + name2
                        + " больше загаданного компьютером");
            } else if (number < secretNumber) {
                System.out.println("Число: " + number + " игрока: " + name2
                        + " меньше загаданного компьютером");
            } else if (number == secretNumber) {
                System.out.println(name2 + "Выиграл!!!");
                break;
            }
        }
    }
}
