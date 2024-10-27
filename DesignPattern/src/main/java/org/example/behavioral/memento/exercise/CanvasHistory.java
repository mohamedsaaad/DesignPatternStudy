package org.example.behavioral.memento.exercise;

import java.util.Stack;

public class CanvasHistory {

    private Stack<CanvasState> undoStack;
    private Stack<CanvasState> redoStack;


    public CanvasHistory() {
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void saveState(CanvasState state){
        undoStack.push(state);
        redoStack.clear();
    }

    public CanvasState undoState(Canvas canvas){
        if(!undoStack.isEmpty()){
            redoStack.push(canvas.saveState());
            return undoStack.pop();
        }
        return null;
    }

    public CanvasState redoState(Canvas state){
        if(!redoStack.isEmpty()){
            undoStack.push(state.saveState());
            return redoStack.pop();
        }
        return null;
    }

}
