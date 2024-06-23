package hw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class PDFReaderAA {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\user\\Desktop\\test.pdf");
            PDFParser parser = new PDFParser(new FileInputStream(file));
            parser.parse();
            COSDocument cosDoc = parser.getDocument();
            PDFTextStripper pdfStripper = new PDFTextStripper();
            PDDocument pdDoc = new PDDocument(cosDoc);
            String parsedText = pdfStripper.getText(pdDoc);
            System.out.println(parsedText);
            String[] words = parsedText.split(" ");
            Map&lt;String, Integer&gt; wordCount = new HashMap&lt;String, Integer&gt;();
            for (String word : words) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
            Set&lt;Entry&lt;String, Integer&gt;&gt; entrySet = wordCount.entrySet();
            for (Entry&lt;String, Integer&gt; entry : entrySet) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            pdDoc.close();
            cosDoc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
</code>







/*Код вышеуказанной программы разделен на две части. Первая часть — это основной метод, а вторая — класс PDFReader.
Основной метод — это точка входа в программу.
Основной метод создает файловый объект и передает путь к файлу PDF для чтения.
Основной метод создает объект PDFParser и передает объект файла его конструктору.
Основной метод вызывает метод разбора класса PDFParser.
Метод parse создает объект COSDocument.
Метод parse создает объект PDFTextStripper.
Метод parse создает объект PDDocument и передает объект COSDocument своему конструктору.
Метод parse вызывает метод getText класса PDFTextStripper и передает ему объект PDDocument.
Метод getText возвращает текст файла PDF.
Основной метод разбивает текст файла PDF на слова и сохраняет их в массиве строк.
Основной метод создает объект HashMap и сохраняет в нем слова и их количество.
Основной метод печатает слова и их количество.
Основной метод закрывает объект PDDocument.
Основной метод закрывает объект COSDocument.*/