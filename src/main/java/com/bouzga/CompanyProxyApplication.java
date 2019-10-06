package com.bouzga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@SpringBootApplication
public class CompanyProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyProxyApplication.class, args);
	}

}
