package com.miao.action;

import com.miao.po.Student;
import com.miao.po.Teacher;
import com.miao.service.StudentService;
import com.miao.service.StudentServiceImpl;
import com.miao.service.TeacherService;
import com.miao.service.TeacherServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by 10048 on 2017/8/11.
 */
public class LoginAction extends ActionSupport{
    private String id;
    private String password;
    private String role;
    private StudentService studentService = new StudentServiceImpl();
    private TeacherService teacherService = new TeacherServiceImpl();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String execute() throws Exception{
        if ("student".equals(role)) {
            if (studentService.allowLogin(id, password)) {
                Student studentInfo = studentService.getStudentInfo(id);
                Map session = ActionContext.getContext().getSession();
                session.put("studentInfo", studentInfo);
                return "studentSuccess";
            } else {
                addActionError("该学生编号不存在或者密码错误");
                return this.INPUT;
            }
        } else {
            if (teacherService.allowLogin(id, password)) {
                return "teacherSuccess";
            } else {
                addActionError("该教师编号不存在或者密码错误");
                return this.INPUT;
            }
        }
    }
}
