package com.miao.dao;

import com.miao.po.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 10048 on 2017/8/10.
 */
public class StudentDAOImplTest {
    private StudentDAO dao = null;

    @Before
    public void setUp() throws Exception {
        dao = new StudentDAOImpl();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void findByStudentID() throws Exception {
        Student student = dao.findByStudentID("123");
        System.out.println(student);
    }

    @Test
    public void updateStudent() throws Exception {
        Student student = new Student();
        student.setStudentName("xiaoming");
        student.setStudentID("123");
        student.setSclass("0509301");
        student.setPassword("666666");
        dao.updateStudent(student);
    }

    @Test
    public void findByStudentName() throws Exception {
        List<Student> students = dao.findByStudentName("xiaoming");

        for (int i=0; i<students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }

    @Test
    public void findByStudentClass() throws Exception {
        List<Student> students = dao.findByStudentClass("0509301");
        for (int i=0; i<students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }

}