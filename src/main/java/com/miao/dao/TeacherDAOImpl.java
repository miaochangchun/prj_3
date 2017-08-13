package com.miao.dao;

import com.miao.hibernate.HibernateUtils;
import com.miao.po.Teacher;
import org.hibernate.Session;

/**
 * Created by 10048 on 2017/8/10.
 */
public class TeacherDAOImpl implements TeacherDAO {
    public Teacher findByTeacherID(String teacherID) {
        Session session = HibernateUtils.getSession();
        Teacher teacher = (Teacher) session.get(Teacher.class, teacherID);
        session.close();
        return teacher;
    }
}
