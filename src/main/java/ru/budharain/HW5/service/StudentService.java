package ru.budharain.HW5.service;

import ru.budharain.HW5.model.Student;
import ru.budharain.HW5.dao.StudentDao;

import java.util.List;

public class StudentService {
    private static StudentDao studentDao;

    public StudentService() {
        studentDao = new StudentDao();
    }
    public void persist(Student entity){
        studentDao.openCurrentSessionWithTransaction();
        studentDao.persist(entity);
        studentDao.closeCurrentSessionWithTransaction();
    }
    public Student findById(Long id) {
        studentDao.openCurrentSession();
        Student student = studentDao.findById(id);
        studentDao.closeCurrentSession();
        return student;
    }
    public void delete(Long id) {
        studentDao.openCurrentSessionWithTransaction();
        Student student = studentDao.findById(id);
        studentDao.delete(student);
        studentDao.closeCurrentSessionWithTransaction();
    }
    public void update(Student student) {
        studentDao.openCurrentSessionWithTransaction();
        studentDao.update(student);
        studentDao.closeCurrentSessionWithTransaction();
    }
    public List<Student> findAll() {
        studentDao.openCurrentSession();
        List<Student> students = studentDao.findAll();
        studentDao.closeCurrentSession();
        return students;
    }
    public StudentDao studentDao(){
        return studentDao;
    }
    public void persistAll(List<Student> list) {
        studentDao.openCurrentSessionWithTransaction();
        for (Student student : list) {
            studentDao.persist(student);
        }
        studentDao.closeCurrentSessionWithTransaction();
    }
}
