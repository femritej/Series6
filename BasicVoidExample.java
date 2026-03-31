public class BasicVoidExample {

    // This method does ONE job: print a greeting.
    public static void sayHello() {
        System.out.println("Hello from a method!");
    }

    public static void main(String[] args) {
        // Calling the method twice
        sayHello();
        sayHello();
    }
}
