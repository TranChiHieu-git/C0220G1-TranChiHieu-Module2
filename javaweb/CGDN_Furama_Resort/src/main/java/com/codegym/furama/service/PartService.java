package com.codegym.furama.service;

import com.codegym.furama.model.StaffModel.PartModel.Part;

public interface PartService {
    Iterable<Part> findAllPart();

    Part findPartById(int id);
}
