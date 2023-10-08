package homework58;

import java.util.ArrayList;
import java.util.List;

public class DeveloperAppl {
    /*
    Задача 2.
    Дан список Programmer { String name, String city, List<Task>  tasks }. Каждый
     программист  имеет список задач Task { int Number, String description,
    Status status }. Естественно,  Status это enum.  Сформировать список из всех
    незавершенных задач (т.е. имеют статус, отличный от «DONE»), которые относятся к
    программистам из Берлина.
    */

    public static void main(String[] args) {
        List<Developer> developers = List.of(new Developer("Johnson", "Frankfurt", List.of(new Task(1,
                "working on " + "ticket 01", Status.DONE), new Task(5, "working on ticket 05", Status.IN_DEVELOPMENT)
                , new Task(20, "open the ticket 20", Status.TO_DO))), new Developer("Fischer", "Munich",
                List.of(new Task(4, "working on ticket 04", Status.IN_TESTING_QA), new Task(3, "working on ticket 03"
                        , Status.IN_DEVELOPMENT), new Task(21, "open ticket 21", Status.TO_DO))), new Developer("Frey"
                , "Frankfurt", List.of(new Task(2, "working on ticket 02", Status.DONE), new Task(6, "working on " +
                "ticket" + " 06", Status.IN_DEVELOPMENT), new Task(7, "open the ticket 07", Status.IN_TESTING_QA))),
                new Developer("Sabo", "Berlin", List.of(new Task(8, "working on ticket 08", Status.DONE), new Task(12,
                        "working on ticket 12", Status.IN_DEVELOPMENT), new Task(10, "working on ticket 10",
                        Status.IN_DEVELOPMENT))), new Developer("Biber", "Berlin", List.of(new Task(9,
                        "working on " + "ticket 09", Status.DONE), new Task(11, "working on ticket 11",
                        Status.IN_DEVELOPMENT), new Task(14, "working on ticket 14", Status.IN_DEVELOPMENT))));

        System.out.println(getTasks(developers));

    }

    public static List<Task> getTasks(List<Developer> list) { //
        List<Task> listTasks =
        list.stream()
                .filter(d -> d.getCity().equals("Berlin"))
                .flatMap(d -> d.getTasks().stream().filter(t -> !t.getStatus().equals(Status.DONE)))
                .toList();

        return listTasks;
    }

}

