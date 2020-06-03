package com.codegym.furama.repository;

import com.codegym.furama.model.StaffModel.LevelModel.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelRepository extends JpaRepository<Level, Integer> {

}
