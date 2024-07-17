package com.sample.mongomavenintegration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.mongomavenintegration.entity.Staff;

public interface StaffRepository extends MongoRepository<Staff,Integer> {
}
