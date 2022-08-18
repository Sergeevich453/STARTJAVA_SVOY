public class IsuchJava{
    public static void main(String [] args){
        int x = 0;
        int y = 0;
        while(x < 5){
            if(y < 5){
                x +=1;
                if(y < 3){
                    x -=1;
                }
            } 
            System.out.println(x + "" + y + " ");
            x += 1;
        }
    }
}