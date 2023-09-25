package com.wictor.Fala_que_eu_escuto.dtos;

import java.time.LocalDate;

import com.wictor.Fala_que_eu_escuto.domains.Usertype;

public record UserDto(Long id, String name, String email, String password, String cnpj, LocalDate dataNascimento, Usertype userType) {
    
}
