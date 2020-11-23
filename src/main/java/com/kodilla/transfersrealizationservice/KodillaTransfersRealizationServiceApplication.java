package com.kodilla.transfersrealizationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@EnableDiscoveryClient
@SpringBootApplication
public class KodillaTransfersRealizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaTransfersRealizationServiceApplication.class, args);
	}

}
