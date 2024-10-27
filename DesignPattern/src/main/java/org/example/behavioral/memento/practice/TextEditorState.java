package org.example.behavioral.memento.practice;

public class TextEditorState {
    private String content;

    public TextEditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
