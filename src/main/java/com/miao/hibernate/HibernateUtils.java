package com.miao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate工具类
 * Created by 10048 on 2017/8/10.
 */
public class HibernateUtils {
    //1.创建工厂对象
    private static SessionFactory sessionFactory;

    //2.初始化工厂对象
    static {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    //3.获得Session
    public static Session getSession(){
        return sessionFactory.openSession();
    }
}
