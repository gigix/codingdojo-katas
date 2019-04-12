package org.codingdojo.kata.args;

public class NullArgument extends Argument {
    public NullArgument(Flag flag) {
        super(flag.defaultTextPresentation(), flag.getExpectedType());
    }

    public Object getValue() {
        switch (valueType) {
            case "boolean":
                return false;
            case "integer":
                return 0;
            default:
                return getRawValue();
        }
    }
}
