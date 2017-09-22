package cn.hj.sbootmybatis.controller;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

import cn.hj.sbootmybatis.mapper.TeacherMapper;
import cn.hj.sbootmybatis.po.Tearcher;
import cn.hj.sbootmybatis.po.TempTeacher;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ComponentScan
@MapperScan("cn.hj.sbootmybatis.mapper")
public class TearcherController {

	@Autowired
	private TeacherMapper teacherMapper;
	
	@Test
	public void test(){
		
		System.out.println(teacherMapper);
		Tearcher tearcher = null;
		TempTeacher tempTeacher = null;
		Map<String, String> map=null;
		/*map = teacherMapper.getById(1L);
		if(null != map){
			System.out.println(map);
			
		}else{
			System.out.println("is null");
		}*/
		//数据库字段与实体类字段没有对应上所以查询不出来
		 tearcher = teacherMapper.getById(1L);
		 System.out.println("t:"+tearcher);
		
		 
		 tempTeacher = teacherMapper.getByTid(1L);
		 System.out.println("temp:"+tempTeacher.toString());
		 
		 
	}
}
