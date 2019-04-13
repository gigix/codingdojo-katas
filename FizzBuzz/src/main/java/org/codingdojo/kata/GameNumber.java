package org.codingdojo.kata;

public class GameNumber {
    private Integer value;

    public GameNumber(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (!(isFizz() || isBuzz())) {
            return value.toString();
        }
        String result = isFizz() ? "Fizz" : "";
        result += isBuzz() ? "Buzz" : "";
        return result;
    }

    private boolean isBuzz() {
        return multiplesOrContains(5);
    }

    private boolean isFizz() {
        return multiplesOrContains(3);
    }

    private boolean multiplesOrContains(Integer digit) {
        return value % digit == 0 || value.toString().contains(digit.toString());
    }
}
