package org.feuyeux.pattern.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<Variable, Boolean> map = new HashMap<>();

    public void assign(Variable var, boolean value) {
        map.put(var, value);
    }

    public boolean lookup(Variable var) throws IllegalArgumentException {
        Boolean value = map.get(var);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value;
    }
}


