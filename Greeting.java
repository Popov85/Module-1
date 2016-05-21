import static java.lang.System.*;

/**
 * Created by Андрей on 20.05.2016.
 */
public class Greeting {
    public static void main(String[] args) {
        String progLang="Java";
        displayMessage("Hi, I'm your first "+ progLang+ " program! ");
        displayMessage("Stay tuned!");

    }
    private static void displayMessage(String message) {
        out.print(message);

    }


}
