package homework58;

import java.util.List;

public class Developer {
    /*
    { String name, String city, List<Task>  tasks }
    int Number, String description, Status status
    */
    private String name;
    private String city;
    private List<Task> tasks;

    public Developer(String name, String city, List<Task> tasks) {
        this.name = name;
        this.city = city;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return name + ", " + city + ", tasks: " + tasks;
    }
}

