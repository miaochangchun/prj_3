package com.miao.action;

import com.miao.po.Student;
import com.miao.service.StudentService;
import com.miao.service.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import java.util.List;

/**
 * Created by 10048 on 2017/8/13.
 */
public class QueryStudentByClassAction extends ActionSupport {
    private String sclass;

    private StudentService service = new StudentServiceImpl();

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    @Override
    @Action(value = "queryStudentByClass", results = {@Result(name = "success", location = "/teacher/studentManage.jsp")})
    public String execute() throws Exception {
        List<Student> students = service.getStudentByClass(sclass);
        ServletActionContext.getRequest().setAttribute("students", students);
        return SUCCESS;
    }
}
