public class Test3_6{

    public static void main(String [] args){
        System.out.println("\n\t" + "ЗАДАНИЕ 6 \nОтображение фигур в консоли\n");
        /*int count = 0;
        int gridSign = 5;
        for (int i = 0; i <= 49; i++) {
            System.out.print("*");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }*/
        int num  = 10;
        int count = 1;
        int count1 = 1;
        while (count1 % num != 0 ) {
            System.out.print("#");
            count++;
           // if (count % num == 0) {
             //   System.out.println();
            //}
            if (count % num == 0){
                System.out.println();
            
            //System.out.println("num " + num);
            num--;
            }

        }
    }
}