package com.pis.vstup.persistance.interfaces;

import com.pis.vstup.persistance.entities.Users;

import java.util.List;
import java.util.Optional;

public interface IUsers {

    List<Users> findAll();

    Optional<Users> findById(Integer userID);

    List<Users> findByLogin(String login);

    Users save(Users users);

}
