package com.miao.action;

import com.miao.po.Student;
import com.miao.service.StudentService;
import com.miao.service.StudentServiceImpl;
import com.miao.service.SubjectService;
import com.miao.service.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 10048 on 2017/8/11.
 */
public class SubmitExamAction extends ActionSupport {
    private List<Integer> subjectId = new ArrayList<Integer>();        //考试题目
    private SubjectService subjectService = new SubjectServiceImpl();
    private StudentService studentService = new StudentServiceImpl();

    public List<Integer> getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(List<Integer> subjectId) {
        this.subjectId = subjectId;
    }

    public String execute() throws Exception{
        HttpServletRequest request = ServletActionContext.getRequest();
        List<String> studentAnswers = new ArrayList<String>();
        for(int i=0; i<20; i++) {
            String answer = request.getParameter("subjectAnswer" + i);
            studentAnswers.add(answer);

            Integer integer = Integer.valueOf(request.getParameter("subjectID" + i));
            subjectId.add(integer);
        }
        int generalPoint = subjectService.accountResult(subjectId, studentAnswers);

        Map<String, Object> session = ActionContext.getContext().getSession();
        Student student = (Student) session.get("studentInfo");
        String studentId = student.getStudentID();
        studentService.setStudentResult(studentId, generalPoint);
        request.setAttribute("studentName", student.getStudentName());
        request.setAttribute("generalPoint", generalPoint);
        session.put("subjectIds", subjectId);   //将试题保存到session中
        return SUCCESS;
    }


}
