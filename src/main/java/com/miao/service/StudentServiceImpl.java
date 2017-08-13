package com.miao.service;

import com.miao.dao.StudentDAO;
import com.miao.dao.StudentDAOImpl;
import com.miao.po.Student;

import java.util.List;

/**
 * Created by 10048 on 2017/8/10.
 */
public class StudentServiceImpl implements StudentService {
    private StudentDAO dao = new StudentDAOImpl();

    public boolean allowLogin(String studentID, String password) {
        Student student = dao.findByStudentID(studentID);
        if (student == null) {
            return false;
        } else {
            if (password.equals(student.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }

    public Student getStudentInfo(String studentID) {
        return dao.findByStudentID(studentID);
    }

    public void setStudentResult(String studentID, int result) {
        Student student = dao.findByStudentID(studentID);
        student.setResult(result);
        dao.updateStudent(student);
    }

    public List<Student> getStudentByName(String studentName) {
        return dao.findByStudentName(studentName);
    }

    public List<Student> getStudentByClass(String sclass) {
        return dao.findByStudentClass(sclass);
    }
}
