public class StringHelper {

    // Returns the first half of a String.
    public static String firstHalf(String s) {
        int mid = s.length() / 2;
        return s.substring(0, mid);
    }

    // Returns true if the String contains the letter.
    public static boolean containsLetter(String s, String letter) {
        return s.indexOf(letter) != -1;
    }

    // Counts how many times a letter appears.
    public static int countLetter(String s, String letter) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            String current = s.substring(i, i + 1);
            if (current.equals(letter)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("computer"));  
        System.out.println(containsLetter("banana", "a"));  
        System.out.println(countLetter("banana", "a"));  
    }
}
