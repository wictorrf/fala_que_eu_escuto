package com.wictor.Fala_que_eu_escuto.domains;

import java.time.LocalDate;

import com.wictor.Fala_que_eu_escuto.dtos.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client")
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private LocalDate dataNascimento;

    public Client(UserDto data) {
        this.name = data.name();
        this.email = data.email();
        this.password = data.password();
        this.dataNascimento = data.dataNascimento();
    }
    
}
