package edu.system.serve.pojo.student;

import edu.system.serve.pojo.teacher.Teacher;

/**
 * 学生实体类
 */
public class Student {
    private String sno;
    private String sname;
    private String sex;
    private Integer sage;
    private String admi_date;
    private String school;
    private String sdept;
    private String email;
    private String tel;
    private String hobby;
    private String intro;

    public Student(String sno, String sname, String sex, Integer sage, String admi_date, String school, String sdept, String email, String tel, String hobby, String intro) {
        this.sno = sno;
        this.sname = sname;
        this.sex = sex;
        this.sage = sage;
        this.admi_date = admi_date;
        this.school = school;
        this.sdept = sdept;
        this.email = email;
        this.tel = tel;
        this.hobby = hobby;
        this.intro = intro;
    }

    public Student() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getAdmi_date() {
        return admi_date;
    }

    public void setAdmi_date(String admi_date) {
        this.admi_date = admi_date;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", sage=" + sage +
                ", admi_date='" + admi_date + '\'' +
                ", school='" + school + '\'' +
                ", sdept='" + sdept + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", hobby='" + hobby + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }

}
