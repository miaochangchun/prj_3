package com.miao.service;

import com.miao.dao.TeacherDAO;
import com.miao.dao.TeacherDAOImpl;
import com.miao.po.Teacher;

/**
 * Created by 10048 on 2017/8/11.
 */
public class TeacherServiceImpl implements TeacherService {
    private TeacherDAO dao = new TeacherDAOImpl();

    public boolean allowLogin(String teacherID, String password) {
        Teacher teacher = dao.findByTeacherID(teacherID);
        if (teacher == null) {
            return false;
        } else {
            if (teacher.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
