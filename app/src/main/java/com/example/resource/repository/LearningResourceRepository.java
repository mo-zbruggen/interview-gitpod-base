package com.example.resource.repository;

import com.example.resource.model.LearningResource;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LearningResourceRepository extends JpaRepository<LearningResource, Long> {
    List<LearningResource> findByTagsContaining(String tag);
}