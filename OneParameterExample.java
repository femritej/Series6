public class OneParameterExample {

    // This method takes a name and prints a personalized greeting.
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Alex");     // Argument: "Alex"
        greet("Jordan");   // Argument: "Jordan"
    }
}
