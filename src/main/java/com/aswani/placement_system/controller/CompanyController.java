package com.aswani.placement_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aswani.placement_system.entity.Company;
import com.aswani.placement_system.service.CompanyService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    // Add Company
    @PostMapping
    public Company addCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    // Get All Companies
    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }
}