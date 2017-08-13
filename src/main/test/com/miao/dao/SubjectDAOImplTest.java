package com.miao.dao;

import com.miao.po.Subject;
import com.miao.util.Page;
import com.miao.util.PageUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 10048 on 2017/8/10.
 */
public class SubjectDAOImplTest {
    private SubjectDAO dao = null;
    @Before
    public void setUp() throws Exception {
        dao = new SubjectDAOImpl();
    }

    @Test
    public void addSubject() throws Exception {
        Subject subject = new Subject();
        subject.setSubjectTitle("the tommorw is ?");
        subject.setSubjectOptionA("Monday");
        subject.setSubjectOptionB("Tuesday");
        subject.setSubjectOptionC("Wednesday");
        subject.setSubjectOptionD("Thursday");
        subject.setSubjectParse("the tommow is Friday.");
        subject.setSubjectAnswer("d");
        System.out.println(subject);

        dao.addSubject(subject);
    }

    @Test
    public void findSubjectByTitle() throws Exception {
        Subject subject = dao.findSubjectByTitle("hello");
        System.out.println(subject);
    }

    @Test
    public void findSubjectByPage() throws Exception {
        Page page = PageUtil.createPage(3, dao.findSubjectCount(), 2);
        List<Subject> subjects = dao.findSubjectByPage(page);
        for(int i=0; i<subjects.size(); i++) {
            System.out.println(subjects.get(i));
        }
    }

    @Test
    public void findSubjectCount() throws Exception {
        int size = dao.findSubjectCount();
        System.out.println(size);
    }

    @Test
    public void findSubjectByID() throws Exception {
        Subject subject = dao.findSubjectByID(22);
        System.out.println(subject);
    }

    @Test
    public void updateSubject() throws Exception {
        Subject subject = new Subject();
        subject.setSubjectTitle("what the next day is");
        subject.setSubjectOptionA("Monday");
        subject.setSubjectOptionB("Tuesday");
        subject.setSubjectOptionC("Wednesday");
        subject.setSubjectOptionD("Thursday");
        subject.setSubjectParse("the tommow is Friday.");
        subject.setSubjectAnswer("d");
        subject.setSubjectID(31);

        dao.updateSubject(subject);
    }

    @Test
    public void deleteSubject() throws Exception {
        dao.deleteSubject(31);
    }

    @Test
    public void likeQueryByTitle() throws Exception {
        Page page = PageUtil.createPage(5, dao.findLinkQueryCount("w"), 1);
        List<Subject> subjects = dao.likeQueryByTitle("w", page);
        for(int i=0; i<subjects.size(); i++) {
            System.out.println(subjects.get(i));
        }
    }

    @Test
    public void findLinkQueryCount() throws Exception {
        int size = dao.findLinkQueryCount("w");
        System.out.println(size);
    }

    @Test
    public void randomFindSubject() throws Exception {
        List<Subject> subjects = dao.randomFindSubject(4);
        for(int i=0; i<subjects.size(); i++) {
            System.out.println(subjects.get(i));
        }
    }

}