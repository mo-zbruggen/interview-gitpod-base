package com.example.resource.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LearningResourceTest {

    @Test
    void testGetterSetters() {
        LearningResource resource = new LearningResource();

        // ID
        Long testId = 100L;
        resource.setId(testId);
        assertEquals(testId, resource.getId(), "Resource ID not matching set");

        // Title
        String testTitle = "Resource-1";
        resource.setTitle(testTitle);
        assertEquals(testTitle, resource.getTitle(), "Resource title not matching set");

        // Description
        String testDesription = "This is my test resource";
        resource.setDescription(testDesription);
        assertEquals(testDesription, resource.getDescription(), "Resource description not matching set");

        // Link
        String testLink = "http://example.org/resource-1";
        resource.setLink(testLink);
        assertEquals(testLink, resource.getLink(), "Resource link not matching set");

        // Status
        LearningResource.Status testStatus = LearningResource.Status.TO_LEARN;
        resource.setStatus(testStatus);
        assertEquals(testStatus, resource.getStatus(), "Resource status not matching set");

        // Tags
        List<String> testTags = List.of("tag1", "tag2", "tag3");
        resource.setTags(testTags);
        assertEquals(testTags, resource.getTags(), "Resource tags not matching set");
    }
  
}