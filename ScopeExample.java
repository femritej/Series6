public class ScopeExample {

    public static void showScope() {
        int x = 10;  // x exists inside showScope()

        if (x > 5) {
            int y = 20;  // y exists ONLY inside this if-block
            System.out.println("Inside if: x = " + x + ", y = " + y);
        }

        // System.out.println(y); // ERROR: y is out of scope
    }

    public static void main(String[] args) {
        showScope();

        // System.out.println(x); // ERROR: x is not in scope here
    }
}
