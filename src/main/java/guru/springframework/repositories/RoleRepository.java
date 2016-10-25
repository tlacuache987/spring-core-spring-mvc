package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.security.Role;

/**
 * Created by xvhx
 */
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
