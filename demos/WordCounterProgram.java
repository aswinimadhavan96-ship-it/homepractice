package demos;


import java.util.Scanner;

public class WordCounterProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int charCount = 0;
        int vowelCount = 0;

        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                charCount++;
            }

            if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        
        String trimmed = sentence.trim();
        int wordCount = 0;

        if (!trimmed.isEmpty()) {
            String[] words = trimmed.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Total characters (without spaces): " + charCount);
        System.out.println("Total words: " + wordCount);
        System.out.println("Total vowels: " + vowelCount);

        sc.close();
    }
}
