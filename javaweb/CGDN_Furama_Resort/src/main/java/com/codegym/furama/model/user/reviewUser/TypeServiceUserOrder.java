package com.codegym.furama.model.user.reviewUser;

import javax.persistence.*;

@Entity
@Table(name = "typeservice")
public class TypeService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nameService;

    public TypeService() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }
}
