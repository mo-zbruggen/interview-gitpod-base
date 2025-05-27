package com.example.resource.controller;

import com.example.resource.model.LearningResource;
import com.example.resource.service.LearningResourceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class LearningResourceController {
    private final LearningResourceService service;

    public LearningResourceController(LearningResourceService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<LearningResource> create(@RequestBody LearningResource resource) {
        return ResponseEntity.ok(service.save(resource));
    }

    @GetMapping
    public List<LearningResource> getAll() {
        return service.getAll();
    }
 

    // TODO: Add in GET for individual LearningResource via ID

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    // TODO: Add in DELETE for all LearningResources



    @GetMapping("/search")
    public List<LearningResource> searchByTag(@RequestParam String tag) {
        return service.searchByTag(tag);
    }
}