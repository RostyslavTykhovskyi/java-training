package Task2;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processInput() {
        model.setStartBounds(GlobalConstants.START_LOWER_BOUND, GlobalConstants.START_UPPER_BOUND);
        model.setTargetNumber();

        int number;
        Scanner sc = new Scanner(System.in);

        while (true) {
            number = enterIntValueWithScanner(sc);

            if ( ! model.isNumberInRange(number)) {
                view.printMessage(View.OUT_OF_BOUNDS, model.getLowerBound(), model.getUpperBound());
                continue;
            }

            if (model.isTarget(number)) {
                view.printMessage(View.WIN_MESSAGE);
                view.printMessage(View.ATTEMPTS, model.getAttempts());
                break;
            }

            view.printMessage(View.BOUNDS, model.getLowerBound(), model.getUpperBound());
            view.printMessage(View.ATTEMPTS, model.getAttempts());
        }
    }

    public int enterIntValueWithScanner(Scanner sc) {
        view.printMessage(View.ENTER_INT_VALUE);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_VALUE);
            view.printMessage(View.ENTER_INT_VALUE);
            sc.next();
        }
        return sc.nextInt();
    }
}
