package Task3.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static Task3.view.TextConstants.ENTER_DATA;
import static Task3.view.TextConstants.WRONG_INPUT_DATA;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua", "UA"));

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printEnterMessage(String message) {
        System.out.println(bundle.getString(ENTER_DATA) + " " + bundle.getString(message));
    }
    public void printWrongMessage(String message) {
        System.out.println(bundle.getString(WRONG_INPUT_DATA)
                + "\n" + bundle.getString(ENTER_DATA)
                + " " + bundle.getString(message));
    }
}