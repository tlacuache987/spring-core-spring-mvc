package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Customer;

/**
 * Created by xvhx
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
