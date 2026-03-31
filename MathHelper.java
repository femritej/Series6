public class MathHelper {

    // Returns the larger of two numbers.
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    // Returns the average of two numbers.
    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    // Uses both methods above.
    public static double averageOfLargest(int x, int y, int z) {
        int largest = max(x, y);     // Step 1: find larger of x and y
        largest = max(largest, z);   // Step 2: compare with z
        return average(largest, z);  // Step 3: average the two largest
    }

    public static void main(String[] args) {
        double result = averageOfLargest(3, 10, 7);
        System.out.println("Average of the two largest: " + result);
    }
}
