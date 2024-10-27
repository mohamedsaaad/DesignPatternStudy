package org.example.behavioral.memento.violation;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();

        textEditor.setContent("Hello, ");
        textEditor.save();

        textEditor.setContent("saad ");
        textEditor.save();

        textEditor.setContent("welcome the design pattern course...");

        System.out.println(textEditor.getContent());

        System.out.println(textEditor.undo());
        System.out.println(textEditor.undo());
        System.out.println(textEditor.redo());
        System.out.println(textEditor.redo());
    }
}
