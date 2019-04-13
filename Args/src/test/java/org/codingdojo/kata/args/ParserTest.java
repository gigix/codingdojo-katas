package org.codingdojo.kata.args;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParserTest {
    private Schema schema;

    @Before
    public void setUp() {
        schema = new Schema("l:boolean p:integer d:string");
    }

    @Test
    public void should_read_arguments_from_text() {
        Parser parser = new Parser(schema, "-l -p 8080 -d /usr/logs ");
        assertThat(parser.getArgumentSize(), is(3));
        assertThat(parser.getArgumentValue("l"), is(true));
        assertThat(parser.getArgumentValue("p"), is(8080));
        assertThat(parser.getArgumentValue("d"), is("/usr/logs"));
    }

    @Test
    public void should_assign_default_value_if_argument_is_missing() {
        Parser parser = new Parser(schema, "");
        assertThat(parser.getArgumentSize(), is(3));
        assertThat(parser.getArgumentValue("l"), is(false));
        assertThat(parser.getArgumentValue("p"), is(0));
        assertThat(parser.getArgumentValue("d"), is(""));
    }
}
