import java.io.*;
import java.util.Scanner;

public class Lab10_1 {
    public static void main(String[] args) {
        int lineCount=0;
        int wordCount=0;
        int charCount=0;
        try {
            File file = new File("example.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lineCount++;
                charCount=charCount+line.length();
                wordCount=wordCount+line.split(" \\s+").length; 
                System.out.println("Line Count"+" "+lineCount+" "+"Char Count"+" "+charCount+" "+" Word Count"+" "+wordCount);       
            }
            sc.close(); 

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found"+e);
        }
    }
}