package edu.system.serve.pojo.teacher;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "教师用户信息")
public class Teacher {
    private String tno;
    private String name;
    private String sex;
    private Integer age;
    private String email;
    private String tel;
    private String intro;

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tno='" + tno + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Teacher(String tno, String name, String sex, Integer age, String email, String tel, String intro) {
        this.tno = tno;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.tel = tel;
        this.intro = intro;
    }
}
