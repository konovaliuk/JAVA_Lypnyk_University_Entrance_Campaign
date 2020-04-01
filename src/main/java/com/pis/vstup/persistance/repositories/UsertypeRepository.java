package com.pis.vstup.persistance.repositories;

import com.pis.vstup.persistance.entities.Usertype;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsertypeRepository extends CrudRepository<Usertype, Integer> {

    Optional<Usertype> findByType(String type);

}
