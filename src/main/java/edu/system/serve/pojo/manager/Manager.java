package edu.system.serve.pojo.manager;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "管理员用户信息")
public class Manager {
    private String mno;
    private String name;
    private String sex;
    private Integer age;
    private String email;
    private String tel;
    private String intro;

    public Manager() {
    }

    public Manager(String mno, String name, String sex, Integer age, String email, String tel, String intro) {
        this.mno = mno;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.tel = tel;
        this.intro = intro;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
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
}
