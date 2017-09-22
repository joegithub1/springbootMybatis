package cn.hj.sbootmybatis.mapper;

import java.util.Map;

import cn.hj.sbootmybatis.po.Department;

public interface DepartmentMapper {

	public Map<String, Object> findById(Long id);
	
	public Department findByIdObj(Long id);
}
