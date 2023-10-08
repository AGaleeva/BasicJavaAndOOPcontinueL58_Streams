package demo;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> rate;

    public Student(String name, List<Integer> rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rate=" + rate + '}';
    }
}
