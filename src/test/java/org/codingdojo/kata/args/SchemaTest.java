package org.codingdojo.kata.args;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchemaTest {
    @Test
    public void should_be_able_to_read_schema_from_text() {
        Schema schema = new Schema("l:boolean p:integer d:string");
        List<Flag> flags = schema.getFlags();
        assertThat(flags.size(), is(3));
        Flag firstFlag = flags.get(0);
        assertThat(firstFlag.getDescription(), is("l:boolean"));
        assertThat(firstFlag.getName(), is("l"));
        assertThat(firstFlag.getExpectedType(), is("boolean"));
    }
}
