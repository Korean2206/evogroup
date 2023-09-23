package com.app.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    private String username;
    private String password;
    private String email;
    private String fullname;
    private String phone;
    private String address;
    private String photo;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Authority> authorities;
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Order> orders;
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<ProductRate> productRates;
}
