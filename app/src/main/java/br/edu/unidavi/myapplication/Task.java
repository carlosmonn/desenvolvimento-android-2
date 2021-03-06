package br.edu.unidavi.myapplication;

public class Task {

    private final int id;
    private final String title;
    private final boolean done;

    public Task(int id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }
}
