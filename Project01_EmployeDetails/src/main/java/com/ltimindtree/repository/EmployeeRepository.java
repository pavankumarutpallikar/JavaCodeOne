package com.ltimindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltimindtree.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
