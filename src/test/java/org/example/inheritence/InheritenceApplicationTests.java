package org.example.inheritence;

import org.example.inheritence.repository.DogRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.BEFORE_TEST_METHOD;

@SpringBootTest
class InheritenceApplicationTests {

    @Autowired
    DogRepository dogRepository;

    @Test
    @Sql(scripts = {"/dogs_insert.sql"}, executionPhase = BEFORE_TEST_METHOD)
    void getDogs() {
        assertEquals(dogRepository.findAll().isEmpty(), false);
    }
}
