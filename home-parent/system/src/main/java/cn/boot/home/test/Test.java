package cn.boot.home.test;

import java.lang.reflect.Method;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
