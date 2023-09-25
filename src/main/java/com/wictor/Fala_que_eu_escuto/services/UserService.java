package com.wictor.Fala_que_eu_escuto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wictor.Fala_que_eu_escuto.domains.Client;
import com.wictor.Fala_que_eu_escuto.domains.Company;
import com.wictor.Fala_que_eu_escuto.domains.User;
import com.wictor.Fala_que_eu_escuto.domains.Usertype;
import com.wictor.Fala_que_eu_escuto.dtos.UserDto;
import com.wictor.Fala_que_eu_escuto.repositories.ClientRepository;
import com.wictor.Fala_que_eu_escuto.repositories.CompanyRepository;
import com.wictor.Fala_que_eu_escuto.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CompanyRepository companyRepository;

    public User registerUser(UserDto data) throws Exception {
        if (data.userType() == Usertype.CLIENT) {
            return registerClient(data);
        } else if (data.userType() == Usertype.COMPANY) {
            return registerCompany(data);
        } else {
            throw new Exception("Tipo de usuário desconhecido: " + data.userType());
        }
    }

    private User createUserFromData(UserDto data) {
        User newUser = new User(data);
        newUser.setName(data.name());
        newUser.setEmail(data.email());
        newUser.setPassword(data.password());
        return newUser;
    }

    private User registerClient(UserDto data) {
        Client newClient = new Client(data);
        User newUser = createUserFromData(data);
        clientRepository.save(newClient);
        userRepository.save(newUser);
        return newUser;
    }

    private User registerCompany(UserDto data) {
        Company newCompany = new Company(data);
        User newUser = createUserFromData(data);
        companyRepository.save(newCompany);
        userRepository.save(newUser);
        return newUser;
    }
}
