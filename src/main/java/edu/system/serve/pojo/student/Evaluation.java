package edu.system.serve.pojo.student;

public class Evaluation {
    // 课程号
    private String cno;
    // 课程名
    private String cname;
    // 教师编号
    private String tno;
    // 教师名
    private String teacher;
    // 评价
    private String evaluation;

    public Evaluation(String cno, String cname, String tno, String teacher, String evaluation) {
        this.cno = cno;
        this.cname = cname;
        this.tno = tno;
        this.teacher = teacher;
        this.evaluation = evaluation;
    }

    public Evaluation() {
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

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getEvaluation() {
        return evaluation;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", tno='" + tno + '\'' +
                ", teacher='" + teacher + '\'' +
                ", evaluation='" + evaluation + '\'' +
                '}';
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }
}
