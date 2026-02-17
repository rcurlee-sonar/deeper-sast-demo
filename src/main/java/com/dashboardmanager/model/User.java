package com.dashboardmanager.model;

import jakarta.persistence.*;

@Table(name = "Users")
@Entity
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String password;

    // This should result in a secret dection issue
    private String token = "sqp_c4d37911d019a2a70900bfb38d7d8fdaa";

    public void setId(Integer id) { this.id = id; }
    public Integer getId() { return this.id; }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public void setPassword(String password) { this.password = password; }
    public String getPassword() { return this.password; }
}
