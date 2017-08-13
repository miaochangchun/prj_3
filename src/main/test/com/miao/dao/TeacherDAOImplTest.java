package com.miao.dao;

import com.miao.po.Teacher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 10048 on 2017/8/10.
 */
public class TeacherDAOImplTest {
    private TeacherDAO dao = null;
    @Before
    public void setUp() throws Exception {
        dao = new TeacherDAOImpl();
    }

    @Test
    public void findByTeacherID() throws Exception {
        Teacher teacher = dao.findByTeacherID("teacher");
        System.out.println(teacher);
    }

}