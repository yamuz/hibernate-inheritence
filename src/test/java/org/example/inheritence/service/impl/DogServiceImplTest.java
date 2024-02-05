package org.example.inheritence.service.impl;

import org.example.inheritence.exception.DogNotFoundException;
import org.example.inheritence.model.Dog;
import org.example.inheritence.service.DogService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.BEFORE_TEST_METHOD;

/**
 * created by Almaz on 05.02.2024
 */
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class DogServiceImplTest {

    @Autowired
    DogService dogService;

    @Test
    @Sql(scripts = {"/dogs_insert.sql"}, executionPhase = BEFORE_TEST_METHOD)
    void getDogs() {
        assertEquals(dogService.getDogs().isEmpty(), false);
    }

    @Test
    void findById() {
        Dog dog = assertDoesNotThrow(() -> { return dogService.findById(1L);});
    }
}