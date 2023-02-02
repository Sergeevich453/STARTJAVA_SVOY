import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String [] args){
        Scanner playerName = new Scanner(System.in);
        Scanner playerAge = new Scanner(System.in);
        String playerName1 = playerName.nextLine(); 
        int playerAge1 = playerAge.nextInt();
        String playerName2 = playerName.nextLine(); 
        int playerAge2 = playerAge.nextInt();
        // String playerName1 = "Андрей"; 
        // int playerAge1 = 35;
        // String playerName2 = "Николай"; 
        // int playerAge2 = 30;
        Player player1 = new Player(playerName1, playerAge1);
        Player player2 = new Player(playerName2, playerAge2);
        System.out.println("player1: " + player1.name + " " + player1.age + "\nplayer2: " + player2.name + " " + player2.age);
        
    }
}