package org.example.behavioral.memento.exercise;

import org.example.behavioral.memento.practice.History;

public class Main {
    public static void main(String[] args) {
        //initial draw for canvas
        Canvas canvas=new Canvas("Initial Content","Red","Solid");
        CanvasHistory history=new CanvasHistory();

        //save the initial state
        history.saveState(canvas.saveState());

        //make some changes
        canvas.setContent("first modification...");
        canvas.setColor("blue");

        //save new state
        history.saveState(canvas.saveState());

        //make some changes
        canvas.setContent("second modification");
        canvas.setColor("Black");
        canvas.setBorder("Dashed");

        //save new state
        history.saveState(canvas.saveState());


        canvas.restoreState(history.undoState(canvas));
        System.out.println(canvas.toString());

    }
}
