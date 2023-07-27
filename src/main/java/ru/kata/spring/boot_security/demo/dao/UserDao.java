package ru.kata.spring.boot_security.demo.dao;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kata.spring.boot_security.demo.models.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

//@Repository
public interface UserDao {

    User findByUsername(String username);
    User findById (Long id);
    List<User> index();
    List<User> userList(int number);

    Set<Long> userRolesId(User user);

    //void save(User user, BCryptPasswordEncoder bCryptPasswordEncoder, Set roles);
    void save(User user, Set roles);

    void delete(Long id);

    //void update(Long id, User user, BCryptPasswordEncoder bCryptPasswordEncoder, Set roles);
    void update(Long id, User user, Set roles);
}
