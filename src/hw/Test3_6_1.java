package hw;
public class Test3_6_1 {
    public static void main(String [] args){
      /*int R = 3; // get this parameter from user or whatever
      int r = -R+1;
      while (r <= R-1) {
          int i = 1;
          int rabs = r;
          if (rabs < 0) 
          rabs = -rabs; // take only the positive value
          while (i <= R-rabs) {
              System.out.print('*');
              ++i; // next star
          }
      System.out.println(); // go to the next row (or line)  
      ++r;
      }


      int R = 3;
      int r = -R + 1;
      do {
          int i = 1;
          int rads = r;
          if (rads < 0) {
            rads -= rads;
          }
          do {
            System.out.println("*");
            ++i;
          } while (i <= R - rads);
          System.out.println(" ");
          ++r;
      } while (r <= R - 1);*/

      int i = 5;
      int j = 0;
        do {
            if(i < 3) {
               j = i; //  2, 1
            } else {
                j = 6-i; // 1, 2, 3\
            }    
            do {
                System.out.print("*");
                j--;        //* \ * * \ * * * \ * * \ *
            } while(j > 0); // 0\ 1, 0\ 2, 1 , 0\ 1, 0\ 0
            System.out.println();
            i--; // 4, 3, 2, 1
        } while(i > 0);
  }
}

System.out.println("");