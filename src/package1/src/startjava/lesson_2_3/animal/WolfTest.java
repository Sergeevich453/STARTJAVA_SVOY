package package1.src.startjava.lesson_2_3.animal;

public class WolfTest {
    
    public static void main(String[] agrs) {
        Wolf grey = new Wolf("Мужской", "Серый", 50, 5, "Серый");
        grey.setGender("Женский");
        grey.setNickname("Желтый");
        grey.setWeight(50);
        grey.setAge(9);
        grey.setColor("Черный");
        System.out.println("Кличка волка: " + grey.getNickname() + "\nПол: " + grey.getGender() + "\nВес: " 
                 + grey.getWeight() + "\nВозраст: " + grey.getAge() + "\nОкрас: " + grey.getColor());
    }
}
