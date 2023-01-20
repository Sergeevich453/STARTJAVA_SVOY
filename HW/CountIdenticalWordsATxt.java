import java.io.*; 
import java.util.*; 
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.text.PDFTextStripper; 

public class CountIdenticalWordsATxt { 
  
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
/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03_CountIdenticalWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/resources/input.txt"));
        Set<String> words = new TreeSet<>();

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        System.out.println(words);
    }
}
*/