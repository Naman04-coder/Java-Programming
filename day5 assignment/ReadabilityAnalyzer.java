import java.util.Scanner;

public class ReadabilityAnalyzer {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a text to analyze: ");
            String text = scanner.nextLine();
            
            int sentenceCount = countSentences(text);
            int wordCount = countWords(text);
            int syllableCount = countSyllables(text);
            int characterCount = text.replaceAll("\\s+", "").length();
            
            double readabilityScore = calculateFleschKincaidScore(wordCount, sentenceCount, syllableCount);
            
            System.out.println("\nText Analysis:");
            System.out.println("Total Characters: " + characterCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Sentences: " + sentenceCount);
            System.out.println("Total Syllables: " + syllableCount);
            System.out.println("Readability Score: " + readabilityScore);
            
            String readabilityCategory = categorizeReadability(readabilityScore);
            System.out.println("Readability Category: " + readabilityCategory);
        }
    }

    public static int countSentences(String text) {
        String[] sentences = text.split("[.!?]+");
        return sentences.length;
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static int countSyllables(String text) {
        int syllableCount = 0;
        String[] words = text.split("\\s+");

        for (String word : words) {
            syllableCount += countSyllablesInWord(word);
        }

        return syllableCount;
    }

    public static int countSyllablesInWord(String word) {
        word = word.toLowerCase().replaceAll("[^a-z]", "");

        if (word.length() == 0) {
            return 0;
        }

        int syllables = 0;
        boolean vowel = false;
        char[] letters = word.toCharArray();

        for (char letter : letters) {
            if (isVowel(letter)) {
                if (!vowel) {
                    syllables++;
                }
                vowel = true;
            } else {
                vowel = false;
            }
        }

        if (word.endsWith("e")) {
            syllables--;
        }

        if (syllables == 0) {
            syllables = 1;
        }

        return syllables;
    }

    public static boolean isVowel(char letter) {
        return "aeiou".indexOf(letter) != -1;
    }

    public static double calculateFleschKincaidScore(int wordCount, int sentenceCount, int syllableCount) {
        if (sentenceCount == 0 || wordCount == 0) {
            return 0;
        }
        return 206.835 - (1.015 * (double) wordCount / sentenceCount) - (84.6 * (double) syllableCount / wordCount);
    }

    public static String categorizeReadability(double score) {
        if (score >= 90 && score <= 100) {
            return "Very Easy";
        } else if (score >= 80 && score < 90) {
            return "Easy";
        } else if (score >= 70 && score < 80) {
            return "Fairly Easy";
        } else if (score >= 60 && score < 70) {
            return "Standard";
        } else if (score >= 50 && score < 60) {
            return "Fairly Difficult";
        } else if (score >= 30 && score < 50) {
            return "Difficult";
        } else {
            return "Very Confusing";
        }
    }
}