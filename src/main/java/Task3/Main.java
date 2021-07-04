package Task3;

import Task3.model.Notebook;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Notebook(), new View());

        controller.processInput();
    }
}
