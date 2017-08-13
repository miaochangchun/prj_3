package com.miao.action;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.service.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 10048 on 2017/8/11.
 */
public class GetRandomSubject extends ActionSupport{
    private SubjectService service = new SubjectServiceImpl();

    public String execute() throws Exception{
        List<Subject> subjects = service.randomFindSubject(20);
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("subjects", subjects);
        return SUCCESS;
    }
}
