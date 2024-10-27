package org.example.behavioral.memento.practice;


// this class consider originator that will allow
// users to write text and save or restore its state.
public class TextEditor {
    private StringBuilder text;

    public TextEditor() {
        text = new StringBuilder();
    }

    public StringBuilder getText() {
        return text;
    }

    public void write(String newText){
        text.append(newText);
    }

    public TextEditorState save(){
        //this mean we take the current state as a snapshot to save it as new state
        return new TextEditorState(text.toString());
    }

    public void restore(TextEditorState state){
        //this is mean we back to a saved snapshot or saved state
        text=new StringBuilder(state.getContent());
    }
}
