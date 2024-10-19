package org.example.behavioral.strategy.exercise;

public class PlainTextFormatter implements Formatter{
    @Override
    public String format(Object object) throws Exception {
        return object.toString();
    }
}
