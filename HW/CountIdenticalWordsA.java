import java.io.*; 
import java.util.*; 
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.text.PDFTextStripper; 

public class CountIdenticalWordsA { 
  
    public static void main(String[] args) { 
        try { 
            File file = new File("file.pdf"); 
            PDDocument doc = PDDocument.load(file); 
  
            PDFTextStripper pdfStripper = new PDFTextStripper(); 
            String text = pdfStripper.getText(doc); 
            System.out.println(text); 
  
            String[] words = text.split(" "); 
            Map<String, Integer> wordCount = new HashMap<>(); 
            for (String word : words) { 
                if (wordCount.containsKey(word)) { 
                    wordCount.put(word, wordCount.get(word) + 1); 
                } else { 
                    wordCount.put(word, 1); 
                } 
            } 
  
            FileWriter fileWriter = new FileWriter("wordCount.txt"); 
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) { 
                fileWriter.write(entry.getKey() + " : " + entry.getValue() + "\n"); 
            } 
            fileWriter.close(); 
            doc.close(); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
}
/*Этот код использует библиотеку Apache PDFBox для открытия PDF-файла, извлечения его текста и подсчета 
количества одинаковых слов в этом тексте. Он начинается с открытия PDF-файла, затем с помощью PDFTextStripper
 извлекается текст из файла. Затем текст разбивается на отдельные слова, которые сохраняются в массиве.

Затем код проходит через массив и использует хэш-карту для хранения каждого слова и количества раз, когда оно 
встречается в тексте. Наконец, код записывает слова и их частоту в текстовый файл, который затем можно 
использовать для анализа данных.

Строка 1: Импортирует java.io пакет, который необходим для операций ввода/вывода файлов.

Строка 2: Импортирует пакет java.util, который содержит служебные классы, такие как HashMap.

Строка 3: Импортирует пакет org.apache.pdfbox.pdmodel, который используется для работы с PDF-документами.

Строка 4: Импортирует org.apache.pdfbox.text.Класс PDFTextStripper, который используется для извлечения 
текста из PDF-документов.

Строка 6: Начинается класс CountIdenticalWords.

Строка 8: Создает файловый объект для PDF-документа.

Строка 9: Загружает PDF-документ в объект PDDocument.

Строка 11: Создает объект PDFTextStripper, который используется для извлечения текста из PDF-документа.

Строка 12: Извлекает текст из PDF-документа и сохраняет его в строковой переменной.

Строка 14: Разбивает текст на отдельные слова и сохраняет их в массиве.

Строка 16: Создает хэш-карту для хранения каждого слова и количества раз, когда оно встречается в тексте.

Строка 18-20: Перебирает массив слов и добавляет каждое слово в хэш-карту или увеличивает его значение, если 
оно уже существует на карте.

Строка 22-24: перебирает хэш-карту и записывает каждое слово и его частоту в текстовый файл.

Строка 26: Закрывает PDF-документ.

Строка 28-31: Улавливает любые исключения, которые могут быть выданы.

Строка 33: Завершает класс CountIdenticalWords.
Строки 34 и 35 отвечают за закрытие PDF-документа. Это важно для того, чтобы убедиться, что документ 
правильно закрыт и все внесенные в него изменения сохранены.


*/