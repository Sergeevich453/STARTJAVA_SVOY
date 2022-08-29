public class Test3_6_1 {
    public static void main(String [] args){
      
  }
}

int R = (...) // get this parameter from user or whatever
int r = -R+1;
while (r <= R-1) {
  int i = 1;
  int rabs = r;
  if (rabs < 0) rabs = -rabs; // take only the positive value
  while (i <= R-rabs) {
    System.out.print('*');
    ++i; // next star
  }
  System.out.println(); // go to the next row (or line)  
  ++r;
}