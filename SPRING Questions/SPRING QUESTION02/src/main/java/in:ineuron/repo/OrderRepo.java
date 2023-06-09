package in.ineuron.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.entity.Order;
import in.ineuron.entity.User;

public interface OrderRepo extends JpaRepository<Order, Long> {
       public List<Order> findByUser(User user);
	
}