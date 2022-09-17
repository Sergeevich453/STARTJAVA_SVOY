public class Test_3_6_2 {
    public static void main(String [] args){
        int repeats = 3;
        int countLines = -repeats + 1;
        int countSymbols = 0;
        do {
            countSymbols = 1;
            int countRepeats = countLines;
            if (countRepeats < 0) {
                countRepeats = -countRepeats;
            }
            do {
                System.out.print("*");
                ++countSymbols;
            } while (countSymbols <= repeats - countRepeats);
                ++countLines;
                System.out.println();
        } while (countLines <= repeats - 1);

        /*int i, j;
        int x = 6;
    for (int y = 0; y < x; y++) { // number of row of '*'

        for (i = y; i < x - 1; i++)
            // number of space each row
            System.out.print(' ');

        for (j = 0; j < y * 2 + 1; j++)
            // number of '*' each row
            System.out.print('*');

        System.out.println();
    }*/
    }
}