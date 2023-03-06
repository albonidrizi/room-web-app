package com.alb.hotel.controllers;

import java.util.List;

import com.alb.hotel.models.StaffMember;
import com.alb.hotel.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaff(){
        return staffService.getAllStaff();
    }
}
