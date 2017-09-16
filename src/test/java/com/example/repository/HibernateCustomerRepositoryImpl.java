/**
 * 
 */
package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Customer;

/**
 * @author uvashish
 *
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.example.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();
		customer.setFirstName("test1");
		customer.setLastName("lastname");

		customers.add(customer);

		return customers;
	}
}
