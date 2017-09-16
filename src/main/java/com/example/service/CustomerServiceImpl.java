/**
 * 
 */
package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

/**
 * @author uvashish
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	/** member level injection and auto wiring*/
	@Autowired
	private CustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see com.example.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	
}
