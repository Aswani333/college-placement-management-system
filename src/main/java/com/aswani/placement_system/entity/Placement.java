package com.aswani.placement_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "placements")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String companyName;
    private String role;
    private double packageOffered;
    private String placementStatus;

    public Placement() {
    }

    public Placement(Long id, String studentName, String companyName,
                     String role, double packageOffered, String placementStatus) {
        this.id = id;
        this.studentName = studentName;
        this.companyName = companyName;
        this.role = role;
        this.packageOffered = packageOffered;
        this.placementStatus = placementStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getPackageOffered() {
        return packageOffered;
    }

    public void setPackageOffered(double packageOffered) {
        this.packageOffered = packageOffered;
    }

    public String getPlacementStatus() {
        return placementStatus;
    }

    public void setPlacementStatus(String placementStatus) {
        this.placementStatus = placementStatus;
    }
}