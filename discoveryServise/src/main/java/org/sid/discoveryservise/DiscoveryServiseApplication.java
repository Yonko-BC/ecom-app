package org.sid.discoveryservise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiseApplication.class, args);
	}

}
