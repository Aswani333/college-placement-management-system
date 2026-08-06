package com.aswani.placement_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aswani.placement_system.entity.Company;
import com.aswani.placement_system.repository.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    // Save Company
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    // Get All Companies
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}