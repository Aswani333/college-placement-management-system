package com.aswani.placement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aswani.placement_system.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}