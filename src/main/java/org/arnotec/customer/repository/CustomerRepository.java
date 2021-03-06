package org.arnotec.customer.repository;

import org.arnotec.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
