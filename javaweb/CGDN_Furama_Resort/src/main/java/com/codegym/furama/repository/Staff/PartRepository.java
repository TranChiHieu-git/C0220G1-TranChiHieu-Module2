package com.codegym.furama.repository;

import com.codegym.furama.model.StaffModel.PartModel.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepository extends JpaRepository<Part, Integer> {
}
