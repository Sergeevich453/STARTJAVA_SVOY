public class GuessNumber {

    public void gameProcess(){
        int computerNum = (int) ( Math.random() *(101 - 1) ) + 1;
        if (player1 > computerNum) {
                System.out.println("Загаданное число меньше= " + player1 + " > " + computerNum);                
            } else if (player1 < computerNum) {
                System.out.println("Загаданное число больше= " + player1 + " < " + computerNum); 
            } else if (player1 == computerNum) {
                neugadal = false;
            }

    }
    
}

/*

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


*/