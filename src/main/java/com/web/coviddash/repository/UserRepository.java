package com.web.coviddash.repository;

import com.web.coviddash.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);
}
