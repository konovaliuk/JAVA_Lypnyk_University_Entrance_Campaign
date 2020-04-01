package com.pis.vstup.persistance.interfaces;

import com.pis.vstup.persistance.entities.Users;
import com.pis.vstup.persistance.entities.Usertype;

import java.util.List;
import java.util.Optional;

public interface IUsertype {

    List<Usertype> findAll();

    Optional<Usertype> findByTypeId(Integer typeID);

    List<Users> findByType(String type);

}
