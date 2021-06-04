package com.cg.vegetableseller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.vegetableseller.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
