package hw;
public class TestT {
    private double x = 1.2;
    public static void main(String [] args){
        TestT t = new TestT();
        System.out.println(t.x);
        switch(t.x) {
            case (1.2):
                System.out.println("!");
            case (2.5):
                System.out.println("&"); 
        }
    }
}