package com.aswani.placement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aswani.placement_system.entity.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {

}