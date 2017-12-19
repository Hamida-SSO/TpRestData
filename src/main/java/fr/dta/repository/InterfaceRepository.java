package fr.dta.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.dta.model.Customer;

@RepositoryRestResource(collectionResourceRel= "customer", path = "customer")
public interface InterfaceRepository extends PagingAndSortingRepository<Customer, Long>{
	List<Customer> findByLastName(String lastName);
	
}
