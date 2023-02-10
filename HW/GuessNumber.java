public class GuessNumber {


    public int computerMathNum() {
        int computerNum = (int) ((Math.random()*(101 - 1)) + 1);
        return computerNum;
    }


    public void gameProcess(String playerName1, String playerName2){
            while(true) {
            int condition = 0;
            //double compNum = computerNum.computerMathNum();
            while(true) {
                System.out.println(playerName1 + " введите число");
                int p1 = playerNumber.nextInt();
                if(p1 == compNum) {
                    System.out.println("Игрок: " + playerName1 + " выиграл!!!");
                    break;
                } else if(p1 > compNum) {
                    System.out.println("Число " + p1 + " больше загаданного");
                } else if(p1 < compNum) {
                    System.out.println("Число " + p1 + " Меньше загаданного");
                }
                System.out.println(player2.name + " введите число");
                int p2 = playerNumber.nextInt();
                if(p2 == compNum) {
                    System.out.println("Игрок: " + player2.name + " выиграл!!!");
                    break;
                } else if(p2 > compNum) {
                    System.out.println("Число " + p2 + " больше загаданного");
                } else if(p2 < compNum){
                    System.out.println("Число " + p2 + " Меньше загаданного");
                }
            }
            System.out.println("Хотите продолжить игру: \nответьте yes если хотите продолжить" 
                    + "\nответьте no если хотите закончить");
            while(true) {
                String playerAnswer = answer.nextLine();
                if(playerAnswer.equals("yes")) {
                    break;
                } else if(playerAnswer.equals("no")) {
                    condition = 1;
                    break;
                } else {
                    System.out.println("Вы ввели ответ некорректно, повторите");
                    continue;
                }
            }
            if(condition == 1) {
                break;
            } else {
                continue;
            }
        }
    }
}

    // public void gameProcess1(String playerName, int playerNum, int computerNum){
    //     if (playerNum > computerNum) {
    //             System.out.println("Число играка: " + playerName + " больше загаданного " + playerNum + " > " + computerNum);
    //         } else if (playerNum < computerNum) {
    //             System.out.println("Число играка: " + playerName + " меньше загаданного " + playerNum + " < " + computerNum);
    //         } else if (playerNum == computerNum) {
    //             System.out.println(playerName + "Выиграл!!!");
    //         }
    // }