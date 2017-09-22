package cn.hj.sbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan("cn.hj.sbootmybatis.mapper")
public class ApplicationMain {

	
	public static void main(String[] args) {
		
		SpringApplication.run(ApplicationMain.class, args);
		
	}
}
