package org.example.behavioral.strategy.exercise;

public class MessageService {
    Formatter formatter;

    public MessageService(Formatter formatter) {
        this.formatter = formatter;
    }

    void printMessage(Object object)throws Exception{
        System.out.println(formatter.format(object));
    }
}
