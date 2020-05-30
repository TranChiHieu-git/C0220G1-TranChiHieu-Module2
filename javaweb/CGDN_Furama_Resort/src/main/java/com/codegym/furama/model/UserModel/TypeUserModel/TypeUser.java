package com.codegym.furama.model.UserModel.TypeUserModel;

import com.codegym.furama.model.UserModel.User;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "typeusers")
public class TypeUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTypeUser;
    private String nameTypeUser;

    @OneToMany(mappedBy = "typeUser")
    public List<User> user;

    public TypeUser() {
    }

    public TypeUser(String nameTypeUser) {
        this.nameTypeUser = nameTypeUser;
    }

    public int getIdTypeUser() {
        return idTypeUser;
    }

    public void setIdTypeUser(int idTypeUser) {
        this.idTypeUser = idTypeUser;
    }

    public String getNameTypeUser() {
        return nameTypeUser;
    }

    public void setNameTypeUser(String nameTypeUser) {
        this.nameTypeUser = nameTypeUser;
    }
}
