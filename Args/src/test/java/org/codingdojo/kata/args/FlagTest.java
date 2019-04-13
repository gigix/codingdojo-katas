package org.codingdojo.kata.args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FlagTest {
    @Test
    public void should_know_flag_name_and_expected_type() {
        Flag flag = new Flag("l:boolean");
        assertThat(flag.getName(), is("l"));
        assertThat(flag.getExpectedType(), is("boolean"));
    }
}