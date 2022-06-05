package com.aacademy.aacademy.entyty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table( name ="users")

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name="first_name", nullable = false,length=50,unique = true)
    private String FirstName;

    @NotNull
    @Column(name="last_name", nullable = false,length=50)
    private String lastName;

    @NotNull
    @Column(name="age", nullable = false)
    private Integer age;

    @OneToMany(mappedBy = "user")
    private List<Car> cars;


}
