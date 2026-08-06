package com.aswani.placement_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aswani.placement_system.entity.Placement;
import com.aswani.placement_system.repository.PlacementRepository;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    // Save Placement
    public Placement savePlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    // Get All Placements
    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }
}