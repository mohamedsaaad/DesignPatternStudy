package org.example.behavioral.memento.violation;

import java.util.Stack;

public class TextEditor {
    private String content;
    private Stack<String> prevState;
    private Stack<String> nextState;

    public TextEditor() {
        this.content = "";
        this.prevState = new Stack<>();
        this.nextState = new Stack<>();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void save(){
        prevState.push(content);
        nextState.clear();
    }

    public String undo(){
        if(!prevState.isEmpty()){
            nextState.push(content);
            content=prevState.pop();
            return content;
        }
        return null;
    }

    public String redo(){
        if(!nextState.isEmpty()){
            prevState.push(content);
            content=nextState.pop();
            return content;
        }
        return null;
    }
}
