package com.codegym.furama.service;

import com.codegym.furama.model.StaffModel.LevelModel.Level;
import com.codegym.furama.repository.LevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelServiceImpl implements LevelService {
    @Autowired
    LevelRepository levelRepository;

    @Override
    public Iterable<Level> findAllLevel() {
        return levelRepository.findAll();
    }

    @Override
    public Level findLevelById(int id) {
        return levelRepository.findById(id).orElse(null);
    }
}
