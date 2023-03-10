package ru.budharain.HW5;

import ru.budharain.HW5.model.Student;
import ru.budharain.HW5.service.StudentService;
import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            students.add(new Student("Student"+i,i));
        }
        studentService.persistAll(students);
        List<Student> student1= studentService.findAll();
        for (Student s: student1){
            System.out.println(s.toString());
        }
        studentService.delete(1000L);
        System.out.println(studentService.findById(1000L));

        studentService.persist(new Student("Joe",5));

        List<Student> studentsList = studentService.findAll();
        Student student = studentsList.get(1);
        student.setName("Boby");
        studentService.update(student);
        System.out.println(studentService.findById(1L));





    }
}
