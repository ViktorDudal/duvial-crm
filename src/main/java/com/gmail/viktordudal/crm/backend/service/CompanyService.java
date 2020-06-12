package com.gmail.viktordudal.crm.backend.service;

import com.gmail.viktordudal.crm.backend.entity.Company;
import com.gmail.viktordudal.crm.backend.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    public List<Company> findAll() {
        return companyRepository.findAll();
    }
}
