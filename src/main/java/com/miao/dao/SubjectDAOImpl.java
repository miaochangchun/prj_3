package com.miao.dao;

import com.miao.hibernate.HibernateUtils;
import com.miao.po.Student;
import com.miao.po.Subject;
import com.miao.util.Page;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by 10048 on 2017/8/10.
 */
public class SubjectDAOImpl implements SubjectDAO {
    public void addSubject(Subject subject) {
        Session session = HibernateUtils.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(subject);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        session.close();

    }

    public Subject findSubjectByTitle(String subjectTitle) {
        Session session = HibernateUtils.getSession();
        Subject subject = (Subject) session.createQuery("from Subject as sub where sub.subjectTitle = ?").setParameter(0, subjectTitle).uniqueResult();
        session.close();
        return subject;
    }

    public List<Subject> findSubjectByPage(Page page) {
        Session session = HibernateUtils.getSession();
        List<Subject> subjects = session.createQuery("from Subject").setMaxResults(page.getEveryPage()).setFirstResult(page.getBeginIndex()).list();
        session.close();
        return subjects;
    }

    public int findSubjectCount() {
        Session session = HibernateUtils.getSession();
        int size = session.createQuery("from Subject ").list().size();
        session.close();
        return size;
    }

    public Subject findSubjectByID(int subjectID) {
        Session session = HibernateUtils.getSession();
        Subject subject = (Subject) session.get(Subject.class, subjectID);
        session.close();
        return subject;
    }

    public void updateSubject(Subject subject) {
        Session session = HibernateUtils.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(subject);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        session.close();
    }

    public void deleteSubject(Integer subjectID) {
        Session session = HibernateUtils.getSession();
        Subject subject = (Subject) session.get(Subject.class, subjectID);
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(subject);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        session.close();
    }

    public List<Subject> likeQueryByTitle(String subjectTitle, Page page) {
        Session session = HibernateUtils.getSession();
        List<Subject> subjects = session.createQuery("from Subject as sub where sub.subjectTitle like ?")
                .setParameter(0, "%" + subjectTitle + "%")
                .setMaxResults(page.getEveryPage()).setFirstResult(page.getBeginIndex()).list();
        session.close();
        return subjects;
    }

    public int findLinkQueryCount(String subjectTitle) {
        Session session = HibernateUtils.getSession();
        int size = session.createQuery("from Subject as sub where sub.subjectTitle like ?").setParameter(0, "%" + subjectTitle + "%")
                .list().size();
        session.close();
        return size;
    }

    public List<Subject> randomFindSubject(int number) {
        Session session = HibernateUtils.getSession();
        List<Subject> subjects = session.createQuery("from Subject as sub order by rand()").setMaxResults(number).list();
        session.close();
        return subjects;
    }
}
