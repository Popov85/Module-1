import static java.lang.System.*;

/**
 * Created by Андрей on 20.05.2016.
 */
public class Greeting {
    public static void main(String[] args) {
        displayMessage("Hi, I'm your first Java program!");
        out.print(displayMessage2());

    }
    private static void displayMessage(String message) {
        out.print(message);
    }
    private static String displayMessage2() {
        String statement=" Stay tuned!";
        return statement;
    }

}
