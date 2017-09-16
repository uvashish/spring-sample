import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;

/**
 * 
 */

/**
 * @author uvashish
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
	}

	
}
