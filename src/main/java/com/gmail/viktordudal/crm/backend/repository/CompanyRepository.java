package com.gmail.viktordudal.crm.backend.repository;

import com.gmail.viktordudal.crm.backend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
