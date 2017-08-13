package com.miao.dao;

import com.miao.hibernate.HibernateUtils;
import com.miao.po.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by 10048 on 2017/8/10.
 */
public class StudentDAOImpl implements StudentDAO {
    public Student findByStudentID(String studentID) {
        Session session = HibernateUtils.getSession();
        Student student = (Student) session.get(Student.class, studentID);
        session.close();
        return student;
    }

    public void updateStudent(Student student) {
        Session session = HibernateUtils.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(student);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        session.close();
    }

    public List<Student> findByStudentName(String studentName) {
        Session session = HibernateUtils.getSession();
        List<Student> students = session.createQuery("from Student as stu where stu.studentName = ?").setParameter(0, studentName).list();
        session.close();
        return students;
    }

    public List<Student> findByStudentClass(String sclass) {
        Session session = HibernateUtils.getSession();
        List<Student> students = session.createQuery("from Student as stu where stu.sclass = ?").setParameter(0, sclass).list();
        session.close();
        return students;
    }
}
