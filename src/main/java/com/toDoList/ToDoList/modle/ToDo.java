package com.toDoList.ToDoList.modle;



public class ToDo {
    private Long id;
    private String text;
    private boolean disabled;

    public ToDo() {}

    public ToDo(Long id, String text, boolean disabled) {
        this.id = id;
        this.text = text;
        this.disabled = disabled;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public boolean isDisabled() { return disabled; }
    public void setDisabled(boolean disabled) { this.disabled = disabled; }
}