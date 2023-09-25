package com.surya.SBMS_AdminService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SbmsAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsAdminServiceApplication.class, args);
	}

}
