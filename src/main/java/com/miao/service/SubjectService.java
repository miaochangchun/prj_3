package com.miao.service;

import com.miao.po.Subject;
import com.miao.util.Page;
import com.miao.util.PageResult;

import java.util.List;

/**
 * Created by 10048 on 2017/8/10.
 */
public interface SubjectService {
    /**
     * 添加试题，首先判断该试题标题是否已经存在，如果已经则不能添加
     * @param subject
     * @return
     */
    public boolean saveSubject(Subject subject);

    /**
     * 按分页信息查询试题
     * @param page
     * @return
     */
    public PageResult querySubjectByPage(Page page);

    /**
     * 查看试题详细信息
     * @param subjectID
     * @return
     */
    public Subject showSubjectParticular(int subjectID);

    /**
     * 更新试题信息
     * @param subject
     */
    public void updateSubject(Subject subject);

    /**
     * 删除试题信息
     * @param subjectID
     */
    public void deleteSubject(int subjectID);

    /**
     * 模糊查询试题信息
     * @param subjectTitle
     * @param page
     * @return
     */
    public PageResult likeQueryBySubjectTitle(String subjectTitle,Page page);

    /**
     * 随机查询试题记录
     * @param number
     * @return
     */
    public List<Subject> randomFindSubject(int number);

    /**
     * 计算学生得分
     * @param subjectIDs
     * @param studentAnswers
     * @return
     */
    public int accountResult(List<Integer> subjectIDs,List<String> studentAnswers);
}
