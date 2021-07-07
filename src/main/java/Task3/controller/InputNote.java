package Task3.controller;

import Task3.view.View;
import Task3.view.TextConstants;

import java.util.Scanner;

import static Task3.controller.RegexContainer.*;

public class InputNote {
    private Scanner scanner;
    private View view;

    private String name;
    private String patronymic;
    private String surname;
    private String login;

    public InputNote(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public void inputNote() {
        UtilityController utilityController = new UtilityController(scanner, view);

        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.name =
                utilityController.inputStringValueWithScanner
                        (TextConstants.ENTER_NAME_DATA, str);

        this.patronymic =
                utilityController.inputStringValueWithScanner
                        (TextConstants.ENTER_PATRONYMIC_DATA, str);

        this.surname =
                utilityController.inputStringValueWithScanner
                        (TextConstants.ENTER_SURNAME_DATA, str);

        this.login =
                utilityController.inputStringValueWithScanner
                        (TextConstants.ENTER_LOGIN_DATA, REGEX_LOGIN);
    }
}
