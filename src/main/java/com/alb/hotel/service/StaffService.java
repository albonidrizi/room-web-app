package com.alb.hotel.service;

import java.util.List;

import com.alb.hotel.data.StaffRepository;
import com.alb.hotel.models.StaffMember;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}