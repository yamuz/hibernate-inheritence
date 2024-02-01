package org.example.inheritence.repository;

import org.example.inheritence.model.Animal;
import org.example.inheritence.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by Almaz on 01.02.2024
 */
@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {

}
