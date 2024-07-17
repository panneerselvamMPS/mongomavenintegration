package com.sample.mongomavenintegration.service;


import com.sample.mongomavenintegration.entity.Staff;
import com.sample.mongomavenintegration.repository.StaffRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public List<Staff> getAllStaff(){
        return staffRepository.findAll();
    }

    public Staff saveStaff(Staff staff){
    	//System.out.println(staff.getId());
    	System.out.println(staff.getStaffName());
    	System.out.println(staff.getStaffEmail());
    	System.out.println(staff.getStaffLocation());
        staff.setId(ThreadLocalRandom.current().nextInt(1, 501)); 
        return staffRepository.save(staff);
    }

    public Staff getStaffById(int id){
        return staffRepository.findById(id).get();
    }

}
