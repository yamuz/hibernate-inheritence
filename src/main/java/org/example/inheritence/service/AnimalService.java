package org.example.inheritence.service;

import org.example.inheritence.model.Animal;

import java.util.Optional;

/**
 * created by Almaz on 01.02.2024
 */
public interface AnimalService {
    void save(Animal animal);

    Optional<Animal> getById(Long id);

}
