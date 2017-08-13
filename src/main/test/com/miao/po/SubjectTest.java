package com.miao.po;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 10048 on 2017/8/10.
 */
public class SubjectTest {
    Session session = null;
    Transaction transaction = null;

    @Before
    public void setUp() throws Exception {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        session = sessionFactory.openSession();
    }

    @Test
    public void test() throws Exception{
        Subject subject = new Subject();
        subject.setSubjectAnswer("a");
        subject.setSubjectID(666);
        subject.setSubjectOptionA("guang");
        subject.setSubjectOptionB("dian");
        subject.setSubjectOptionC("huo");
        subject.setSubjectOptionD("leng");
        subject.setSubjectParse("the most invention?");
        subject.setSubjectTitle("hello");
        System.out.println(subject);

        transaction = session.beginTransaction();
        session.save(subject);
    }

    @After
    public void tearDown() throws Exception {
        transaction.commit();
    }

}