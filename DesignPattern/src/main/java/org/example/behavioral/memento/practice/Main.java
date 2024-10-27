package org.example.behavioral.memento.practice;

public class Main {
    public static void main(String[] args) {
        //Create my originator (TextEditor)
        TextEditor editor= new TextEditor();
        History history=new History();

        //consider I opened the editor and write "hello MR ,"
        editor.write("hello MR ,");
        //then saved the status you can consider this action happened when you press on ctrl+s
        history.saveToHistory(editor.save());

        // then continue writing " Saad-Eldeen"
        editor.write(" Saad-Eldeen");
        //then saved the status you can consider this action happened when you press on ctrl+s
        history.saveToHistory(editor.save());


        // then continue writing " Saad-Eldeen"
        editor.write(" in design pattern course!");

        //without pressing ctrl+s I need to print the current status

        System.out.println(editor.getText());

        //let create undo and print the current content after redoing
        //if you press ctrl+z
        editor.restore(history.undoStack(editor));
        System.out.println(editor.getText());

        //let create undo and print the current content after redoing
        //if you press ctrl+z
        editor.restore(history.undoStack(editor));
        System.out.println(editor.getText());


        //let check the redo mechanism

        //let create Redo and print the current content after redoing
        //if you press ctrl+Y
        editor.restore(history.redoStack(editor));
        System.out.println(editor.getText());

        //let create Redo and print the current content after redoing
        //if you press ctrl+Y
        editor.restore(history.redoStack(editor));
        System.out.println(editor.getText());

    }
}
