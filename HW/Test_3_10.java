public class Test_3_10 {
    public static void main(String[] agrs){
        System.out.print("\tТАБЛИЦА ПИФАГОРА " + "\n   ");
        for( int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for( int i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

    }
}


        /*System.out.print("   ");
        for( int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for( int i = 2; i <= 18; i += 2) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for( int i = 3; i <= 27; i += 3) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for( int i = 4; i <= 36; i += 4) {
            System.out.printf("%3d", i);
            
        }*/