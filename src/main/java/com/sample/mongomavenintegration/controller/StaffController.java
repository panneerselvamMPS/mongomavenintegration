package com.sample.mongomavenintegration.controller;


import com.sample.mongomavenintegration.entity.Staff;
import com.sample.mongomavenintegration.service.StaffService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/displayAll")
    public List<Staff> getAllStaff(){
        return staffService.getAllStaff();
    }

    @GetMapping("/display/{id}")
    public Staff getStaffById(@PathVariable("id") int id){
        return staffService.getStaffById(id);
    }

    @PostMapping("/save")
    public Staff saveStaff(@RequestBody Staff staff){
        return staffService.saveStaff(staff);
    }


}
