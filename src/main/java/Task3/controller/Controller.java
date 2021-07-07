package Task3.controller;

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
        InputNote inputNote = new InputNote(scanner, view);
        inputNote.inputNote();
    }
}