package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="authorities")
public class Authority {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name="username")
    private User user;
    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;
}
