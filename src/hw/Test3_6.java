package hw;
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
       /* 

       i = 0;
        do {
            int j = 0;
            do {
                System.out.print("$");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 2);
        

        i = 0;
        boolean n = (i <= 2);
        do {
            int j = 0;
            do {
                System.out.print("$");
                j++;
            } while (j <= i);
            System.out.println();
            if ( i >= 3) {
            i--;
            n = (i >= 1);
            } else {
            i++;
            n = (i <= 2);
            }
        } while (n);


        i = 2;
        do {
            int j = 1;
            do {
                System.out.print("$");
                j++;
            } while (j <= i);
            System.out.println();
            i--;
        } while (i >= 1);*/



        /*int i = 4;
        int j = 1;
        do {
            
            System.out.print("$");
            i--;
            if (i >= j) {
                System.out.println();
            }
            //if (i == 2) {
              //  System.out.println();
            //}
            j++;
        }while (i >= 0 );*/

        /*for (int a = 1; a <= 4; a++) {// for loop for row
            for (int b = 1; b <= a; b++) { //for loop for column
                System.out.print("*");
            }
            System.out.println();
        }*/

        //int i, j;
       /* int n = 4;
    for (int i = 0; i < n; ++i) {
        //for (int j = 0; j < i + 1; ++j) {
            System.out.print("c");
        }
        System.out.println();
    }

    // print the lower triangle
    for (int i = n - 1; i > 0; --i) {
        for (int j = 0; j < i; ++j) {
            System.out.print("c");
        }
        System.out.println();
    }

    int i = 0;
        do {
            int j = 0;
            if ( j >= 3) {
                i = j - 1;
                i--;
            } else {
                i++;
            }
            do {
                System.out.print("$");
                j++;
            } while (j <= i);
            System.out.println();
            
        } while (i <= 4);*/
        
        
        
        /*i = 2;
        do {
            int j = 1;
            do {
                System.out.print("$");
                j++;
            } while (j <= i);
          //System.out.println();
            i--;
        } while (i >= 1);
        


        i = 0;
        boolean n = (i <= 2);
        do {
            int j = 0;
            do {
                System.out.print("$");
                j++;
            } while (j <= i);
            System.out.println();
            if ( i >= 3) {
            i--;
            n = (i >= 1);
            } else {
            i++;
            n = (i <= 2);
            }
        } while (n);

        int i = 0;
        int count = 0;
        int j = 0;
        boolean n = (i <= 2);
        do {
            //System.out.println("i: " + i + " j: " + j + " count: " + count);
            if (count <= 2) {
                j = 0;
            } else {
                j = 1;
            }
            do {
                System.out.print("$");
                ++j;
            } while (j <= i);
            System.out.println();
            if (count <= 2) {
                ++i;
            } else {
                --i;
                n = (i >= 1);
            }
        } while (n);*/


        /*int repeats = 3;
        int line = -repeats + 1;
        do {

            
            int Symbol = 1;
            int countRepeats = line;
            if (countRepeats < 0) {
                countRepeats = -countRepeats;
            }


            do {
                System.out.print("*");
                ++Symbol;
            } while (Symbol <= repeats - countRepeats);


                ++line;
                System.out.println();


        } while (line <= repeats - 1);



        System.out.println();
        int repeats = 3;
        int countLines = -repeats + 1;


        do {
            int countSymbols = 1;
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




        i = 1;
        j = 1;
        do {
            do {
                System.out.print("$");
                if(i <= 3) {
                    j++;
                    
                } else {
                    j--;
                }
            } while(j <= 3);
            i++;
            System.out.println();
        } while(i < 6);*/


        int i = 5;
        int j = 0;
        do {
            if (i < 3) {
                j = i;
            } else {
                j = 6 - i; //1, 2,
            }
            do {
                System.out.print("*");
                j--;       // *\* *
            } while(j > 0);// 0,/ 1, 0
            System.out.println();
            i--; // 4
        } while(i > 0);


    }
}