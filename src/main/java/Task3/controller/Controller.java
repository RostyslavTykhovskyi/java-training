package Task3.controller;

import Task3.model.entity.IncorrectLoginException;
import Task3.model.entity.Notebook;
import Task3.view.View;
import Task3.model.Model;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processInput() {
        Scanner scanner = new Scanner(System.in);
        NewNote newNote = new NewNote(scanner, view);
        newNote.inputNote();
        while (true) {
            try {
                Notebook.hasLogin(newNote.getLogin());
                break;
            } catch (IncorrectLoginException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                newNote.inputLogin();
            }
        }
    }
}