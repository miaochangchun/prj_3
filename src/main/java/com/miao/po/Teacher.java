package com.miao.po;

/**
 * 教师类
 * Created by 10048 on 2017/8/10.
 */
public class Teacher {
    private String teacherID;
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
