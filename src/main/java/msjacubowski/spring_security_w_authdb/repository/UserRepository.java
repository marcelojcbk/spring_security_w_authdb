package msjacubowski.spring_security_w_authdb.repository;

import org.springframework.data.repository.CrudRepository;

import msjacubowski.spring_security_w_authdb.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
   User findByUsername (String username);
}
