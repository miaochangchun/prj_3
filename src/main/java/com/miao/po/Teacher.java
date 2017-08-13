package com.miao.po;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 教师类
 * Created by 10048 on 2017/8/10.
 */
@Entity
@Table(name = "tb_teacher")
public class Teacher implements Serializable{
    @Id@GeneratedValue(generator = "teacherID")
    @GenericGenerator(name = "teacherID", strategy = "assigned")
    private String teacherID;
    @Column(name = "password")
    private String password;

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
