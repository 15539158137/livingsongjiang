package com.dxxx.livingsongjiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LivingsongjiangApplication  {

	public static void main(String[] args) {
		SpringApplication.run(LivingsongjiangApplication.class, args);
	}
	////https://blog.csdn.net/qq_20989105/article/details/78934953
	//http://114.67.143.206:8080/testjpa-0.0.1-SNAPSHOT/UserMessageControl/getMessage
	//继承SpringBootServletInitializer，实现这个方法
	//extends SpringBootServletInitializer
//@Override
//protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//	return application.sources(LivingsongjiangApplication.class);
//}
}

