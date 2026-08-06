package com.aswani.placement_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aswani.placement_system.entity.Placement;
import com.aswani.placement_system.service.PlacementService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/placements")
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    // Add Placement
    @PostMapping
    public Placement addPlacement(@RequestBody Placement placement) {
        return placementService.savePlacement(placement);
    }

    // Get All Placements
    @GetMapping
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }
}