package com.pis.vstup.persistance.repositories;

import com.pis.vstup.persistance.entities.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<Users, Integer> {

    List<Users> findByLogin(String login);

}
