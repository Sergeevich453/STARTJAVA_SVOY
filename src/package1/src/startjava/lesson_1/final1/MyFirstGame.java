package package1.src.startjava.lesson_1.final1;

public class MyFirstGame {
    public static void main(String [] args){
        int computerNum = 99;
        int playerNum = 100;
        int count = 0;
        while (playerNum != computerNum) {
            if (playerNum > computerNum) {
                System.out.println("Загаданное число меньше = " + playerNum + " > " + computerNum);
                playerNum = playerNum / 2;
            } else if (playerNum < computerNum) {
                System.out.println("Загаданное число больше = " + playerNum + " < " + computerNum); 
                playerNum++;
            }
            count++;
        }
        System.out.println("Вы выиграли" + "\n Количество попыток: " + count + "\n Загаданное число: " 
                + computerNum + "\n Число пользователя: " + playerNum);
    }
}
