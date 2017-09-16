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

	/** member level injection*/
//	@Autowired
	private CustomerRepository customerRepository;
	
//	public CustomerServiceImpl() {
//	}
	
	/** constructor level injection*/
//	@Autowired
//	public CustomerServiceImpl( CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}
	
	/** setter level injection*/
//  1. used for setter injection when using xml config 
//  2. OR @Autowired for setter level injection	
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
