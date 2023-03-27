package com.example.blockchainsimulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlockchainSimulationApplication {

	public static void main(String[] args) {
		System.out.println("Blockchain Simulation Backend is running...");
		SpringApplication.run(BlockchainSimulationApplication.class, args);
		
	}

}
