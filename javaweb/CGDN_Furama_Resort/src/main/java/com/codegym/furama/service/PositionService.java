package com.codegym.furama.service;

import com.codegym.furama.model.StaffModel.PositionModel.Position;

public interface PositionService {
    Iterable<Position> findAllPos();

    Position findPosById(int id);
}
