package com.example.tescospringcore;

import com.service.BankingService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TescoSpringCoreApplication {

	public static void main(String[] args) {

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("/beans.xml");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("/beans.xml");
		BankingService bs = (BankingService)ctx.getBean("service");
		System.out.println("HashCode 1 "+bs.hashCode());
		BankingService bs1 = (BankingService)ctx.getBean("service");
		System.out.println("HashCode 2 "+bs1.hashCode());

		System.out.println(bs.calculate(4389));
		ctx.close();
	}
}
