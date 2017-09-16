/**
 * 
 */
package com.example.service;

import java.util.List;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

/**
 * @author uvashish
 *
 */
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.example.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	
}
