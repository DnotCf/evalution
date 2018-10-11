package com.myeval;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * author:tangshun
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.myeval.mapper")
@ComponentScan(basePackages = "com.myeval")
@EnableSwagger2
@Controller
public class Application {
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
	/*@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello中文";
	}*/


	/*@Bean
	public StringHttpMessageConverter stringHttpMessageConverter() {
		StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(Charset.forName("utf-8"));

		return  stringHttpMessageConverter;
	}*/
}
