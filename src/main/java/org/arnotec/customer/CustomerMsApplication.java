package org.arnotec.customer;

import org.arnotec.customer.entity.Customer;
import org.arnotec.customer.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerMsApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(new Customer(null, "Arnaud", "arnaud@gmail.com"));
            customerRepository.save(new Customer(null, "Judith", "judith@gmail.com"));
            customerRepository.save(new Customer(null, "Enzo", "enzo@gmail.com"));

            customerRepository.findAll().forEach(customer -> {
                System.out.println(customer.toString());
            });
        };
    }

}
