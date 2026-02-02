
package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public boolean addStudent(Student s) {


        for (Student st : students) {
            if (st.getId() == s.getId()) {
                System.out.println("Student with this ID already exists!");
                return false;
            }
        }

        students.add(s);
        System.out.println("Student added successfully");
        return true;
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student searchById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void deleteStudent(int id) {
        Student s = searchById(id);
        if (s == null) {
            System.out.println("Student not found");
            return;
        }
        students.remove(s);
        System.out.println("Student deleted successfully");
    }
}
