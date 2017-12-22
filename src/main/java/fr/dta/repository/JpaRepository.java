package fr.dta.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.dta.model.Customer;

@RepositoryRestResource(collectionResourceRel= "customer", path = "customer")
public interface JpaRepository extends PagingAndSortingRepository<Customer, Long>{
	
	List<Customer> findByLastName(@Param("lastname") String lastName);
	
//	List<Customer> findByEmailSuffix(@Param("mailsuffix") String mail);
//	List<Customer> findByEmail(@Email String mail);
//	
//	List<Customer> findByFirstnameAndLastname (@Param("lastname") String lastName, @Param("firstname") String firstName);
}