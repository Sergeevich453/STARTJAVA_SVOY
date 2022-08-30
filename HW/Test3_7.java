public class Test3_7 {
    public static void main(String [] args) {
        System.out.printf("%7s%7s%n%n", "Dec", "Char");
        for (char i = 0; i <= 47; i++) {
            if ( i % 2 != 0) {
                System.out.printf("%6d%6c%n", ((int) i), i);
            }
        }
        System.out.println();
        System.out.printf("%7s%7s%n%n", "Dec", "Char");
        for (char i = 97; i <= 122; i++) {
            if ( i % 2 == 0) {
                System.out.printf("%6d%6c%n", ((int)i), i);
            }
        }
    }
}