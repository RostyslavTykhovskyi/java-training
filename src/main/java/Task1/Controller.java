package Task1;

import java.util.Scanner;

public class Controller {
    public static final String CORRECT_HELLO = "Hello";
    public static final String CORRECT_WORLD = "world!";

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processInput() {
        Scanner sc = new Scanner(System.in);

        String hello = inputStringValueWithScanner(sc, View.INPUT_STRING_HELLO, CORRECT_HELLO);
        String world = inputStringValueWithScanner(sc, View.INPUT_STRING_WORLD, CORRECT_WORLD);

        view.printMessage(View.RESULT + model.makeSentence(hello, world));
    }

    public String inputStringValueWithScanner(Scanner sc, String message, String correctValue) {
        String value;

        view.printMessage(message);
        value = sc.nextLine();
        while ( ! value.equals(correctValue)) {
            view.printMessage(View.WRONG_INPUT_DATA + message);
            value = sc.nextLine();
        }

        return value;
    }
}
