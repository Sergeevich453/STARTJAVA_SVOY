package test.hw.gptrepetitor;

import java.io.*;
import java.util.*;
// Не работает

public class WordCount {
    public static void main(String[] args) {
        // Указываем путь к текстовому файлу
        String filePath = "C:\\Users\\ILYA\\Desktop\\СТО РЖД СУОТ.docx"; // Экранированные слэши
        
        // Открываем файл и обрабатываем его содержимое
        try {
            // Считываем все строки из файла
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            Map<String, Integer> wordCountMap = new HashMap<>();
            
            while ((line = reader.readLine()) != null) {
                // Разделяем строку на слова
                String[] words = line.split("\\s+");
                
                for (String word : words) {
                    // Убираем лишние символы (например, знаки препинания)
                    word = word.replaceAll("[^a-zA-Zа-яА-ЯёЁ]", "").toLowerCase();
                    
                    // Пропускаем слова, длина которых меньше 2 символов
                    if (word.length() >= 2) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
            reader.close();
            
            // Выводим результат
            System.out.println("Повторяющиеся слова и их количество:");
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

