package laika;
public class Task {
    protected String description;

    protected boolean isDone;

    protected String type;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "[X] " : "[ ] "); // mark done task with X
    }

    public String toString() {
        return  getStatusIcon() + description;
    }

    public void markAsDone(){
        isDone = true;
    }

    public void markAsUndone(){
        isDone = false;
    }
}