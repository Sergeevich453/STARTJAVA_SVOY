public class MyFirstGame {
    public static void main(String [] args){
        int computerNum = 50;
        int playerNum = 50;
        boolean neugadal = true;
        
        while (neugadal) {
            int count = 0;
            for( int i=count;i<100;++i ){
                for( int j=count;j<i;++j ){
                    if( i % j == 0 ){
                    break;
                    }
                }
                if( i == j ){
                    System.out.println("i = " + i);;
                }
            }
            if (computerNum < playerNum) {
                System.out.println("Вы не угадали, загаданное число меньше! Попытайтесь еще раз!");
                playerNum--;
            }
            if (computerNum > playerNum) {
                System.out.println("Вы не угадали, загаданное число больше! Попытайтесь еще раз!");
                playerNum++;
            }
            if (playerNum == computerNum) {
                System.out.println("Вы угадали, поздравляю!");
                neugadal = false;
            }
            count++;
        }
    }
}