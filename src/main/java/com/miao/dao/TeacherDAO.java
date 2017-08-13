package com.miao.dao;

import com.miao.po.Teacher;

/**
 * Created by 10048 on 2017/8/10.
 */
public interface TeacherDAO {
    /**
     * 查询方法，根据教师ID查询
     * @param teacherID
     * @return
     */
    public Teacher findByTeacherID(String teacherID);
}
