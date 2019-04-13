package org.codingdojo.kata.args;

import java.util.List;

import static com.google.common.collect.Collections2.transform;
import static com.google.common.collect.Lists.newArrayList;

public class Schema {
    private List<Flag> flags;

    public Schema(String schemaDescription) {
        String[] schemasAsText = schemaDescription.split(" ");
        flags = newArrayList(transform(newArrayList(schemasAsText), input -> new Flag(input)));
    }

    public List<Flag> getFlags() {
        return flags;
    }
}
