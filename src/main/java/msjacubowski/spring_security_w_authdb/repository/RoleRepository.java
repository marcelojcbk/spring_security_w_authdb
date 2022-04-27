package msjacubowski.spring_security_w_authdb.repository;

import org.springframework.data.repository.CrudRepository;

import msjacubowski.spring_security_w_authdb.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
    Role findByRole(String role);
}
