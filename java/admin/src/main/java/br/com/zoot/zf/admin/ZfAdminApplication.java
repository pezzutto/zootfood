package br.com.zoot.zf.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ZfAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZfAdminApplication.class, args);
	}

}
