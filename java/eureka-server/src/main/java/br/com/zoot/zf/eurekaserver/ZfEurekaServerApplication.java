package br.com.zoot.zf.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZfEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZfEurekaServerApplication.class, args);
	}

}
