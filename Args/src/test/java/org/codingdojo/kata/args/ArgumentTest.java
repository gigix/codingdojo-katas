package org.codingdojo.kata.args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArgumentTest {
    @Test
    public void should_record_argument_name_and_value() {
        Argument argument = new Argument("-d /usr/logs");
        assertThat(argument.getName(), is("d"));
        assertThat(argument.getRawValue(), is("/usr/logs"));
    }

    @Test
    public void should_transform_argument_value_to_appropriate_types() {
        assertThat(new Argument("-l ", "boolean").getValue(), is(true));
        assertThat(new Argument("-p 8080", "integer").getValue(), is(8080));
        assertThat(new Argument("-d /usr/logs", "string").getValue(), is("/usr/logs"));
    }
}