import java.io.*; 
import java.util.*; 
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.text.PDFTextStripper; 

public class CountIdenticalWords { 
  
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
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) { 
                System.out.println(entry.getKey() + " : " + entry.getValue()); 
            } 
            doc.close(); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
}