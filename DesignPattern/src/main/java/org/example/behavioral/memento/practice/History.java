package org.example.behavioral.memento.practice;

import java.util.Stack;

public class History {
    final Stack<TextEditorState> undoStack;
    final Stack<TextEditorState> redoStack;

    public History() {
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void saveToHistory(TextEditorState state){
        undoStack.push(state);
        redoStack.clear();
    }

    public TextEditorState undoStack(TextEditor editor){
        if(!undoStack.isEmpty()){
            redoStack.push(editor.save());
            return undoStack.pop();
        }
        return null;
    }

    public TextEditorState redoStack(TextEditor editor){
        if(!redoStack.isEmpty()){
            undoStack.push(editor.save());
            return redoStack.pop();
        }
        return null;
    }
}
