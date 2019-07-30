package com.codeclan.homework.FileService.repositories;

import com.codeclan.homework.FileService.models.File;
import com.codeclan.homework.FileService.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
