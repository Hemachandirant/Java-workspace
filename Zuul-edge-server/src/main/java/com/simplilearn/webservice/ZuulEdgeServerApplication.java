package com.simplilearn.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulEdgeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEdgeServerApplication.class, args);
	}

}
