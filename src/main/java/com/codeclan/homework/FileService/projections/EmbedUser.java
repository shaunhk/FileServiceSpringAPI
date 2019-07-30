package com.codeclan.homework.FileService.projections;

import com.codeclan.homework.FileService.models.File;
import com.codeclan.homework.FileService.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = File.class)
public interface EmbedUser {
    String getTitle();
    User getUser();
}
