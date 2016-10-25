package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.User;

/**
 * Created by xvhx
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
