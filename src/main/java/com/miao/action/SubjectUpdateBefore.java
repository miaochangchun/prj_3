package com.miao.action;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.service.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by 10048 on 2017/8/12.
 */
public class SubjectUpdateBefore extends ActionSupport {
    private int subjectId;

    private SubjectService service = new SubjectServiceImpl();

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    @Action(value = "subjectUpdateBefore", results = {@Result(name = "success", location = "/teacher/subjectUpdate.jsp")})
    public String execute() throws Exception {
        Subject subject = service.showSubjectParticular(subjectId);
        ServletActionContext.getRequest().setAttribute("subject", subject);
        this.addActionMessage("请编辑并提交！");
        return SUCCESS;
    }
}
