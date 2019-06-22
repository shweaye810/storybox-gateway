package com.ss.storyboxzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableZuulProxy
@EnableResourceServer
public class StoryboxZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoryboxZuulApplication.class, args);
	}

}
