package edu.system.serve.pojo.student;

import edu.system.serve.pojo.teacher.Teacher;
import io.swagger.annotations.ApiModel;

@ApiModel(description = "课程信息")
public class Course {
    private String cno;
    private String cname;
    private String cpno;
    private String prename;
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

    public Course(String cno, String cname, String cpno, String prename, Integer ccredit, String tno, Integer capacity) {
        this.cno = cno;
        this.cname = cname;
        this.cpno = cpno;
        this.prename = prename;
        this.ccredit = ccredit;
        this.tno = tno;
        this.capacity = capacity;
    }

    public Course(String cno, String cname, String cpno, Integer ccredit, String tno, Integer capacity) {
        this.cno = cno;
        this.cname = cname;
        this.cpno = cpno;
        this.ccredit = ccredit;
        this.tno = tno;
        this.capacity = capacity;
    }

    public String getCpno() {
        return cpno;
    }

    public void setCpno(String cpno) {
        this.cpno = cpno;
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

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
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

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", cpno='" + cpno + '\'' +
                ", prename='" + prename + '\'' +
                ", ccredit=" + ccredit +
                ", tno='" + tno + '\'' +
                ", capacity=" + capacity +
                ", teacher=" + teacher +
                '}';
    }
}
