package model;

public class Student {

    private int id;
    private String name;
    private String course;
    private int marks;

    public Student(int id, String name, String course, int marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + course + " | " + marks;
    }
}


