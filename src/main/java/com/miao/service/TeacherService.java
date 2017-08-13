package com.miao.service;

/**
 * Created by 10048 on 2017/8/10.
 */
public interface TeacherService {
    /**
     * 判断是否为合法老师，从而决定是否允许登录
     * @param teacherID
     * @param password
     * @return
     */
    public boolean allowLogin(String teacherID,String password);
}
