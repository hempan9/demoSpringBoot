package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct =SpringApplication.run(DemoSpringBootApplication.class, args);
	alien a = ct.getBean(alien.class);
	a.show();

	}

}
