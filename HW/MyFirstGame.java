public class MyFirstGame {
    public static void main(String [] args){
        int computerNum = 99;
        int playerNum = 60;
        boolean neugadal = true;
        int count = 0;

        while (neugadal) {
            playerNum = 50 - count;
            if (playerNum < 1) {
                count = 100;
            } else if (playerNum > 100) {
                count = 1;
            }

            if (playerNum > computerNum) {
                System.out.println("Вы не угадали, загаданное число меньше! Попытайтесь еще раз!" + playerNum);
                count--;
            }

            if (playerNum < computerNum) {
                System.out.println("Вы не угадали, загаданное число больше! Попытайтесь еще раз!" + playerNum);
                count++;
            }

            if (playerNum == computerNum) {
                System.out.println("Вы угадали, поздравляю!");
                neugadal = false;
            }
            
        }
        System.out.println("count = " + count);

    }
}

        /*while (neugadal) {
            if (playerNum < computerNum) {
                count++;
                playerNum = playerNum + count;
                System.out.println("Вы не угадали, загаданное число меньше! Попытайтесь еще раз!");
            }
            if (playerNum > computerNum) {
                count--;
                playerNum = playerNum - count;
                System.out.println("Вы не угадали, загаданное число больше! Попытайтесь еще раз!");
            }
            if (playerNum < 1) {
                count = 100;
            } else if (playerNum > 100) {
                count = 1;
            }
            if (playerNum == computerNum) {
                System.out.println("Вы угадали, поздравляю!");
                neugadal = false;
            }
        }*/