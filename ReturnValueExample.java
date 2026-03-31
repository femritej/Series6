public class ReturnValueExample {

    // This method returns the square of a number.
    public static int square(int x) {
        return x * x;  // Return the computed value
    }

    public static void main(String[] args) {
        int result = square(5);  // result = 25
        System.out.println("Square of 5 is: " + result);
    }
}
