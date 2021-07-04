package Task3;

import Task3.model.Note;
import Task3.model.Notebook;

import java.util.Scanner;

public class Controller {
    private Notebook notebook;
    private View view;

    public Controller(Notebook notebook, View view) {
        this.notebook = notebook;
        this.view = view;
    }

    public void processInput() {
        Scanner scanner = new Scanner(System.in);
        Note note = new Note();

        note.setName(inputStringValueWithScanner(scanner, View.ENTER_NAME, Validator.NAME_REGEX));
        note.setPatronymic(inputStringValueWithScanner(scanner, View.ENTER_PATRONYMIC, Validator.NAME_REGEX));
        note.setSurname(inputStringValueWithScanner(scanner, View.ENTER_SURNAME, Validator.NAME_REGEX));
        note.setLogin(inputStringValueWithScanner(scanner, View.ENTER_LOGIN, Validator.LOGIN_REGEX));

        notebook.setNote(note);
        view.printMessage(notebook.getNote().toString());
    }

    private String inputStringValueWithScanner(Scanner scanner, String message, String regex) {
        view.printMessage(message);
        String string = scanner.next();
        while (!Validator.isValid(string, regex)) {
            view.printMessage(View.WRONG_INPUT);
            view.printMessage(message);
            string = scanner.next();
        }

        return string;
    }
}
