public class Test3_7 {
    public static void main(String [] args) {
        for (char i = 0; i <= 47; i++) {
            if (((int) i) % 2 != 0) {
                System.out.printf("%6s%6s", ((int) i), i);
                System.out.println();
            }
        }
        System.out.println();
        for (char i = 97; i <= 122; i++) {
            if (((int) i) % 2 == 0) {
                System.out.printf("%6s%6s", ((int) i), i);
                System.out.println();
            }
        }
    }
}