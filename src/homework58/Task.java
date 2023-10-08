package homework58;

public class Task {
    private int number;
    private String description;
    private Status status;

    public Task(int number, String description, Status status) {
        this.number = number;
        this.description = description;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task: " + number + ", \"" + description + "\"" + ", " + status;
    }

}
