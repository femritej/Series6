public class TwoParameterExample {

    // This method prints a message multiple times.
    public static void repeatMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        repeatMessage("Java is fun!", 3);
        repeatMessage("Methods are powerful!", 2);
    }
}
