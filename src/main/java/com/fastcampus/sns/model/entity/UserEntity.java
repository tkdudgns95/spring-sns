package com.fastcampus.sns.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class UserEntity {

    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    public Object getPassword() {
    }

    public void setUserName(String userName) {
    }

    public void setId(int i) {
    }

    public void setPassword(String password) {

    }
}
