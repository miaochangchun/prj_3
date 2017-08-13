package com.miao.service;

import com.miao.dao.SubjectDAO;
import com.miao.dao.SubjectDAOImpl;
import com.miao.po.Subject;
import com.miao.util.Page;
import com.miao.util.PageResult;
import com.miao.util.PageUtil;

import java.util.List;

/**
 * Created by 10048 on 2017/8/10.
 */
public class SubjectServiceImpl implements SubjectService {
    private SubjectDAO dao = new SubjectDAOImpl();

    public boolean saveSubject(Subject subject) {
        String subjectTitle = subject.getSubjectTitle();
        if (dao.findSubjectByTitle(subjectTitle) == null) {
            dao.addSubject(subject);
            return true;
        }
        return false;
    }

    public PageResult querySubjectByPage(Page page) {
        page = PageUtil.createPage(page.getEveryPage(), dao.findSubjectCount(), page.getCurrentPage());
        List<Subject> subjects = dao.findSubjectByPage(page);
        PageResult result = new PageResult(page, subjects);
        return result;
    }

    public Subject showSubjectParticular(int subjectID) {
        return dao.findSubjectByID(subjectID);
    }

    public void updateSubject(Subject subject) {
        dao.updateSubject(subject);
    }

    public void deleteSubject(int subjectID) {
        dao.deleteSubject(subjectID);
    }

    public PageResult likeQueryBySubjectTitle(String subjectTitle, Page page) {
        page = PageUtil.createPage(page.getEveryPage(), dao.findLinkQueryCount(subjectTitle), page.getCurrentPage());
        List<Subject> subjects = dao.likeQueryByTitle(subjectTitle, page);
        PageResult result = new PageResult(page, subjects);
        return result;
    }

    public List<Subject> randomFindSubject(int number) {
        return dao.randomFindSubject(number);
    }

    public int accountResult(List<Integer> subjectIDs, List<String> studentAnswers) {
        int sum = 0;
        for(int i=0; i<subjectIDs.size(); i++) {
            String rightAnswer = dao.findSubjectByID(subjectIDs.get(i)).getSubjectAnswer();
            if (rightAnswer.equals(studentAnswers.get(i))) {
                sum += 5;
            }
        }
        return sum;
    }
}
