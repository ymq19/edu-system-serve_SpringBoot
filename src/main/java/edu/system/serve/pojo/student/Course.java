package edu.system.serve.pojo.student;

import edu.system.serve.pojo.teacher.Teacher;

public class Course {
    private String cno;
    private String cname;
    private String cpno;
    private Integer ccredit;
    private String tno;
    private Integer capacity;
    private Teacher teacher;

    public Course() {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course(String cno, String cname, String cpno, Integer ccredit, String tno, Integer capacity) {
        this.cno = cno;
        this.cname = cname;
        this.cpno = cpno;
        this.ccredit = ccredit;
        this.tno = tno;
        this.capacity = capacity;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpno() {
        return cpno;
    }

    public void setCpno(String cpno) {
        this.cpno = cpno;
    }

    public Integer getCcredit() {
        return ccredit;
    }

    public void setCcredit(Integer ccredit) {
        this.ccredit = ccredit;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", cpno='" + cpno + '\'' +
                ", ccredit=" + ccredit +
                ", tno='" + tno + '\'' +
                ", capacity=" + capacity +
                ", teacher=" + teacher +
                '}';
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
