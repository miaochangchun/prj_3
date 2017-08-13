package com.miao.service;

import com.miao.po.Student;

import java.util.List;

/**
 * Created by 10048 on 2017/8/10.
 */
public interface StudentService {
    /**
     * 判断是否为合法学生，从而决定是否允许登录
     * @param studentID 学生的id
     * @param password  密码
     * @return
     */
    public boolean allowLogin(String studentID,String password);

    /**
     * 获得学生信息
     * @param studentID 学生的id
     * @return
     */
    public Student getStudentInfo(String studentID);

    /**
     * 设置学生成绩
     * @param studentID 学生的id
     * @param result    考试成绩
     */
    public void setStudentResult(String studentID,int result);

    /**
     * 根据学生姓名查找学生
     * @param studentName   学生姓名
     * @return
     */
    public List<Student> getStudentByName(String studentName);

    /**
     * 根据班级查找学生
     * @param sclass    班级
     * @return
     */
    public List<Student> getStudentByClass(String sclass);
}
