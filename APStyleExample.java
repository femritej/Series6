public class APStyleExample {

    // Returns true if n is between low and high (inclusive).
    public static boolean inRange(int n, int low, int high) {
        return n >= low && n <= high;
    }

    // Uses inRange to classify a score.
    public static String gradeCategory(int score) {

        if (inRange(score, 90, 100)) {
            return "A";
        } else if (inRange(score, 80, 89)) {
            return "B";
        } else if (inRange(score, 70, 79)) {
            return "C";
        } else if (inRange(score, 60, 69)) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println(gradeCategory(92));  // A
        System.out.println(gradeCategory(75));  // C
        System.out.println(gradeCategory(58));  // F
    }
}
