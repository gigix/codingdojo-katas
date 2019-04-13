package org.codingdojo.kata;

public class Game {
    static public void main(String... args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(new GameNumber(i));
        }
    }
}
