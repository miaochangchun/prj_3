package com.miao.action;

import com.miao.po.Student;
import com.miao.service.StudentService;
import com.miao.service.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 10048 on 2017/8/13.
 */
public class QueryStudentByNameAction extends ActionSupport {
    private String studentName;
    private StudentService service = new StudentServiceImpl();

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        List<Student> students = service.getStudentByName(studentName);
        request.setAttribute("students", students);
        return SUCCESS;
    }
}
