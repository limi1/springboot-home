package cn.boot.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "cn.boot.home.*")
@ComponentScan(basePackages = "cn.boot.home") // 扫描指定包内的注解；
@ServletComponentScan // 过滤器注解
//@EnableCaching// 开启缓存注解（也就是说使项目内部的缓存相关的注解生效）
// @MapperScan("cn.boot.home.*.dao") // 扫描dao
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
