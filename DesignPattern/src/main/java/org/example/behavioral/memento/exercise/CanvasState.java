package org.example.behavioral.memento.exercise;

import java.util.Objects;

public class CanvasState {

    private String content;
    private String color;
    private String border;

    public CanvasState(String content, String color, String border) {
        this.content = content;
        this.color = color;
        this.border = border;
    }

    public String getContent() {
        return content;
    }

    public String getColor() {
        return color;
    }

    public String getBorder() {
        return border;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CanvasState that = (CanvasState) object;
        return Objects.equals(content, that.content) && Objects.equals(color, that.color) && Objects.equals(border, that.border);
    }

}
