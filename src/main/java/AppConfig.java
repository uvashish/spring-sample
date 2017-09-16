import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.repository.CustomerRepository;
import com.example.repository.HibernateCustomerRepositoryImpl;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;

/**
 * 
 */

/**
 * @author uvashish
 *
 */
@Configuration
@ComponentScan({"com.example"})
public class AppConfig {

	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		//CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		//return customerService;
		return new CustomerServiceImpl();
	}
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}
