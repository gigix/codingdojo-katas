package org.codingdojo.kata.args;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Lists.newArrayList;

public class Argument {
    private final String name;
    private final String rawValue;
    protected String valueType;

    public Argument(String text) {
        this(text, "string");
    }

    public Argument(String text, String valueType) {
        this.valueType = valueType;
        name = text.substring(1, 2);
        rawValue = text.substring(3);
    }

    public Argument(String text, Schema schema) {
        this(text);
        valueType = newArrayList(filter(schema.getFlags(), flag -> flag.getName().equals(name))).get(0).getExpectedType();
    }

    public String getName() {
        return name;
    }

    public String getRawValue() {
        return rawValue;
    }

    public Object getValue() {
        switch (valueType) {
            case "boolean":
                return true;
            case "integer":
                return Integer.parseInt(rawValue.trim());
            default:
                return rawValue.trim();
        }
    }
}
