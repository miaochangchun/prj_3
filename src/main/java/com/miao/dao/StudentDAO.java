package com.miao.dao;

import com.miao.po.Student;

import java.util.List;

/**
 * Created by 10048 on 2017/8/10.
 */
public interface StudentDAO {
    /**
     * 查询方法，根据学生ID查询
     * @param studentID
     * @return
     */
    public Student findByStudentID(String studentID);

    /**
     * 更新学生信息
     * @param student
     */
    public void updateStudent(Student student);

    /**
     * 根据学生姓名查找学生
     * @param studentName
     * @return
     */
    public List<Student> findByStudentName(String studentName);

    /**
     * 根据班级查找学生
     * @param sclass
     * @return
     */
    public List<Student> findByStudentClass(String sclass);
}
