package com.codegym.furama.repository.Service;

import com.codegym.furama.model.ServiceModel.TypeRent.TypeRent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRentRepository extends JpaRepository<TypeRent, Integer> {
}
