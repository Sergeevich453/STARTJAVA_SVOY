package package1.src.startjava.lesson_4.arrayTheme;

public class TextFormatting {
    public static void main(String[] args) {
        String text = "Java -- это C++, из которого убрали все пистолеты, ножи и дубинки.\n-- James Gosling";

        // Находим позиции слов "из" и "дубинки"
        int indexFrom = text.indexOf("из");
        int indexClub = text.indexOf("дубинки");

        // Если оба слова найдены
        if (indexFrom != -1 && indexClub != -1) {
            // Форматируем слова между "из" и "дубинки", а также сами эти слова в верхний регистр
            String formattedText = text.substring(0, indexFrom) + "ИЗ " +
                    text.substring(indexFrom + 2, indexClub).toUpperCase() + " " +
                    text.substring(indexClub);

            // Выводим отформатированный текст
            System.out.println(formattedText);
        } else {
            // Если одно из слов не найдено, просто выводим исходный текст
            System.out.println(text);
        }
    }
}
