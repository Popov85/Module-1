import static java.lang.System.*;

/**
 * Created by Андрей on 20.05.2016.
 */
public class Greeting {
    public static void main(String[] args) {
        out.println(displayMessage2());
    }
    private static void displayMessage(String message) {
        out.println(message);
    }
    private static String displayMessage2() {
        String statement="Hi, I'm your first Java program! Stay tuned!";
        return statement;
    }

}
