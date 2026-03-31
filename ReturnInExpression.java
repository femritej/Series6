public class ReturnInExpression {

    // Returns the sum of two numbers.
    public static int add(int a, int b) {
        return a + b;
    }

    // Returns the double of a number.
    public static int doubleValue(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        int result = doubleValue(add(3, 4));  
        // add(3,4) = 7 → doubleValue(7) = 14

        System.out.println("Final result: " + result);
    }
}
