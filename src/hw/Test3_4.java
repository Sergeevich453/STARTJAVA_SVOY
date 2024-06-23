package hw;
public class Test3_4{
    public static void main(String [] args){
        
        System.out.println("\n\t" + "ЗАДАНИЕ 4 \nВывод чисел на консоль в несколько строк\n");
        int count = 0;
        for(int i = 1; i <= 24; i += 2){
            System.out.printf("%3d", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
        }
    }
}