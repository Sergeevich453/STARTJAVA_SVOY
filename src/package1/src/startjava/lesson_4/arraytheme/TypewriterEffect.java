package package1.src.startjava.lesson_4.arraytheme;

public class TypewriterEffect {
	// 1
    public static void main(String[] args) {
        String text = "Java — это C++, из которого убрали все пистолеты, ножи и дубинки.\n— James Gosling";
        printWithTypewriterEffect(text);

        // Проверка на другом тексте
        String anotherText = "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n— Robert Martin";
        printWithTypewriterEffect(anotherText);
    }
    
    private static String findShortestWord(String[] words) {
        String shortestWord = words[0];
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }

    private static String findLongestWord(String[] words) {
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    private static void printWithTypewriterEffect(String text) {
        String[] words = text.split("\\s+");

        String shortestWord = findShortestWord(words);
        String longestWord = findLongestWord(words);

        for (char letter : text.toCharArray()) {
            System.out.print(Character.toUpperCase(letter));
            try {
                Thread.sleep(50); // Задержка 50 миллисекунд для эффекта пишущей машинки
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nСамое короткое слово: " + shortestWord.toUpperCase());
        System.out.println("Самое длинное слово: " + longestWord.toUpperCase());
    }

    
}