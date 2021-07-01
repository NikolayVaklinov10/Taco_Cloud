package com.nikolayvaklinov.tacocloud.data;

import com.nikolayvaklinov.tacocloud.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
