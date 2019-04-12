package org.codingdojo.kata.args;

public class Argument {
    private final String name;
    private final String rawValue;
    private final String valueType;

    public Argument(String text) {
        this(text, "string");
    }

    public Argument(String text, String valueType) {
        this.valueType = valueType;
        name = text.substring(1, 2);
        rawValue = text.substring(3);
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
                return Integer.parseInt(rawValue);
            default:
                return rawValue;
        }
    }
}
