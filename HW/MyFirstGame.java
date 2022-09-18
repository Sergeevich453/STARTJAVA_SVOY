public class MyFirstGame {
    public static void main(String [] args){
        int computerNum = 50;
        int playerNum = 50;
        boolean neugadal = true;
        
        while (neugadal) {
            int count = 0;
            if (count % 2 == 0) {
                for (int i = 1; i <= 100; i += 3) {

            }
                    playerNum = i
                }
            
             
            if (computerNum < playerNum) {
                System.out.println("Вы не угадали, загаданное число меньше! Попытайтесь еще раз!");
            }
            if (computerNum > playerNum) {
                System.out.println("Вы не угадали, загаданное число больше! Попытайтесь еще раз!");
            }
            if (playerNum == computerNum) {
                System.out.println("Вы угадали, поздравляю!");
                neugadal = false;
            }
            count++;
        }

    }
}