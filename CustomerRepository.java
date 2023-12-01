package com.example.bootcore;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	
    Customer findById(long id);
 
    
    List<Customer> findByName(String name);
 
    
    Customer findByEmail(String email);
 
    
    List<Customer> findByOrdersIsNotNull();
 
    
    List<Customer> findByOrdersIsNull();
 
   
    List<Customer> findByAddressCity(String city);
 
    
    List<Customer> findByAddressZipCode(String zipCode);
 
    
    List<Customer> findByOrdersOrderStatus(OrderStatus orderStatus);

}
