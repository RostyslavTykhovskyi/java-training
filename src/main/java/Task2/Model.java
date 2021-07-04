package Task2;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int targetNumber;
    private int upperBound;
    private int lowerBound;
    private List<Integer> attempts = new ArrayList<>();

    public void setTargetNumber() {
        targetNumber = (int) (Math.random() * (upperBound - lowerBound - 1) + lowerBound + 1);
    }

    public boolean isTarget(int number) {
        attempts.add(number);
        if (number == targetNumber) {
            return true;
        } else if (number > targetNumber) {
            upperBound = number;
        } else {
            lowerBound = number;
        }
        return false;
    }

    public boolean isNumberInRange(int number) {
        return (number < upperBound) && (number > lowerBound);
    }

    public void setStartBounds(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public List<Integer> getAttempts() {
        return attempts;
    }
}
