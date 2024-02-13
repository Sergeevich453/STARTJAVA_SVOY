+import java.io.File;
+import java.io.FileNotFoundException;
+import java.io.IOException;
+import java.util.ArrayList;
+import java.util.HashMap;
+import java.util.List;
+import java.util.Map;
+import java.util.Scanner;
+
+import org.apache.pdfbox.pdmodel.PDDocument;
+import org.apache.pdfbox.text.PDFTextStripper;
+
+public class PDFReader {
+
+   public static void main(String[] args) throws IOException {
+       
+       // Read PDF file
+       File file = new File("C:\\Users\\User\\Desktop\\PDFReader\\PDFReader\\src\\PDFReader\\test.pdf");
+       PDDocument document = PDDocument.load(file);
+       PDFTextStripper pdfStripper = new PDFTextStripper();
+       String text = pdfStripper.getText(document);
+       document.close();
+       
+       // Create a list of words
+       List<String> words = new ArrayList<String>();
+       Scanner scanner = new Scanner(text);
+       while (scanner.hasNext()) {
+           words.add(scanner.next());
+       }
+       scanner.close();
+       
+       // Count the number of repetitions of each word
+       Map<String, Integer> wordCount = new HashMap<String, Integer>();
+       for (String word : words) {
+           if (wordCount.containsKey(word)) {
+               wordCount.put(word, wordCount.get(word) + 1);
+           } else {
+               wordCount.put(word, 1);
+           }
+       }
+       
+       // Write the result to a Txt file
+       FileWriter fileWriter = 
                new FileWriter("C:\\Users\\User\\Desktop\\PDFReader\\PDFReader\\src\\PDFReader\\result.txt");
+       for (String word : wordCount.keySet()) {
+           fileWriter.write(word + " - " + wordCount.get(word) + "\n");
+       }
+       fileWriter.close();
+   }
+}


 /* Describe how each line of the above program code works. *\


+ File file = new File("C:\\Users\\User\\Desktop\\PDFReader\\PDFReader\\src\\PDFReader\\test.pdf");
+ PDDocument document = PDDocument.load(file);
+ PDFTextStripper pdfStripper = new PDFTextStripper();
+ String text = pdfStripper.getText(document);
+ document.close();
+ 
+ The above lines of code read the PDF file and save the text in the "text" variable.
+ 
+ 
+ Scanner scanner = new Scanner(text);
+ while (scanner.hasNext()) {
+   words.add(scanner.next());
+ }
+ scanner.close();
+ 
+ The above lines of code create a list of words from the text. 
Приведенные выше строки кода создают список слов из текста.
+ 
+ 
+ for (String word : words) {
+   if (wordCount.containsKey(word)) {
+       wordCount.put(word, wordCount.get(word) + 1);
+   } else {
+       wordCount.put(word, 1);
+   }
+ }
+ 
+ The above lines of code count the number of repetitions of each word.
Приведенные выше строки кода подсчитывают количество повторений каждого слова.
+ 
+ 
+ FileWriter fileWriter = new FileWriter("C:\\Users\\User\\Desktop\\PDFReader\\PDFReader\\src\\PDFReader\\result.txt");
+ for (String word : wordCount.keySet()) {
+   fileWriter.write(word + " - " + wordCount.get(word) + "\n");
+ }
+ fileWriter.close();
+ 
+ The above lines of code write the result to a Txt file.
Приведенные выше строки кода записывают результат в файл Txt.
+ 
+ */
