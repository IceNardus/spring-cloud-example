package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class EurekaClientProApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProApplication.class, args);
	}


}
