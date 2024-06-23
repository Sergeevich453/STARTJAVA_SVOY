package hw;
public class MyFirstGame {
    public static void main(String [] args){
        int computerNum = 1;
        int playerNumHigh = 100;
        boolean neugadal = true;
        int count = 0;
        while (neugadal) {
            if (playerNumHigh > computerNum) {
                System.out.println("Загаданное число меньше= " + playerNumHigh + " > " + computerNum);
                playerNumHigh = playerNumHigh / 2;
            } else if (playerNumHigh < computerNum) {
                System.out.println("Загаданное число больше= " + playerNumHigh + " < " + computerNum); 
                playerNumHigh = playerNumHigh + 1;
            } else if (playerNumHigh == computerNum) {
                neugadal = false;
            }
            count++;
        }
        System.out.println("Вы выиграли" + "\n число итераций: " + count + "\n Загаданное число: " 
                + computerNum + "\n Число пользователя: " + playerNumHigh);
    }
}

/*while (neugadal) {
            playerNum = 2 - count;
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
        System.out.println("count = " + count);*/



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