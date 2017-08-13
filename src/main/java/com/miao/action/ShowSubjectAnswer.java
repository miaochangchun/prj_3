package com.miao.action;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.service.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 10048 on 2017/8/11.
 */
public class ShowSubjectAnswer extends ActionSupport {
    private SubjectService service = new SubjectServiceImpl();

    @Action(value = "showSubjectAnswer", results = {@Result(name = "success", location = "/student/showAnswer.jsp")})
    public String execute() throws Exception{
        List<Subject> subjects = new ArrayList<Subject>();
        HttpServletRequest request = ServletActionContext.getRequest();
        Map<String, Object> session = ActionContext.getContext().getSession();
        List<Integer> subjectIds = (List<Integer>) session.get("subjectIds");
        for (Integer subjectId : subjectIds) {
            Subject subject = service.showSubjectParticular(subjectId);
            subjects.add(subject);
        }
        request.setAttribute("subjects", subjects);
        return SUCCESS;
    }
}
