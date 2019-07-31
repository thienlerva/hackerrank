package queue;

import javafx.scene.layout.Priority;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Priorities {

    public static void main(String[] args) {

        List<String> events = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student: ");
        String input = scan.nextLine();
        while (!input.equalsIgnoreCase("Q")) {
            events.add(input);
            System.out.println("Enter event: ");
            input = scan.nextLine();
        }

        Priorities priority = new Priorities();
        System.out.println(priority.getStudents(events));
    }

    List<Student> students;
    PriorityQueue<Student> priorityQueue;

    public Priorities() {
        this.priorityQueue = new PriorityQueue<>();
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents(List<String> events) {
        //Scanner scan = new Scanner(System.in);

        while (events.size() > 0) {

            String line = events.remove(0);
            if (line.contains("ENTER")) {
                String[] input = line.split(" ");
                Student student = new Student(input[1], Double.valueOf(input[2]), Integer.valueOf(input[3]));

                priorityQueue.add(student);
            } else {
                if (priorityQueue.size() > 0) {
                    Student student = priorityQueue.remove();

                }
            }
        }

        while (priorityQueue.size() > 0) {
            students.add(priorityQueue.remove());
        }
        return students;
    }
}
