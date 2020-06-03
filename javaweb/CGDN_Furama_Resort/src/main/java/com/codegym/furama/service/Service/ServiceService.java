package com.codegym.furama.service.Service;

import com.codegym.furama.model.ServiceModel.Service;
import com.codegym.furama.repository.Service.ServiceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface ServiceService {
    Page<Service> findAllService(Pageable pageable);
    Page<Service> findAllServiceByName(String key,Pageable pageable);
    Iterable<Service> findAllService();
    Service findServiceById(String id);

    void saveService(Service service);

    void deleteService(Service service);
}
