package com.codeclan.homework.FileService.repositories;

import com.codeclan.homework.FileService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
