package org.codingdojo.kata.args;

import org.junit.Test;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParserTest {
    @Test
    public void should_read_arguments_from_text() {
        Schema schema = new Schema("l p d");
        Parser parser = new Parser(schema, "-l -p 8080 -d /usr/logs");
        List<Argument> arguments = parser.getArguments();
        assertThat(arguments.size(), is(3));
    }
}
