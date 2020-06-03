package com.codegym.furama.service;

import com.codegym.furama.model.StaffModel.LevelModel.Level;

import java.util.ArrayList;
import java.util.List;

public interface LevelService {
    Iterable<Level> findAllLevel();
    Level findLevelById(int id);
}
