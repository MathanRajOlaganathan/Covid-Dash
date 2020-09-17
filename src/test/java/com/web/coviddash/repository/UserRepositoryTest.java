package com.web.coviddash.repository;

import com.web.coviddash.entity.User;
import com.web.coviddash.entity.UserRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;


    @Test
    public void testFindByName() {
        entityManager.persist(new User(null,"test@gmail.com","password","xxx","yyy", UserRole.USER,false,false));

        User user = userRepository.findByEmail("test@gmail.com");
        assertEquals("xxx", user.getFirstName());
    }
}
