import java.util.Scanner;

public class Player {
    
    Scanner name = new Scanner(System.in);
    Scanner age = new Scanner(System.in);
    public String playerName = name.nextLine();
    public int playerAge = age.nextInt();

    // public Player(String name1, int age1) {
    //     name1 = name.nextLine();
    //     age1 = age.nextInt();
    // }
}