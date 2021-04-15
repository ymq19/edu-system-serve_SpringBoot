package edu.system.serve.pojo.teacher;

import edu.system.serve.pojo.student.SC;
import io.swagger.annotations.ApiModel;

@ApiModel(description = "继承SC")
public class SCName extends SC {
    private String sname;

    public SCName(String sno, String cno, Integer grade, Double gradepo, String cname, Integer num, String sname) {
        super(sno, cno, grade, gradepo, cname, num);
        this.sname = sname;
    }

    public SCName(String cname) {
        this.sname = sname;
    }

    public SCName() {
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

}
