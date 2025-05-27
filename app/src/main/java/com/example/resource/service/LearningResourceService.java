package com.example.resource.service;

import com.example.resource.model.LearningResource;
import com.example.resource.repository.LearningResourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LearningResourceService {
    private final LearningResourceRepository repo;

    public LearningResourceService(LearningResourceRepository repo) {

        this.repo = repo;

        buildDemoPieces();
    }

    public LearningResource save(LearningResource resource) {
        return repo.save(resource);
    }

    public List<LearningResource> getAll() {
        return repo.findAll();
    }

    public Optional<LearningResource> getById(Long id) {
        return repo.findById(id);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    public List<LearningResource> searchByTag(String tag) {
        return repo.findByTagsContaining(tag);
    }


    private void buildDemoPieces() {
        LearningResource demoResource1 = new LearningResource();
        demoResource1.setTitle("Intro to Docker Course!");
        demoResource1.setDescription("A course on the fundamentals of Docker!");
        demoResource1.setLink("http://example.org/docker");
        demoResource1.setStatus(LearningResource.Status.TO_LEARN);
        demoResource1.setTags(List.of("docker", "linux", "containerization"));


        LearningResource demoResource2 = new LearningResource();
        demoResource2.setTitle("Advanced Kubernetes Course");
        demoResource2.setDescription("A high level course on the secrets to Kubernetes");
        demoResource2.setLink("http://example.org/kubernetes");
        demoResource2.setStatus(LearningResource.Status.TO_LEARN);
        demoResource2.setTags(List.of("docker", "kubernetes", "container-orchestration"));


        LearningResource demoResource3 = new LearningResource();
        demoResource3.setTitle("Java Fundamentals");
        demoResource3.setDescription("Fundamentals of Java Programming Language");
        demoResource3.setLink("http://example.org/java");
        demoResource3.setStatus(LearningResource.Status.TO_LEARN);
        demoResource3.setTags(List.of("java", "programming", "backend"));

        repo.saveAll(List.of(demoResource1, demoResource2, demoResource3));
    }
}