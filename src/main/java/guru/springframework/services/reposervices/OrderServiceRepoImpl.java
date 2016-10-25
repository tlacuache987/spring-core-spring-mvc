package guru.springframework.services.reposervices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.domain.Order;
import guru.springframework.repositories.OrderRepository;
import guru.springframework.services.OrderService;

/**
 * Created by xvhx
 */
@Service
@Profile({ "springdatajpa" })
public class OrderServiceRepoImpl implements OrderService {

	private OrderRepository orderRepository;

	@Autowired
	public void setProductRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public List<?> listAll() {
		List<Order> orders = new ArrayList<>();
		orderRepository.findAll().forEach(orders::add); // fun with Java 8
		return orders;
	}

	@Override
	public Order getById(Integer id) {
		return orderRepository.findOne(id);
	}

	@Override
	public Order saveOrUpdate(Order domainObject) {
		return orderRepository.save(domainObject);
	}

	@Override
	public void delete(Integer id) {
		orderRepository.delete(id);
	}
}
