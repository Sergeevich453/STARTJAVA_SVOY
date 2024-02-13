package package1.src.startjava.lesson_1.base;

import java.util.Scanner;

public class MyFirstAppTest{
    public static void main(String [] args){
        System.out.println("Hello World");
        Scanner console = new Scanner(System.in, "cp866");
        System.out.println("Введите свое имя: ");
        System.out.println();
        System.out.println(console.nextLine());

    }       
}
