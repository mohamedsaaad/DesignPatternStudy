package org.example.behavioral.templateMethod.exercise;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFormatter extends Formatter {

    @Override
    public String format(Object object) throws Exception {
        // Create an instance of ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Convert Java object to JSON string
        String json = objectMapper.writeValueAsString(object);
        return json;
    }
}
