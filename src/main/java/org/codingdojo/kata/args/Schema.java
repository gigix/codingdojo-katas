package org.codingdojo.kata.args;

import java.util.List;

import static com.google.common.collect.Collections2.transform;
import static com.google.common.collect.Lists.newArrayList;

public class Schema {
    private List<ExpectedArg> expectedArgs;

    public Schema(String schemaDescription) {
        String[] schemasAsText = schemaDescription.split(" ");
        expectedArgs = newArrayList(transform(newArrayList(schemasAsText), input -> new ExpectedArg(input)));
    }

    public List<ExpectedArg> getExpectedArgs() {
        return expectedArgs;
    }
}
