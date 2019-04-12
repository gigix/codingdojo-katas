package org.codingdojo.kata.args;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.regex.Pattern.compile;

public class Parser {
    private final List<Argument> arguments;
    private Schema schema;

    public Parser(Schema schema, String inputText) {
        this.schema = schema;
        arguments = newArrayList();
        Pattern pattern = Pattern.compile("(-[a-z] [^-]*)");
        Matcher matcher = pattern.matcher(inputText);
        while(matcher.find()) {
            arguments.add(new Argument(matcher.group(1)));
        }

    }

    public List<Argument> getArguments() {
        return arguments;
    }
}
