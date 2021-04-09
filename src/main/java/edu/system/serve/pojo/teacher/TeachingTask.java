package edu.system.serve.pojo.teacher;

public class TeachingTask {
    private String tno;
    private String cno;
    private String title;
    private String content;
    private String time;

    public TeachingTask(String tno, String cno, String title, String content, String time) {
        this.tno = tno;
        this.cno = cno;
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public TeachingTask() {
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TeachingTask{" +
                "tno='" + tno + '\'' +
                ", cno='" + cno + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
