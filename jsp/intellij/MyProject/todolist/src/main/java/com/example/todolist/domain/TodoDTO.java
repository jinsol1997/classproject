package com.example.todolist.domain;

public class TodoDTO {

    private long index;
    private String todo;
    private String dueDate;
    private boolean finished;

    public TodoDTO() {
    }

    public TodoDTO(long index, String todo, String dueDate, boolean finished) {
        this.index = index;
        this.todo = todo;
        this.dueDate = dueDate;
        this.finished = finished;
    }

    public TodoDTO(String todo, String dueDate, boolean finished) {
        this.todo = todo;
        this.dueDate = dueDate;
        this.finished = finished;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "index=" + index +
                ", todo='" + todo + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", finished=" + finished +
                '}';
    }
}
