package cn.hj.sbootmybatis.mapper;



import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.hj.sbootmybatis.po.Tearcher;
import cn.hj.sbootmybatis.po.TempTeacher;

/**
* Title: TeacherMapper
* Description: 数据库字段一定要对应上实体属性
* @author HuangJian
* @date 2017年9月21日
*
*/
@Mapper
public interface TeacherMapper {

	@Select("select t_id as id,t_name as name,t_age as age from t_tearcher where t_id=#{id}")
	//@Select("select * from Tearcher where id=#{id}")
	Tearcher getById(Long id);
	
	@Select("select * from t_tearcher where t_id=#{id}")
	TempTeacher getByTid(Long id);
	
}
