package com.miao.po;

/**
 * 学生表,保存学生编号，系统密码
 * Created by 10048 on 2017/8/10.
 */
public class Student {
    private String studentID;
    private String password;
    private String studentName;
    private Integer result;
    private String sclass;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", password='" + password + '\'' +
                ", studentName='" + studentName + '\'' +
                ", result=" + result +
                ", sclass='" + sclass + '\'' +
                '}';
    }
}
