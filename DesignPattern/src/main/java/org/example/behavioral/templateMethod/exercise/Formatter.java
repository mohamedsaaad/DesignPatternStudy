package org.example.behavioral.templateMethod.exercise;

public abstract class Formatter {

    final String applyFormatting(Object object) throws Exception{
        checkMessageSize();
        validateMessage();
       return format(object);
    }

    abstract String format(Object object) throws Exception;

    void validateMessage(){
        System.out.println("Validating the message before formatting it...");
    }
    void checkMessageSize(){
        System.out.println("check the message size before formatting it...");
    }
}
