package com.fcjy.mybatis;

public class Teacher {

    private String t;
    private String tname;

    @Override
    public String toString() {
        return "Teacher{" +
                "t='" + t + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
