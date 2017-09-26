package cn.hj.sbootmybatis.controller;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hj.sbootmybatis.mapper.DepartmentMapper;
import cn.hj.sbootmybatis.po.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DepartmentController {

	@Autowired
	private DepartmentMapper departmentMapper;
	@Test
	public void testDepartment(){
		
		System.out.println(departmentMapper);
		Map<String, Object> map=null;
		Department department=null;
		//返回数据库字段
		System.out.println("返回数据库字段 用 as");
		map = departmentMapper.findById(1L);
		System.out.println(map);
		
		//返回实体类属性字段
		System.out.println("返回实体类属性");
		department = departmentMapper.findByIdObj(2L);
		if(null != department){
			System.out.println(department.toString());
		}else{
			System.out.println(department);
		}
		
		
	}
	
	
}
