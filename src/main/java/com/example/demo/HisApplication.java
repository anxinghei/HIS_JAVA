package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class HisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HisApplication.class, args);
	}

}
