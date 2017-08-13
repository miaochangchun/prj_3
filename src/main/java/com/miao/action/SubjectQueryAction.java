package com.miao.action;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.service.SubjectServiceImpl;
import com.miao.util.Page;
import com.miao.util.PageResult;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 10048 on 2017/8/12.
 */
public class SubjectQueryAction extends ActionSupport {
    private int currentPage;
    private SubjectService service = new SubjectServiceImpl();

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    @Action(value = "subjectQuery", results = {@Result(name = "success", location = "/teacher/subjectManage.jsp")})
    public String execute() throws Exception {
        Page page = new Page();
        page.setEveryPage(10);
        page.setCurrentPage(currentPage);
        PageResult pageResult = service.querySubjectByPage(page);
        List<Subject> subjects = pageResult.getList();
        page = pageResult.getPage();
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("subjects", subjects);
        request.setAttribute("page", page);
        return SUCCESS;
    }
}
