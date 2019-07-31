package queue;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double cgpa;

    public Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }



    public int compare(Student o1, Student o2) {
        if (o1.getCgpa() > o2.getCgpa()) { return 1; }
        if (o1.getCgpa() < o2.getCgpa()) { return -1; }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.cgpa, cgpa) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cgpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getCgpa() > o.getCgpa()) {
            return -1;
        } else if (this.getCgpa() < o.getCgpa()) {
            return 1;
        } else {
            int num = this.getName().compareTo(o.getName());
            if (num==0) {
                if (this.getId() > o.getId()) {
                    return -1;
                } else if (this.getId() < o.getId()) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return num;
            }
        }
    }
}
