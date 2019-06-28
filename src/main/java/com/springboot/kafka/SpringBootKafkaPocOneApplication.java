package com.springboot.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ="com.springboot.kafka.*")
public class SpringBootKafkaPocOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaPocOneApplication.class, args);
	}

}
