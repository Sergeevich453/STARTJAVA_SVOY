package src.startjava.lesson_2_3.person;

public class Person {
    
    String gender = "мужской";
    String name = "Илья";
    int height = 182;
    int weight = 83;
    int age = 39;

    void walk() {
        System.out.println("Топ - топ!");
    }

    void sit() {
        System.out.println("Я сел!");
    }

    void run() {
        System.out.println("Я бегу!");
    }

    String speak() {
        return "Я говорю";
    }

    boolean studyJava() {
        return true;
    }
}
