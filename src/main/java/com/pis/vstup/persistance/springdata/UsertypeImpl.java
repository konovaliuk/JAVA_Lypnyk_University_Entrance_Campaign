package com.pis.vstup.persistance.springdata;

import com.pis.vstup.persistance.entities.Users;
import com.pis.vstup.persistance.entities.Usertype;
import com.pis.vstup.persistance.interfaces.IUsertype;
import com.pis.vstup.persistance.repositories.UsertypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository("UsertypeService")
@Transactional
@AllArgsConstructor
public class UsertypeImpl implements IUsertype {
    
    private final UsertypeRepository usertypeRepository;

    public List<Usertype> findAll() {
        return (List<Usertype>) usertypeRepository.findAll();
    }

    public Optional<Usertype> findByTypeId(Integer typeId) {
        return usertypeRepository.findById(typeId);
    }

    public List<Users> findByType(String type) {
        return usertypeRepository.findByType(type).get().getUsers();
    }

}
