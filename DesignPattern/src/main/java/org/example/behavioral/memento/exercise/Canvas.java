package org.example.behavioral.memento.exercise;

// the originator
public class Canvas {
    private String content;
    private String color;
    private String border;

    public Canvas(String content, String color, String border) {
        this.content = content;
        this.color = color;
        this.border = border;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public CanvasState saveState(){
        return new CanvasState(content,color,border);
    }

    public void restoreState(CanvasState state){
            content=null!=state?state.getContent():null;
            color=null!=state?state.getColor():null;
            border=null!=state?state.getBorder():null;
    }

    @Override
    public String toString() {
        return "Canvas{" +
                "content='" + content + '\'' +
                ", color='" + color + '\'' +
                ", border='" + border + '\'' +
                '}';
    }
}
