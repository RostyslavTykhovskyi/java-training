package Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ModelTest {
    public Model model;

    @BeforeEach
    public void setup() {
        model = new Model();

        model.setStartBounds(GlobalConstants.START_LOWER_BOUND, GlobalConstants.START_UPPER_BOUND);
    }

    @Test
    public void setStartBoundTest() {
        Assertions.assertEquals(GlobalConstants.START_LOWER_BOUND, model.getLowerBound());
        Assertions.assertEquals(GlobalConstants.START_UPPER_BOUND, model.getUpperBound());
    }

    @Test
    public void setTargetValueTest() {
        for (int i = 0; i < 100000; i++) {
            model.setTargetNumber();
            if (model.getTargetNumber() <= GlobalConstants.START_LOWER_BOUND
                    || model.getTargetNumber() >= GlobalConstants.START_UPPER_BOUND) {
                Assertions.fail("Target number is out of bounds.\n\nTarget number = " + model.getTargetNumber());
            }
        }
    }

    @Test
    public void isNumberInRangeTest() {
        Assertions.assertFalse(model.isNumberInRange(GlobalConstants.START_LOWER_BOUND));
        Assertions.assertFalse(model.isNumberInRange(GlobalConstants.START_UPPER_BOUND));

        Assertions.assertTrue(model.isNumberInRange(1));
        Assertions.assertTrue(model.isNumberInRange(99));
    }

    @Test
    public void isTargetTest() {
        model.setTargetNumber();

        Assertions.assertTrue(model.isTarget(model.getTargetNumber()));
    }

    @Test
    public void attemptsListAddingValuesTest() {
        model.setTargetNumber();
        int attempt = 50;

        Assertions.assertFalse(model.getAttempts().contains(attempt));

        model.isTarget(attempt);

        Assertions.assertTrue(model.getAttempts().contains(attempt));
    }
}
