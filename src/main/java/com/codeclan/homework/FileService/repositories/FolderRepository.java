package com.codeclan.homework.FileService.repositories;

import com.codeclan.homework.FileService.models.Folder;
import com.codeclan.homework.FileService.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
