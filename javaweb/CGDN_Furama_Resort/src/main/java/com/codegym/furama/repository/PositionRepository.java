package com.codegym.furama.repository;

import com.codegym.furama.model.StaffModel.PositionModel.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}
