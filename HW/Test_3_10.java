public class Test_3_10 {
    public static void main(String[] agrs){
        System.out.print("\tТАБЛИЦА ПИФАГОРА " + "\n   ");
        //for( int i = 2; i <= 9; i++) {
            //System.out.printf("%3d", i);
        //}


        /*int count = 0;
        System.out.println();
        for( int i = 1; i < 10; i++){
            if(count == 1) {
                System.out.printf("%2s", "");
                for( int k = 1; k < 26; k++) {
                    System.out.print("_");
                }
                System.out.println("");
            }
            for(int j = 1; j < 10; j++) {
                if((i * j) == 1) {
                    System.out.printf("%4s", "|");
                    continue;

                }
                System.out.printf("%3d", i * j);
            }
            count++;
            System.out.println();
        }*/
        //int i = 0;
        //int j = 0;

        for (int i = 1; i < 10; i++) {
            if(i == 2) {
                System.out.println(" ______________________________");
            }
            for (int j = 1; j < 10; j++)
                if(j == 1) {
                    System.out.printf("%4d %1s", i * j, (char) 124);
                } else {
                    System.out.printf("%3d", i * j);
                }
            System.out.println();
        }

        System.out.print("\tТАБЛИЦА ПИФАГОРА 111 " + "\n   ");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.printf("%3d %1s", i * j, (char) 124);
            }
            System.out.println();
        }

    }
}

/*System.out.print("\tТАБЛИЦА ПИФАГОРА " + "\n   ");
        for( int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for( int i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }*/

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