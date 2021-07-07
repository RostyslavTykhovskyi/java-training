package Task3.controller;

import Task3.view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    /**
     * Created by Rostyslav Tykhovskyi on 07.07.2021
     *
     * @param message printed before user enters a value
     * @param regex used to validate user input
     * @return validated String
     */
    public String inputStringValueWithScanner(String message, String regex) {
        view.printEnterMessage(message);
        String string = scanner.next();
        while (!string.matches(regex)) {
            view.printWrongMessage(message);
            string = scanner.next();
        }

        return string;
    }
}