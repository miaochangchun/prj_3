package com.miao.action;

import com.miao.service.SubjectService;
import com.miao.service.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 10048 on 2017/8/12.
 */
public class SubjectDeleteAction extends ActionSupport {
    private int subjectId;
    private SubjectService service = new SubjectServiceImpl();

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("subjectId=" + subjectId);
        service.deleteSubject(subjectId);
        return SUCCESS;
    }
}
