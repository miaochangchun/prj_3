package com.miao.dao;

import com.miao.po.Subject;
import com.miao.util.Page;

import java.util.List;

/**
 * Created by 10048 on 2017/8/10.
 */
public interface SubjectDAO {
    /**
     * 保存方法，用来保存试题
     * @param subject
     */
    public void addSubject(Subject subject);

    /**
     * 根据试题标题查找试题
     * @param subjectTitle
     * @return
     */
    public Subject findSubjectByTitle(String subjectTitle);

    /**
     * 分页查询试题
     * @param page
     * @return
     */
    public List<Subject> findSubjectByPage(Page page);

    /**
     * 查询试题总量
     * @return
     */
    public int findSubjectCount();

    /**
     * 根据试题ID查找试题
     * @param subjectID
     * @return
     */
    public Subject findSubjectByID(int subjectID);

    /**
     * 更新方法，用来更新试题
     * @param subject
     */
    public void updateSubject(Subject subject);

    /**
     * 根据试题ID删除试题
     * @param subjectID
     */
    public void deleteSubject(Integer subjectID);

    /**
     * 根据试题标题模糊查询试题
     * @param subjectTitle
     * @param page
     * @return
     */
    public List<Subject> likeQueryByTitle(String subjectTitle, Page page);

    /**
     * 查询模糊记录数
     * @param subjectTitle
     * @return
     */
    public int findLinkQueryCount(String subjectTitle);

    /**
     * 随机取出记录
     * @param number
     * @return
     */
    public List<Subject> randomFindSubject(int number);
}
