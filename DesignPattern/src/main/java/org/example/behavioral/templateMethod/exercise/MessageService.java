package org.example.behavioral.templateMethod.exercise;

public class MessageService {
    Formatter formatter;

    public MessageService(Formatter formatter) {
        this.formatter = formatter;
    }

    void printMessage(Object object)throws Exception{
        System.out.println(formatter.applyFormatting(object));
    }
}
