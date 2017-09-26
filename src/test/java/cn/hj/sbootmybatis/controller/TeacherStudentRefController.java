package cn.hj.sbootmybatis.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import cn.hj.sbootmybatis.mapper.TeacherStudentRefMapper;
import cn.hj.sbootmybatis.po.TeacherStudentRef;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TeacherStudentRefController {

	@Autowired
	private TeacherStudentRefMapper teacherStudentRefMapper;
	
	@Test
	public void test(){
		
		System.out.println(teacherStudentRefMapper);
		TeacherStudentRef record = new TeacherStudentRef();
		record.setTeacherId(1);
		record.setStudentId(17);
		int result = teacherStudentRefMapper.insertSelective(record);
		
		System.out.println("结果："+result);
		
	}
}
