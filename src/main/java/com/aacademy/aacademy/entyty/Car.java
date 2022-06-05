package com.aacademy.aacademy.entyty;

import javax.persistence.*;

@Entity
@Table(name= "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private Integer year;

    @ManyToOne
    private User user;
}

