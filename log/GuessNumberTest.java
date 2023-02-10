import java.util.Scanner;

public class GuessNumberTest {
<<<<<<< HEAD
    
    public static void main(String [] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: "); 
        String name1 = scaner.nextLine(); 
        System.out.println("Введите имя второго игрока: "); 
        String name2 = scaner.nextLine(); 
=======

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String name1 = scaner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String name2 = scaner.nextLine();
>>>>>>> d62c392b4ca2c3261927b20741cac37a0258de2e
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        GuessNumber guessNum = new GuessNumber(player1, player2);
        String answer;
        do {
            guessNum.game(player1, player2);
            do {
                System.out.println("Хотите продолжить игру [yes / no]");
                answer = scaner.nextLine();
<<<<<<< HEAD
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
=======
            }while(!answer.equals("yes") && !answer.equals("no"));
        }while(answer.equals("yes"));
>>>>>>> d62c392b4ca2c3261927b20741cac37a0258de2e
    }
}
