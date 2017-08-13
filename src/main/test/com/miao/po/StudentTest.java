package com.miao.po;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 10048 on 2017/8/10.
 */
public class StudentTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("66666666");
    }

    @Test
    public void test() throws Exception{
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = new Student();
        student.setPassword("qwert13245");
        student.setResult(66);
        student.setSclass("22");
        student.setStudentID("8880");
        student.setStudentName("changchun");
        System.out.println(student);

        session.save(student);

        transaction.commit();
    }

    @After
    public void tearDown() throws Exception {

    }

}