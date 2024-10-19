package org.example.behavioral.strategy.exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFormatter implements Formatter{

    @Override
    public String format(Object object) throws Exception {
        // Create an instance of ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Convert Java object to JSON string
        String json = objectMapper.writeValueAsString(object);
        return json;
    }
}
