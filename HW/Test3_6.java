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
        
        /*int i = 10;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("#");
                j++;
            }
            System.out.println("");
            i--;
        }*/
        i = 1;
        j = 3;
        do {

            do{
                System.out.print("$");
                j--;
            } while (j >= i);
            System.out.println();
            i++;
        } while (i <= 1 );
    }
}