import java.util.Scanner;

public class TextAnalyzer {

    // Returns the number of vowels in a word.
    public static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i + 1);
            if (vowels.indexOf(letter) != -1) {
                count++;
            }
        }
        return count;
    }

    // Returns the first letter of the word.
    public static String firstLetter(String word) {
        return word.substring(0, 1);
    }

    // Returns the last letter of the word.
    public static String lastLetter(String word) {
        return word.substring(word.length() - 1);
    }

    // Returns true if the word starts and ends with the same letter.
    public static boolean isSymmetric(String word) {
        return firstLetter(word).equalsIgnoreCase(lastLetter(word));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.println("Vowel count: " + countVowels(word));
        System.out.println("First letter: " + firstLetter(word));
        System.out.println("Last letter: " + lastLetter(word));
        System.out.println("Starts and ends with same letter: " + isSymmetric(word));
    }
}
