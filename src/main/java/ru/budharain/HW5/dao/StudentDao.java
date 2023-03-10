package ru.budharain.HW5.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ru.budharain.HW5.model.Student;

import java.util.List;

public class StudentDao implements StudentDaoInterface<Student,Long> {
    private Session currentSession;
    private Transaction currentTransaction;


    public Session openCurrentSession(){
        currentSession =getSessionFactory().openSession();
        return currentSession;
    }
    public Session openCurrentSessionWithTransaction(){
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }
    public void closeCurrentSession(){
        currentSession.close();
    }
    public void closeCurrentSessionWithTransaction(){
        currentTransaction.commit();
        currentSession.close();
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    private static SessionFactory getSessionFactory(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory;
    }
    public StudentDao() {
    }

    @Override
    public void persist(Student entity){
        getCurrentSession().save(entity);
    }
    @Override
    public void update(Student entity){
        getCurrentSession().update(entity);
    }
    @Override
    public Student findById(Long id){
        Student student = (Student) getCurrentSession().get(Student.class, id);
        return student;
    }

    @Override
    public void delete(Student entity) {
        getCurrentSession().delete(entity);
    }

    @Override
    public List<Student> findAll() {
        List<Student> students =(List<Student>) getCurrentSession().createQuery("from Student ").list();
        return students;
    }

}
