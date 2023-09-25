package com.wictor.Fala_que_eu_escuto.domains;

import com.wictor.Fala_que_eu_escuto.dtos.UserDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "company")
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Company {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

    private String password;

    private String cnpj;

    public Company(UserDto data) {
        this.name = data.name();
        this.email = data.email();
        this.password = data.password();
        this.cnpj = data.cnpj();
    }

    
}
