package com.curso.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackages = {"com.curso.hrpayroll", "com.curso.hr"})
public class HrPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
