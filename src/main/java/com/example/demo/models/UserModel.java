package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserModel implements Identifiable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private String name;
    private String lastName;

    public UserModel() {
    }

    public UserModel(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
