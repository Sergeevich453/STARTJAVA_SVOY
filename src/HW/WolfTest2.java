public class WolfTest2 {
    
    public static void main(String[] agrs) {
        Wolf2 grey = new Wolf2("Men", "Grey", 50, 5, "Grey");
        grey.setGender("Женский");
        grey.setNickname("Желтый");
        grey.setWeight(50);
        grey.setAge(9);
        grey.setColor("Черный");
        System.out.println("Кличка волка: " + grey.getNickname() + "\nПол: " + grey.getGender() + "\nВес: " 
                 + grey.getWeight() + "\nВозраст: " + grey.getAge() + "\nОкрас: " + grey.getColor());



        // System.out.println("Кличка волка: " + grey.nickname + "\nПол: " + grey.gender + "\nВес: " 
        //         + grey.weight + "\nВозраст: " + grey.age + "\nЦвет: " + grey.color + "\n" + grey.walk()
        //         + "\n" + grey.sit() + "\n" + grey.run() + "\n" + grey.howl() + "\nВолк охотится: " 
        //         + grey.hunting());
        // String greyGender = grey.setGender(Мужской);
        // String greyNickname = grey.setNickName(Серый);
        // int greyWeight = grey.setWeight(50);
        // int greyAge = grey.setAge(5);
        // String greyColor = greyColor("Серый");
    }
}