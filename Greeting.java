package Module1;

/**
 * Created by Андрей on 20.05.2016.
 */
public class Greeting {
        public static void main(String[] args) {
                String programLanguage="Java";
                displayMessage("Hi, I'm your first "+ programLanguage+ " program! Stay tuned!");
        }
        private static void displayMessage(String message) {
                System.out.println(message);
        }
}
