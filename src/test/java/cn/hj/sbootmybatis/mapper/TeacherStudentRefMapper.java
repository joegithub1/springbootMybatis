package cn.hj.sbootmybatis.mapper;

import cn.hj.sbootmybatis.po.TeacherStudentRef;
import cn.hj.sbootmybatis.po.TeacherStudentRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherStudentRefMapper {
    int countByExample(TeacherStudentRefExample example);

    int deleteByExample(TeacherStudentRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherStudentRef record);

    int insertSelective(TeacherStudentRef record);

    List<TeacherStudentRef> selectByExample(TeacherStudentRefExample example);

    TeacherStudentRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeacherStudentRef record, @Param("example") TeacherStudentRefExample example);

    int updateByExample(@Param("record") TeacherStudentRef record, @Param("example") TeacherStudentRefExample example);

    int updateByPrimaryKeySelective(TeacherStudentRef record);

    int updateByPrimaryKey(TeacherStudentRef record);
}