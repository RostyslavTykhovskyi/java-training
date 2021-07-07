package Task3;

import Task3.controller.Controller;
import Task3.model.Model;
import Task3.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.processInput();
    }
}