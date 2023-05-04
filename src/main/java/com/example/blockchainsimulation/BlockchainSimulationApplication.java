package com.example.blockchainsimulation;

//import com.example.blockchainsimulation.dbmigration.DatabaseMigration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlockchainSimulationApplication {

	public static void main(String[] args) {
		//System.out.println("Blockchain Simulation Backend is running...");


		//new DatabaseMigration(DatabaseMigration.configure("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres"));

		SpringApplication.run(BlockchainSimulationApplication.class, args);

	}

}
