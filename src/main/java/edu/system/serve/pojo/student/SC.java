package edu.system.serve.pojo.student;

public class SC {
    private String sno;
    private String cno;
    private Integer grade;
    private Double gradepo;

    // 课程名
    private String cname;

    public SC(String sno, String cno, Integer grade, Double gradepo, String cname) {
        this.sno = sno;
        this.cno = cno;
        this.grade = grade;
        this.gradepo = gradepo;
        this.cname = cname;
    }

    public SC() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Double getGradepo() {
        return gradepo;
    }

    public void setGradepo(Double gradepo) {
        this.gradepo = gradepo;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "SC{" +
                "sno='" + sno + '\'' +
                ", cno='" + cno + '\'' +
                ", grade=" + grade +
                ", gradepo=" + gradepo +
                ", cname='" + cname + '\'' +
                '}';
    }
}
