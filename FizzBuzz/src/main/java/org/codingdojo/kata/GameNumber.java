package org.codingdojo.kata;

public class GameNumber {
    private Integer value;

    public GameNumber(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value % 3 == 0 && value % 5 == 0) {
            return "FizzBuzz";
        }
        if (value % 3 == 0) {
            return "Fizz";
        }
        if (value % 5 == 0) {
            return "Buzz";
        }
        return value.toString();
    }
}
