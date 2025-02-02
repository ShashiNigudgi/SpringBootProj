package com.example.SpringbootProj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootProj1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context1 = SpringApplication.run(SpringbootProj1Application.class, args);


		Vehicle v1 = context1.getBean(Vehicle.class);
		//Vehicle v2 = context1.getBean(Vehicle.class);
//		int store = v1.test();
//		int store2 = v2.test();
//		System.out.println("the stored vehicle number is " +store);
//		System.out.println("the stored vehicle number is " +store2);

		//check if both the instance are same ?

		//System.out.println(v1 == v2);

		v1.test();

	}


}
