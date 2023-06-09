package in.ineuron.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ineuron.entity.Order;
import in.ineuron.entity.User;
import in.ineuron.repo.OrderRepo;
import in.ineuron.repo.UserRepo;

import javax.transaction.Transactional;
@Component
@Transactional
public class MainRunner implements CommandLineRunner {
	@Autowired
	private UserRepo userRepository;
	@Autowired
	private OrderRepo orderRepository;

	@Override
	public void run(String... args) throws Exception {
	
		/*
		 * User user =new User(null,"hyder",null);
		 * 
		 * Order order1=new Order(null,"bag",user); Order order2=new
		 * Order(null,"mobile",user); Order order3=new Order(null,"car",user);
		 * 
		 * List<Order> list = List.of(order1,order2,order3); user.setOrders(list); User
		 * save = userRepository.save(user); System.out.println(save);
		 */
    
		User user = userRepository.getById((long) 5);
		System.out.println("user "+ user);
		System.out.println("Orders "+ user.getOrders());
		
		System.out.println("----------------------------");
            List<Order> user2 = orderRepository.findByUser(user);
            System.out.println("order "+user2.toString());
		
		
		

	}

}