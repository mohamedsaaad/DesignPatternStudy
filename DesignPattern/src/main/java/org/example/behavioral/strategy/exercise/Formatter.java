package org.example.behavioral.strategy.exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Formatter {
    String format(Object object) throws Exception;
}
