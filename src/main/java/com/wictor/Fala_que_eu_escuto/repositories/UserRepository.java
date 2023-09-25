package com.wictor.Fala_que_eu_escuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wictor.Fala_que_eu_escuto.domains.Client;
import com.wictor.Fala_que_eu_escuto.domains.User;
import com.wictor.Fala_que_eu_escuto.dtos.UserDto;

public interface UserRepository extends JpaRepository<User, Long> {

    Client save(UserDto data);
    
}
