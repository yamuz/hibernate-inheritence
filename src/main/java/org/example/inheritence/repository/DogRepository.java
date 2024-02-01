package org.example.inheritence.repository;

import org.example.inheritence.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by Almaz on 01.02.2024
 */
@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
}
