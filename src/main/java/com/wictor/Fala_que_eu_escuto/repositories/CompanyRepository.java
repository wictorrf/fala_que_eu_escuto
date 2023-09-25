package com.wictor.Fala_que_eu_escuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wictor.Fala_que_eu_escuto.domains.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    
}
