package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "purchase")
    private Long purchase;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (id=" + id + ", name=" + name + ", email=" + email + ")";
    }
}
