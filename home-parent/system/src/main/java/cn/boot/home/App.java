package cn.boot.home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "cn.boot.home.*")
@ComponentScan(basePackages = "cn.boot.home")
@ServletComponentScan // 过滤器注解
// @EnableCaching// 缓存注解
// @MapperScan("cn.boot.home.*.dao") // 扫描dao
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
