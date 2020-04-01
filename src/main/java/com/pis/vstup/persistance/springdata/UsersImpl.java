package com.pis.vstup.persistance.springdata;

import com.pis.vstup.persistance.entities.Users;
import com.pis.vstup.persistance.interfaces.IUsers;
import com.pis.vstup.persistance.repositories.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository("UsersService")
@Transactional
@AllArgsConstructor
public class UsersImpl implements IUsers {

    private final UsersRepository usersRepository;

    public List<Users> findAll() {
        return (List<Users>) usersRepository.findAll();
    }

    public Optional<Users> findById(Integer userId) {
        return usersRepository.findById(userId);
    }

    public List<Users> findByLogin(String login) {
        return usersRepository.findByLogin(login);
    }

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }

}
