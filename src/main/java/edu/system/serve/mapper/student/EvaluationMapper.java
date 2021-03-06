package edu.system.serve.mapper.student;

import edu.system.serve.pojo.student.Evaluation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EvaluationMapper {
    List<Evaluation> getEvaluation(String sno);
    void setEvaluation(String sno, String tno, String evaluation);
}
