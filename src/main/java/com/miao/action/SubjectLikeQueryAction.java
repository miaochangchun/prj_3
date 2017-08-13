package com.miao.action;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.service.SubjectServiceImpl;
import com.miao.util.Page;
import com.miao.util.PageResult;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 10048 on 2017/8/12.
 */
public class SubjectLikeQueryAction extends ActionSupport {
    private String subjectTitle;
    private int currentPage;

    private SubjectService service = new SubjectServiceImpl();

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String execute() throws Exception {
        Page page = new Page();
        page.setEveryPage(10);//每页显示10条记录
        page.setCurrentPage(currentPage);//设置当前页
        PageResult pageResult = service.likeQueryBySubjectTitle(subjectTitle, page);
        List<Subject> subjects = pageResult.getList();
        List<Subject> newSubjects = new ArrayList<Subject>();
        //给关键字标红
        for(Subject subject : subjects) {
            String newTitle = subject.getSubjectTitle().replaceAll(subjectTitle,
                    "<font color='red'>" + subjectTitle + "</font>");
            subject.setSubjectTitle(newTitle);
            newSubjects.add(subject);
        }

        page = pageResult.getPage();
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("subjects", newSubjects);
        request.setAttribute("page", page);
        return SUCCESS;
    }
}
