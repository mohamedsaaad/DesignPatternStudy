package org.example.behavioral.templateMethod.exercise;

public class PlainTextFormatter extends Formatter {
    @Override
    public String format(Object object) throws Exception {
        return object.toString();
    }
}
