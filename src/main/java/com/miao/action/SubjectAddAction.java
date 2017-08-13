package com.miao.action;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.service.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 10048 on 2017/8/12.
 */
public class SubjectAddAction extends ActionSupport {
    private String subjectTitle;
    private String subjectOptionA;
    private String subjectOptionB;
    private String subjectOptionC;
    private String subjectOptionD;
    private String subjectAnswer;
    private String subjectParse;

    private SubjectService service = new SubjectServiceImpl();

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public String getSubjectOptionA() {
        return subjectOptionA;
    }

    public void setSubjectOptionA(String subjectOptionA) {
        this.subjectOptionA = subjectOptionA;
    }

    public String getSubjectOptionB() {
        return subjectOptionB;
    }

    public void setSubjectOptionB(String subjectOptionB) {
        this.subjectOptionB = subjectOptionB;
    }

    public String getSubjectOptionC() {
        return subjectOptionC;
    }

    public void setSubjectOptionC(String subjectOptionC) {
        this.subjectOptionC = subjectOptionC;
    }

    public String getSubjectOptionD() {
        return subjectOptionD;
    }

    public void setSubjectOptionD(String subjectOptionD) {
        this.subjectOptionD = subjectOptionD;
    }

    public String getSubjectAnswer() {
        return subjectAnswer;
    }

    public void setSubjectAnswer(String subjectAnswer) {
        this.subjectAnswer = subjectAnswer;
    }

    public String getSubjectParse() {
        return subjectParse;
    }

    public void setSubjectParse(String subjectParse) {
        this.subjectParse = subjectParse;
    }

    @Override
    public String execute() throws Exception {
        Subject subject = new Subject();
        subject.setSubjectTitle(subjectTitle);
        subject.setSubjectOptionA(subjectOptionA);
        subject.setSubjectOptionB(subjectOptionB);
        subject.setSubjectOptionC(subjectOptionC);
        subject.setSubjectOptionD(subjectOptionD);
        subject.setSubjectAnswer(subjectAnswer);
        subject.setSubjectParse(subjectParse);
        if (service.saveSubject(subject)) {
            return SUCCESS;
        } else {
            this.addActionError("该试题已经添加过了，请不要重复添加！");
            return INPUT;
        }
    }
}
