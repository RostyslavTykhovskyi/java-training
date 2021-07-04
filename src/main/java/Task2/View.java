package Task2;

import java.util.List;

public class View {
    public static final String ENTER_INT_VALUE = "Enter integer value: ";
    public static final String WRONG_VALUE = "Entered value should be an integer!";
    public static final String BOUNDS = "Target number is within %d and %d.";
    public static final String OUT_OF_BOUNDS = "Entered value should be within %d and %d.";
    public static final String ATTEMPTS = "Your attempts: ";
    public static final String WIN_MESSAGE = "You won!";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, int lowerLimit, int upperLimit) {
        System.out.println(String.format(message, lowerLimit, upperLimit));
    }

    public void printMessage(String message, List<Integer> attempts) {
        System.out.print(message);
        attempts.forEach(a -> System.out.print(a + " "));
        System.out.println();
    }

}
