/**
 * 
 */
package com.example.service;

import java.util.List;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import com.example.repository.HibernateCustomerRepositoryImpl;

/**
 * @author uvashish
 *
 */
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository repository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.example.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return repository.findAll();
	}
}
