package com.bjpowernode.domain;

import java.util.Objects;

public class MyStudent {
    private Integer stuid;
    private String stuname;
    private String stuemail;
    private Integer stuage;

    public MyStudent() {
    }

    public MyStudent(Integer stuid, String stuname, String stuemail, Integer stuage) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stuemail = stuemail;
        this.stuage = stuage;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuemail() {
        return stuemail;
    }

    public void setStuemail(String stuemail) {
        this.stuemail = stuemail;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stuemail='" + stuemail + '\'' +
                ", stuage=" + stuage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStudent myStudent = (MyStudent) o;
        return Objects.equals(stuid, myStudent.stuid) && Objects.equals(stuname, myStudent.stuname) && Objects.equals(stuemail, myStudent.stuemail) && Objects.equals(stuage, myStudent.stuage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuid, stuname, stuemail, stuage);
    }
}
