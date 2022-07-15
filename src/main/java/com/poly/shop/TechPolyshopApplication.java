package com.poly.shop;

import com.poly.shop.config.StorageProperties;
import com.poly.shop.service.StorageService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class TechPolyshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechPolyshopApplication.class, args);
	}
	@Bean
	CommandLineRunner init(StorageService storeService) {
		return (args->{
			storeService.init();
		});
	}
}
