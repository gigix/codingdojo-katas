package org.codingdojo.kata.args;

public class Flag {
    private final String name;
    private final String expectedType;
    private String description;

    public Flag(String description) {
        this.description = description;
        this.name = description.split(":")[0];
        this.expectedType = description.split(":")[1];
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getExpectedType() {
        return expectedType;
    }
}
