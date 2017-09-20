package cn.hj.sbootmybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/home")
	public String home(){
		
		return "Hello World Controller";
	}
}
