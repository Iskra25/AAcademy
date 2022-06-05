package com.aacademy.aacademy.repository;

import com.aacademy.aacademy.entyty.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
