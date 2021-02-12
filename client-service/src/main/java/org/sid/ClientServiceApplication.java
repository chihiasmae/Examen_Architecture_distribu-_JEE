package org.sid;


import org.sid.entities.Client;
import org.sid.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}
	
	 @Bean
	    CommandLineRunner start(ClientRepository customerRepository) {
	        return args -> {
	            customerRepository.save(new Client(null,2L, "asmae", "asmae@gmail.com"));
	            customerRepository.save(new Client(null,4L, "ikram", "wafae@gmail.com"));
	            customerRepository.save(new Client(null,5L, "wafae", "ikram@gmail.com"));
	            customerRepository.findAll().forEach(System.out::println);
	        };
	    }

}
