package org.codingdojo.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameNumberTest {
    @Test
    public void should_reply_1_when_value_is_1() {
        GameNumber gameNumber = new GameNumber(1);
        assertThat(gameNumber.toString(), is("1"));
    }
    
    @Test
    public void should_reply_fizz_when_value_is_3() {
        GameNumber gameNumber = new GameNumber(3);
        assertThat(gameNumber.toString(), is("Fizz"));
    }

    @Test
    public void should_reply_buzz_when_value_is_5() {
        GameNumber gameNumber = new GameNumber(5);
        assertThat(gameNumber.toString(), is("Buzz"));
    }

    @Test
    public void should_reply_fizz_buzz_when_value_is_15() {
        GameNumber gameNumber = new GameNumber(15);
        assertThat(gameNumber.toString(), is("FizzBuzz"));
    }
}
